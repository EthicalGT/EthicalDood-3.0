import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.time.*;
class user_info extends JFrame {
    JTextArea tb1;
    JTextField tb;
    JButton btn,create;
    String mname;
	user_info(){
        InputStream font=user_info.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        Border bottombd=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        JLabel heading=new JLabel("<html>ED User's Accounts</html>");
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
            ResultSet set=state.executeQuery("select * from user_files");
            while(set.next()){
                String fpath=set.getString("filepath");
        JLabel desc=new JLabel();
        desc.setBounds(a,140,300,200);
        desc.setForeground(Color.white);
        desc.setBorder(bottombd);
        this.add(desc);
        Border bdbtn=BorderFactory.createMatteBorder(1,1,1,1,Color.decode("#f7f7f7"));
        Border bd=BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        JLabel lbl=new JLabel("File ID: "+set.getInt("fid"));
        lbl.setBounds(b,140,250,50);
        lbl.setForeground(Color.white);
        lbl.setFont(myfont.deriveFont(15f));
        this.add(lbl);
        JLabel uname=new JLabel("Member Name: "+set.getString("mname"));
        uname.setBounds(b,180,250,50);
        uname.setForeground(Color.white);
        uname.setFont(myfont.deriveFont(15f));
        this.add(uname);
        JLabel lbl2=new JLabel("File Name: "+set.getString("filename"));
        lbl2.setBounds(b,220,250,50);
        lbl2.setForeground(Color.white);
        lbl2.setFont(myfont.deriveFont(15f));
        this.add(lbl2);
        create=new JButton("Submit");
        create.setBounds(c,280,200,40);
        create.setOpaque(true);
        create.setContentAreaFilled(false);
        create.setFont(myfont.deriveFont(15f));
        create.setForeground(Color.white);
        create.setBorder(bdbtn);
        create.setFocusPainted(false);
        this.add(create);
        create.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent a){
                    try{
                File file=new File(fpath);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc1){
                System.out.println(exc1);
            }
            }
        });
        a=a+330;
        b=b+330;
        c=c+330;
    }
        
    }catch(Exception ex){
        System.out.println(ex);
    }
        ImageIcon img=new ImageIcon("images/bg2.jpg");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(1367,768);
        sidebg.setOpaque(true);
        this.add(sidebg);
        this.setTitle("ED Admin- User Information");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    
	public static void main(String[] args) {
		new user_info();
        }
}