import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
class user_alerts extends JFrame{
    JTextField tb1,tb2,tb3,tb;
    JButton file,insert,alerts;
    JFrame frame;
    Path fsrc,fdest;
    String fname;
    user_alerts(){
        InputStream font=user_insert.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        Border bd=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        this.setTitle("Ethicaldood - Member Alerts");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        JLabel lbl=new JLabel("ED Member Alerts..!");
        lbl.setBounds(760,30,450,50);
        lbl.setForeground(Color.white);
        lbl.setFont(myboldfont.deriveFont(35f));
        this.add(lbl);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
            Statement state=conn.createStatement();
            ResultSet set=state.executeQuery("select * from deleted_files");
            int y=150;
            while(set.next()){
            String msg=set.getString("reason");
        JLabel label=new JLabel("<html>&#x2022;&nbsp;Dear "+msg+" Please try to upload your own contents to avoid copyright issues.</html>");
        label.setBounds(300,y,780,50);
        label.setForeground(Color.GRAY);
        label.setFont(myfont.deriveFont(18f));
        this.add(label);
        y=y+60;
        }
        }catch(Exception ex){
            System.out.println(ex);
        }
        ImageIcon leftimg=new ImageIcon("images/alertbg.jpg");
        JLabel bgframe=new JLabel(leftimg);
        bgframe.setOpaque(true);
        bgframe.setBounds(0,0,1370,768);
        bgframe.setBackground(new Color(51,51,51));
        this.add(bgframe);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new user_alerts();
        
	}
}