import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class python extends JFrame implements ActionListener{
    String path1,path2,path3,path4,path5,path6,path7,path8,path9;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String url="jdbc:mysql://localhost:3306/pythondb";
	public python(){
        this.getContentPane().setBackground(Color.WHITE);
        /*JLabel p1=new JLabel("<html>HTML, short for HyperText Markup Language, is the standard markup language used for creating web pages. It provides the structure and the content of a webpage, defining elements like headings, paragraph, links, images, and more. HTML uses tags to mark up different parts of the content, which are then rendered by web browsers. </html>");
        p1.setBounds(150,80,1100,200);
        p1.setFont(new Font("Arial",Font.PLAIN,15));
        p1.setForeground(Color.WHITE);
        this.add(p1);*/
		JLabel tagline=new JLabel("<html>&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Python</html>");
        tagline.setFont(new Font("Calibri",Font.BOLD,80));
        tagline.setForeground(Color.white);
        tagline.setOpaque(true);
        tagline.setBounds(0,0,1500,150);
        tagline.setBackground(new Color(51,153,255));
        this.add(tagline);
        JLabel ch1=new JLabel("<html>1. Introduction to Basic Python</html>");
        ch1.setFont(new Font("Arial",Font.BOLD,20));
        ch1.setBounds(70,200,400,80);
        ch1.setForeground(Color.BLACK);
        this.add(ch1);
        btn1=new JButton("View");
        btn1.setBounds(95,260,150,50);
        btn1.setBorder(new LineBorder(Color.RED,1));
        btn1.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn1.setFocusPainted(false);//used to remove outline of button text
        this.add(btn1);
        JLabel ch2=new JLabel("<html>2. Working with Strings and Lists</html>");
        ch2.setFont(new Font("Arial",Font.BOLD,20));
        ch2.setBounds(70,300,400,80);
        ch2.setForeground(Color.BLACK);
        this.add(ch2);
        btn2=new JButton("View");
        btn2.setBounds(95,360,150,50);
        btn2.setBorder(new LineBorder(Color.RED,1));
        btn2.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn2.setContentAreaFilled(false);
        btn2.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn2.setFocusPainted(false);//used to remove outline of button text
        this.add(btn2);
        JLabel ch3=new JLabel("<html>3. Tuples, Sets and Dictionaries</html>");
        ch3.setFont(new Font("Arial",Font.BOLD,20));
        ch3.setBounds(70,400,400,80);
        ch3.setForeground(Color.BLACK);
        this.add(ch3);
        btn3=new JButton("View");
        btn3.setBounds(95,460,150,50);
        btn3.setBorder(new LineBorder(Color.RED,1));
        btn3.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn3.setContentAreaFilled(false);
        btn3.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn3.setFocusPainted(false);//used to remove outline of button text
        this.add(btn3);
        JLabel ch4=new JLabel("<html>4. Functions, Modules, Packages</html>");
        ch4.setFont(new Font("Arial",Font.BOLD,20));
        ch4.setBounds(550,200,400,80);
        ch4.setForeground(Color.BLACK);
        this.add(ch4);
        btn4=new JButton("View");
        btn4.setBounds(575,260,150,50);
        btn4.setBorder(new LineBorder(Color.RED,1));
        btn4.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn4.setContentAreaFilled(false);
        btn4.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn4.setFocusPainted(false);//used to remove outline of button text
        this.add(btn4);
        JLabel ch5=new JLabel("<html>5. Python Classes and Objects</html>");
        ch5.setFont(new Font("Arial",Font.BOLD,20));
        ch5.setBounds(550,300,400,80);
        ch5.setForeground(Color.BLACK);
        this.add(ch5);
        btn5=new JButton("View");
        btn5.setBounds(575,360,150,50);
        btn5.setBorder(new LineBorder(Color.RED,1));
        btn5.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn5.setContentAreaFilled(false);
        btn5.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn5.setFocusPainted(false);//used to remove outline of button text
        this.add(btn5);
        JLabel ch9=new JLabel("<html>&nbsp;&nbsp;&nbsp;Python Solved Slips</html>");
        ch9.setFont(new Font("Arial",Font.BOLD,20));
        ch9.setBounds(550,400,400,80);
        ch9.setForeground(Color.BLACK);
        this.add(ch9);
        btn9=new JButton("View");
        btn9.setBounds(575,460,150,50);
        btn9.setBorder(new LineBorder(Color.RED,1));
        btn9.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn9.setContentAreaFilled(false);
        btn9.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn9.setFocusPainted(false);//used to remove outline of button text
        this.add(btn9);
        JLabel ch6=new JLabel("<html>6. Inheritance & its Types</html>");
        ch6.setFont(new Font("Arial",Font.BOLD,20));
        ch6.setBounds(1020,200,400,80);
        ch6.setForeground(Color.BLACK);
        this.add(ch6);
        btn6=new JButton("View");
        btn6.setBounds(1045,260,150,50);
        btn6.setBorder(new LineBorder(Color.RED,1));
        btn6.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn6.setContentAreaFilled(false);
        btn6.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn6.setFocusPainted(false);//used to remove outline of button text
        this.add(btn6);
        JLabel ch7=new JLabel("<html>7. Exception Handling</html>");
        ch7.setFont(new Font("Arial",Font.BOLD,20));
        ch7.setBounds(1020,300,400,80);
        ch7.setForeground(Color.BLACK);
        this.add(ch7);
        btn7=new JButton("View");
        btn7.setBounds(1045,360,150,50);
        btn7.setBorder(new LineBorder(Color.RED,1));
        btn7.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn7.setContentAreaFilled(false);
        btn7.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn7.setFocusPainted(false);//used to remove outline of button text
        this.add(btn7);
        JLabel ch8=new JLabel("<html>8. Python GUI Programming</html>");
        ch8.setFont(new Font("Arial",Font.BOLD,20));
        ch8.setBounds(1020,400,400,80);
        ch8.setForeground(Color.BLACK);
        this.add(ch8);
        btn8=new JButton("View");
        btn8.setBounds(1045,460,150,50);
        btn8.setBorder(new LineBorder(Color.RED,1));
        btn8.setForeground(new Color(153,153,153));
        //btn1.setForeground(Color.WHITE);
        //btn1.setOpaque(false);
        btn8.setContentAreaFilled(false);
        btn8.setBackground(Color.RED);
        //btn1.setBorder(BorderFactory.createLineBorder(Color.RED));
        btn8.setFocusPainted(false);//used to remove outline of button text
        this.add(btn8);
        JLabel creatorline=new JLabel("<html>Crafted with &hearts; by GT</html");
        creatorline.setForeground(Color.white);
        creatorline.setFont(new Font("Arial",Font.PLAIN,15));
        creatorline.setBounds(615,615,200,40);
        this.add(creatorline);
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(635,540,120,50);
        follow.setFont(new Font("Arial",Font.PLAIN,15));
        follow.setForeground(Color.white);
        this.add(follow);
        ImageIcon icon=new ImageIcon("images/instagram.png");
        JLabel instagram=new JLabel(icon);
        instagram.setBounds(530,580,200,40);
        this.add(instagram);
        ImageIcon icon1=new ImageIcon("images/snapchat.png");
        JLabel snapchat=new JLabel(icon1);
        snapchat.setBounds(580,580,200,40);
        this.add(snapchat);
        ImageIcon icon3=new ImageIcon("images/whatsapp.png");
        JLabel whatsapp=new JLabel(icon3);
        whatsapp.setBounds(630,580,200,40);
        this.add(whatsapp);
        JLabel footer=new JLabel("");
        footer.setOpaque(true);
        footer.setBackground(new Color(51,153,255));
        footer.setBounds(0,540,1500,140);
        this.add(footer);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
		JMenuBar mb=new JMenuBar();
		UIManager.put("MenuBar.background", new Color(51,153,255));
		mb.setOpaque(true);
		mb.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setJMenuBar(mb);
		mb.add(Box.createVerticalStrut(50));
		mb.add(Box.createHorizontalStrut(530));
		JMenu home=new JMenu("Home ");
		mb.add(home);
		mb.add(Box.createHorizontalStrut(40));
		home.setForeground(Color.WHITE);
		JMenu forum=new JMenu("Forum ");
		mb.add(forum);
		mb.add(Box.createHorizontalStrut(40));
        JMenu compiler=new JMenu("Compiler");
        mb.add(compiler);
        mb.add(Box.createHorizontalStrut(40));
        JMenu arrival=new JMenu("Arrivals");
        mb.add(arrival);
        JMenuItem userarrival=new JMenuItem("User[]");
        JMenuItem adminarrival=new JMenuItem("Admin[]");
        arrival.add(userarrival);
        arrival.add(adminarrival);
        mb.add(Box.createHorizontalStrut(40));
        JMenu papers=new JMenu("Papers");
        mb.add(papers);
        mb.add(Box.createHorizontalStrut(40));
        JMenu login=new JMenu("Login");
        mb.add(login);
        JMenuItem userlogin=new JMenuItem("User");
        JMenuItem adminlogin=new JMenuItem("Admin");
        login.add(userlogin);
        login.add(adminlogin);
        mb.add(Box.createHorizontalStrut(40));
        JMenu feedback=new JMenu("Feedback");
        mb.add(feedback);
        mb.add(Box.createHorizontalStrut(40));
        JMenu codes=new JMenu("Codes");
        mb.add(codes);
        mb.add(Box.createHorizontalStrut(40));
        JMenu aboutus=new JMenu("About Us");
        mb.add(aboutus);
        mb.add(Box.createHorizontalStrut(40));
        forum.setForeground(Color.WHITE);
        compiler.setForeground(Color.WHITE);
        arrival.setForeground(Color.WHITE);
        papers.setForeground(Color.WHITE);
        login.setForeground(Color.WHITE);
        feedback.setForeground(Color.WHITE);
        codes.setForeground(Color.WHITE);
        aboutus.setForeground(Color.WHITE);
        this.setTitle("ED 3.0 - Python");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public void getconn1(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,pwd);
            Statement state=conn.createStatement();
            ResultSet res1=state.executeQuery("select * from data1");
            while(res1.next()){
                path1=res1.getString("path");
            }
            
            res1.close();
            state.close();
            conn.close();
        }
        catch(Exception pdf1){
            System.out.println(pdf1);
        }
    }
        public void getconn2(){
        
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn2=DriverManager.getConnection(url,username,pwd);
            Statement state2=conn2.createStatement();
            ResultSet res2=state2.executeQuery("select * from data2");
            while(res2.next()){
                path2=res2.getString("path");
            }
            
            res2.close();
            state2.close();
            conn2.close();
        }
        catch(Exception pdf2){
            System.out.println(pdf2);
        }
    }
    public void getconn3(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn3=DriverManager.getConnection(url,username,pwd);
            Statement state3=conn3.createStatement();
            ResultSet res3=state3.executeQuery("select * from data3");
            while(res3.next()){
                path3=res3.getString("path");
            }
            
            res3.close();
            state3.close();
            conn3.close();
        }
        catch(Exception pdf3){
            System.out.println(pdf3);
        }
    }
    public void getconn4(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn4=DriverManager.getConnection(url,username,pwd);
            Statement state4=conn4.createStatement();
            ResultSet res4=state4.executeQuery("select * from data4");
            while(res4.next()){
                path4=res4.getString("path");
            }
            
            res4.close();
            state4.close();
            conn4.close();
        }
        catch(Exception pdf4){
            System.out.println(pdf4);
        }
    }
    public void getconn5(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn5=DriverManager.getConnection(url,username,pwd);
            Statement state5=conn5.createStatement();
            ResultSet res5=state5.executeQuery("select * from data5");
            while(res5.next()){
                path5=res5.getString("path");
            }
            
            res5.close();
            state5.close();
            conn5.close();
        }
        catch(Exception pdf5){
            System.out.println(pdf5);
        }
    }
    public void getconn6(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn6=DriverManager.getConnection(url,username,pwd);
            Statement state6=conn6.createStatement();
            ResultSet res6=state6.executeQuery("select * from data6");
            while(res6.next()){
                path6=res6.getString("path");
            }
            
            res6.close();
            state6.close();
            conn6.close();
        }
        catch(Exception pdf6){
            System.out.println(pdf6);
        }
    }
    public void getconn7(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn7=DriverManager.getConnection(url,username,pwd);
            Statement state7=conn7.createStatement();
            ResultSet res7=state7.executeQuery("select * from data7");
            while(res7.next()){
                path7=res7.getString("path");
            }
            
            res7.close();
            state7.close();
            conn7.close();
        }
        catch(Exception pdf7){
            System.out.println(pdf7);
        }
    }
    public void getconn8(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn8=DriverManager.getConnection(url,username,pwd);
            Statement state8=conn8.createStatement();
            ResultSet res8=state8.executeQuery("select * from data8");
            while(res8.next()){
                path8=res8.getString("path");
            }
            
            res8.close();
            state8.close();
            conn8.close();
        }
        catch(Exception pdf8){
            System.out.println(pdf8);
        }
    }
    public void getconn9(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn9=DriverManager.getConnection(url,username,pwd);
            Statement state9=conn9.createStatement();
            ResultSet res9=state9.executeQuery("select * from practical_slips");
            while(res9.next()){
                path9=res9.getString("path");
            }
            
            res9.close();
            state9.close();
            conn9.close();
        }
        catch(Exception pdf9){
            System.out.println(pdf9);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1 ){       
     try{
                File file=new File(path1);
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
        if(e.getSource() == btn2){
            try{
                File file=new File(path2);
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
            else if(e.getSource()==btn3){
                try{
                    File file3=new File(path3);
                if(file3.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file3);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc3){
                System.out.println(exc3);
            }
        }
            else if(e.getSource()==btn4){
                try{
                File file4=new File(path4);
                if(file4.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file4);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc4){
                System.out.println(exc4);
            }
                
        }
         else if(e.getSource()==btn5){
                try{
                File file=new File(path5);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc5){
                System.out.println(exc5);
            }
                
        }
         else if(e.getSource()==btn6){
                try{
                File file=new File(path6);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc6){
                System.out.println(exc6);
            }
                
        }
         else if(e.getSource()==btn7){
                try{
                File file=new File(path7);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc7){
                System.out.println(exc7);
            }
                
        }
         else if(e.getSource()==btn8){
                try{
                File file=new File(path8);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc8){
                System.out.println(exc8);
            }
                
        }
        else if(e.getSource()==btn9){
                try{
                File file=new File(path9);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc9){
                System.out.println(exc9);
            }
                
        }
    }
    public static void main(String[] args) {
        python p=new python();
        p.getconn1();
        p.getconn2();
        p.getconn3();
        p.getconn4();
        p.getconn5();
        p.getconn6();
        p.getconn7();
        p.getconn8();
    }
}