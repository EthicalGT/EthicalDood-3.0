import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.time.*;
class user_feedbacks extends JFrame {
    JTextArea tb1;
    JTextField tb;
    JButton btn,create;
    String mname;
	user_feedbacks(){
        InputStream font=user_feedback.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        Border bottombd=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        JLabel heading=new JLabel("<html>ED User's Feedbacks</html>");
        heading.setBounds(420,10,800,120);
        heading.setForeground(Color.white);
        heading.setFont(myboldfont.deriveFont(50f));
        this.add(heading);
        int a=20;
        int b=40;
        int c=65;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
            Statement state=conn.createStatement();
            ResultSet set=state.executeQuery("select * from feedbacks");
            while(set.next()){
        JLabel desc=new JLabel();
        desc.setBounds(a,140,300,200);
        desc.setForeground(Color.white);
        desc.setBorder(bottombd);
        this.add(desc);
        Border bdbtn=BorderFactory.createMatteBorder(1,1,1,1,Color.decode("#f7f7f7"));
        Border bd=BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        JLabel lbl=new JLabel("User Name: "+set.getString("name"));
        lbl.setBounds(b,140,250,50);
        lbl.setForeground(Color.white);
        lbl.setFont(myfont.deriveFont(15f));
        this.add(lbl);
        JLabel uname=new JLabel("User Contact: "+set.getString("contact"));
        uname.setBounds(b,180,250,50);
        uname.setForeground(Color.white);
        uname.setFont(myfont.deriveFont(15f));
        this.add(uname);
        JLabel lbl2=new JLabel("<html>User Message: "+set.getString("message")+"</html>");
        lbl2.setBounds(b,195,250,100);
        lbl2.setForeground(Color.white);
        lbl2.setFont(myfont.deriveFont(15f));
        this.add(lbl2);
        a=a+330;
        b=b+330;
        c=c+330;
    }
    set.close();
    state.close();
    conn.close();
    }catch(Exception ex){
        System.out.println(ex);
    }
        ImageIcon img=new ImageIcon("images/bg2.jpg");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(1367,768);
        sidebg.setOpaque(true);
        this.add(sidebg);
        this.setTitle("ED Admin- User Feedbacks");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    
	public static void main(String[] args) {
		new user_feedbacks();
        }
}