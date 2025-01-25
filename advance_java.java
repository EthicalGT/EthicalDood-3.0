import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
class advance_java extends JFrame implements ActionListener{
    String path1,path2,path3,path4,path5,path6,path7,path8,url1,url2,url3,url4,url5,url6,url7,url8;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,button1,button2,button3,button4,button5,button6,button7,button8;
    String url="jdbc:mysql://localhost:3306/ethicaldood";
	advance_java(){
        InputStream font=advance_java.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        this.getContentPane().setBackground(Color.WHITE);
        /*JLabel p1=new JLabel("<html>HTML, short for HyperText Markup Language, is the standard markup language used for creating web pages. It provides the structure and the content of a webpage, defining elements like headings, paragraph, links, images, and more. HTML uses tags to mark up different parts of the content, which are then rendered by web browsers. </html>");
        p1.setBounds(150,80,1100,200);
        p1.setFont(new Font("Arial",Font.PLAIN,15));
        p1.setForeground(Color.WHITE);
        this.add(p1);*/
		JLabel tagline=new JLabel("<html>&nbsp;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Advance Java</html>");
        tagline.setFont(myfont.deriveFont(80f));
        tagline.setForeground(Color.WHITE);
        tagline.setOpaque(true);
        tagline.setBounds(0,0,1500,150);
        tagline.setBackground(new Color(51,153,255));
        this.add(tagline);
        JLabel ch1=new JLabel("<html>1.  Introduction to JDBC</html>");
        ch1.setFont(myfont.deriveFont(20f));
        ch1.setBounds(70,200,400,80);
        ch1.setForeground(Color.BLACK);
        this.add(ch1);
        btn1=new JButton("View PDF");
        btn1.setBounds(95,260,130,40);
        btn1.setBorder(new LineBorder(Color.BLUE,1));
        btn1.setForeground(Color.WHITE);
        btn1.setOpaque(true);
        btn1.setFont(myfont.deriveFont(15f));
        btn1.setBackground(new Color(51,153,255));
        btn1.setFocusPainted(false);
        this.add(btn1);
        button1=new JButton("Tutorial");
        button1.setBounds(240,260,130,40);
        button1.setBorder(new LineBorder(Color.RED,1));
        button1.setForeground(Color.WHITE);
        button1.setOpaque(true);
        button1.setFont(myfont.deriveFont(15f));
        button1.setBackground(Color.decode("#ff0000"));
        button1.setFocusPainted(false);
        this.add(button1);
        JLabel ch2=new JLabel("<html>2. MultiThreading</html>");
        ch2.setFont(myfont.deriveFont(20f));
        ch2.setBounds(70,300,400,80);
        ch2.setForeground(Color.BLACK);
        this.add(ch2);
        btn2=new JButton("View PDF");
        btn2.setBounds(95,360,130,40);
        btn2.setBorder(new LineBorder(Color.BLUE,1));
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(new Color(51,153,255));
        btn2.setFont(myfont.deriveFont(15f));
        btn2.setFocusPainted(false);//used to remove outline of button text
        this.add(btn2);
        button2=new JButton("Tutorial");
        button2.setBounds(240,360,130,40);
        button2.setBorder(new LineBorder(Color.RED,1));
        button2.setForeground(Color.WHITE);
        button2.setOpaque(true);
        button2.setFont(myfont.deriveFont(15f));
        button2.setBackground(Color.decode("#ff0000"));
        button2.setFocusPainted(false);
        this.add(button2);
        JLabel ch3=new JLabel("<html>3. Socket Programming/html>");
        ch3.setFont(myfont.deriveFont(20f));
        ch3.setBounds(70,400,400,80);
        ch3.setForeground(Color.BLACK);
        this.add(ch3);
        btn3=new JButton("View PDF");
        btn3.setBounds(95,460,130,40);
        btn3.setBorder(new LineBorder(Color.BLUE,1));
        btn3.setForeground(Color.WHITE);
        btn3.setFont(myfont.deriveFont(15f));
        btn3.setBackground(new Color(51,153,255));
        this.add(btn3);
        button3=new JButton("Tutorial");
        button3.setBounds(240,460,130,40);
        button3.setBorder(new LineBorder(Color.RED,1));
        button3.setForeground(Color.WHITE);
        button3.setOpaque(true);
        button3.setFont(myfont.deriveFont(15f));
        button3.setBackground(Color.decode("#ff0000"));
        button3.setFocusPainted(false);
        this.add(button3);
        JLabel ch4=new JLabel("<html>4. Servlet and JSP</html>");
        ch4.setFont(myfont.deriveFont(20f));
        ch4.setBounds(550,200,400,80);
        ch4.setForeground(Color.BLACK);
        this.add(ch4);
        btn4=new JButton("View PDF");
        btn4.setBounds(575,260,130,40);
        btn4.setBorder(new LineBorder(Color.BLUE,1));
        btn4.setForeground(Color.WHITE);
        btn4.setFont(myfont.deriveFont(15f));
        btn4.setBackground(new Color(51,153,255));
        btn4.setFocusPainted(false);
        this.add(btn4);
        button4=new JButton("Tutorial");
        button4.setBounds(720,260,130,40);
        button4.setBorder(new LineBorder(Color.RED,1));
        button4.setForeground(Color.WHITE);
        button4.setOpaque(true);
        button4.setFont(myfont.deriveFont(15f));
        button4.setBackground(Color.decode("#ff0000"));
        button4.setFocusPainted(false);
        this.add(button4);
        JLabel ch5=new JLabel("<html>5. Spring and Hibernate</html>");
        ch5.setFont(myfont.deriveFont(20f));
        ch5.setBounds(550,300,400,80);
        ch5.setForeground(Color.BLACK);
        this.add(ch5);
        btn5=new JButton("View PDF");
        btn5.setBounds(575,360,130,40);
        btn5.setBorder(new LineBorder(Color.BLUE,1));
        btn5.setForeground(Color.WHITE);
        btn5.setFont(myfont.deriveFont(15f));
        btn5.setBackground(new Color(51,153,255));
        btn5.setFocusPainted(false);
        this.add(btn5);
        button5=new JButton("Tutorial");
        button5.setBounds(720,360,130,40);
        button5.setBorder(new LineBorder(Color.RED,1));
        button5.setForeground(Color.WHITE);
        button5.setOpaque(true);
        button5.setFont(myfont.deriveFont(15f));
        button5.setBackground(Color.decode("#ff0000"));
        button5.setFocusPainted(false);
        this.add(button5);
        JLabel ch6=new JLabel("<html>6. ------------</html>");
        ch6.setFont(myfont.deriveFont(20f));
        ch6.setBounds(1020,200,400,80);
        ch6.setForeground(Color.BLACK);
        this.add(ch6);
        btn6=new JButton("View PDF");
        btn6.setBounds(1045,260,130,40);
        btn6.setBorder(new LineBorder(Color.BLUE,1));
        btn6.setForeground(Color.WHITE);
        btn6.setFont(myfont.deriveFont(15f));
        btn6.setBackground(new Color(51,153,255));
        btn6.setFocusPainted(false);
        this.add(btn6);
        button6=new JButton("Tutorial");
        button6.setBounds(1190,260,130,40);
        button6.setBorder(new LineBorder(Color.RED,1));
        button6.setForeground(Color.WHITE);
        button6.setOpaque(true);
        button6.setFont(myfont.deriveFont(15f));
        button6.setBackground(Color.decode("#ff0000"));
        button6.setFocusPainted(false);
        this.add(button6);
        JLabel ch7=new JLabel("<html>7. ---------------------</html>");
        ch7.setFont(myfont.deriveFont(20f));
        ch7.setBounds(1020,300,400,80);
        ch7.setForeground(Color.BLACK);
        this.add(ch7);
        btn7=new JButton("View PDF");
        btn7.setBounds(1045,360,130,40);
        btn7.setBorder(new LineBorder(Color.BLUE,1));
        btn7.setForeground(Color.WHITE);
        btn7.setFont(myfont.deriveFont(15f));
        btn7.setBackground(new Color(51,153,255));
        btn7.setFocusPainted(false);
        this.add(btn7);
        button7=new JButton("Tutorial");
        button7.setBounds(1190,360,130,40);
        button7.setBorder(new LineBorder(Color.RED,1));
        button7.setForeground(Color.WHITE);
        button7.setOpaque(true);
        button7.setFont(myfont.deriveFont(15f));
        button7.setBackground(Color.decode("#ff0000"));
        button7.setFocusPainted(false);
        this.add(button7);
        JLabel ch8=new JLabel("<html>8. -----------</html>");
        ch8.setFont(myfont.deriveFont(20f));
        ch8.setBounds(1020,400,400,80);
        ch8.setForeground(Color.BLACK);
        this.add(ch8);
        btn8=new JButton("View PDF");
        btn8.setBounds(1045,460,130,40);
        btn8.setBorder(new LineBorder(Color.BLUE,1));
        btn8.setForeground(Color.WHITE);
        btn8.setFont(myfont.deriveFont(15f));
        btn8.setBackground(new Color(51,153,255));
        btn8.setFocusPainted(false);
        this.add(btn8);
        button8=new JButton("Tutorial");
        button8.setBounds(1190,460,130,40);
        button8.setBorder(new LineBorder(Color.RED,1));
        button8.setForeground(Color.WHITE);
        button8.setOpaque(true);
        button8.setFont(myfont.deriveFont(15f));
        button8.setBackground(Color.decode("#ff0000"));
        button8.setFocusPainted(false);
        this.add(button8);
        JLabel creatorline=new JLabel("<html>Crafted with &hearts; by GT</html");
        creatorline.setForeground(Color.WHITE);
        creatorline.setFont(myfont.deriveFont(15f));
        creatorline.setBounds(615,615,200,40);
        this.add(creatorline);
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(630,540,120,50);
        follow.setFont(myfont.deriveFont(15f));
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
        button8.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
		JMenuBar mb=new JMenuBar();
        UIManager.put("MenuItem.background", Color.GRAY);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("MenuItem.font",myfont.deriveFont(12f));
        UIManager.put("MenuBar.background", new Color(51,153,255));
        UIManager.put("Menu.foreground", Color.WHITE);
        UIManager.put("Menu.font", myfont.deriveFont(12f));
        mb.setOpaque(true);
        mb.setBorder(new EmptyBorder(0, 0, 0, 1));
        this.setJMenuBar(mb);
                ImageIcon logoimg=new ImageIcon("images/ED3.0.png");
        JMenu logo=new JMenu();
        logo.setIcon(logoimg);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
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
        this.setTitle("ED 3.0 - HTML");
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
            ResultSet res1=state.executeQuery("select * from advance_java where name='Assignment 1'");
            while(res1.next()){
                path1=res1.getString("path");
                url1=res1.getString("tutorial");
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
            ResultSet res2=state2.executeQuery("select * from advance_java where name='Assignment 2'");
            while(res2.next()){
                path2=res2.getString("path");
                url2=res2.getString("tutorial");
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
            ResultSet res3=state3.executeQuery("select * from advance_java where name='Assignment 3'");
            while(res3.next()){
                path3=res3.getString("path");
                url3=res3.getString("tutorial");
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
            ResultSet res4=state4.executeQuery("select * from advance_java where name='Assignment 4'");
            while(res4.next()){
                path4=res4.getString("path");
                url4=res4.getString("tutorial");
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
            ResultSet res5=state5.executeQuery("select * from advance_java where name='Assignment 5'");
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
            ResultSet res6=state6.executeQuery("select * from advance_java where name='Assignment 6'");
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
            ResultSet res7=state7.executeQuery("select * from advance_java where name='Homework'");
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
    /*public void getconn8(){
        //String url="jdbc:mysql://localhost:3306/python";
        String username="root";
        String pwd="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn8=DriverManager.getConnection(url,username,pwd);
            Statement state8=conn8.createStatement();
            ResultSet res8=state8.executeQuery("select * from chapter8");
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
    }*/
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
                File file2=new File(path2);
                if(file2.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file2);
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
                File file5=new File(path5);
                if(file5.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file5);
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
                File file6=new File(path6);
                if(file6.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file6);
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
                File file7=new File(path7);
                if(file7.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file7);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc7){
                System.out.println(exc7);
            }
                
        }
        else if(e.getSource()==btn8 || e.getSource()==button8){
            JOptionPane.showMessageDialog(null,"Sorry for the trouble this content will be available soon..!","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(e.getSource()==button1){
            try{
                    File file=new File(url1);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception ex1){
                System.out.println(ex1);
            }
        }
        else if(e.getSource()==button2){
            try{
                    File file=new File(url2);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception ex2){
                System.out.println(ex2);
            }
        }
        else if(e.getSource()==button3){
            try{
                    File file=new File(url3);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception ex3){
                System.out.println(ex3);
            }
        }
        else if(e.getSource()==button4){
            try{
                    File file=new File(url4);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception ex4){
                System.out.println(ex4);
            }
        }
    }
	public static void main(String[] args) {
		advance_java h=new advance_java();
        h.getconn1();
        h.getconn2();
        h.getconn3();
        h.getconn4();
        h.getconn5();
        h.getconn6();
        h.getconn7();
	}
}