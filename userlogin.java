import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
class userlogin extends JFrame implements ActionListener{
    JTextField tb1,tb2;
    JButton btn,create;
    String uname,pwd;
    JMenu compiler,feedback,about_us,forum,test;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival,adminarrival,php_mcq,java_mcq,advphp_mcq,advjava_mcq,android_mcq,html_mcq,python_mcq;
	userlogin(){
        getContentPane().setBackground(Color.white);
        InputStream font=userlogin.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        JLabel heading=new JLabel("Welcome Back GT!");
        heading.setFont(myfont.deriveFont(40f));
        heading.setBounds(100,220,400,50);
        heading.setForeground(Color.white);
        this.add(heading);
        JLabel desc=new JLabel("<html>Hey User, Login to User Page to Manage as well as Overview your Uploaded contents on Ethicaldood by validating your login credentials..! If you dont have any Account then...</html>");
        desc.setBounds(100,270,420,120);
        desc.setForeground(Color.white);
        desc.setFont(myfont.deriveFont(18f));
        this.add(desc);
        Border bdbtn=BorderFactory.createMatteBorder(1,1,1,1,Color.decode("#f7f7f7"));
        create=new JButton("Sign-Up");
        create.setBounds(200,420,200,40);
        create.setOpaque(true);
        create.setContentAreaFilled(false);
        create.setFont(myfont.deriveFont(18f));
        create.setForeground(Color.white);
        create.setBorder(bdbtn);
        create.setFocusPainted(false);
        this.add(create);
        create.addActionListener(this);
        Border bottombd=BorderFactory.createMatteBorder(0,0,1,0,new Color(51,204,255));
        Border btnbd=BorderFactory.createMatteBorder(1,1,1,1,new Color(51,204,255));
        ImageIcon img=new ImageIcon("images/uloginbg.png");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(550,750);
        sidebg.setOpaque(true);
        sidebg.setBackground(Color.GREEN);
        sidebg.setForeground(Color.RED);
        this.add(sidebg);
        JLabel login2=new JLabel("Sign-In");
        login2.setBounds(935,120,200,100);
        login2.setFont(myfont.deriveFont(45f));
        login2.setForeground(new Color(51,204,255));
        this.add(login2);
        JLabel uname=new JLabel("Username :");
        uname.setBounds(760,220,100,50);
        uname.setForeground(new Color(51,204,255));
        uname.setFont(myfont.deriveFont(18f));
        this.add(uname);
        tb1=new JTextField();
        tb1.setBounds(882,220,300,50);
        tb1.setBorder(bottombd);
        tb1.setOpaque(true);
        tb1.setFont(myfont.deriveFont(18f));
        //tb1.setBackground(new Color(204,204,204));
        tb1.setForeground(new Color(51,204,255));
        tb1.setHorizontalAlignment(JTextField.LEFT);
        
        this.add(tb1);
        JLabel pwd=new JLabel("Password: ");
        pwd.setBounds(760,320,100,50);
        pwd.setForeground(new Color(51,204,255));
        pwd.setFont(myfont.deriveFont(18f));
        this.add(pwd);
        tb2=new JTextField();
        tb2.setBounds(882,320,300,50);
        tb2.setFont(myfont.deriveFont(18f));
        tb2.setBorder(bottombd);
        tb2.setOpaque(true);
        tb2.setForeground(new Color(51,204,255));
        //tb2.setBackground(new Color(204,204,204));
        this.add(tb2);
        btn=new JButton("Submit");
        btn.setBounds(930,420,200,40);
        btn.setOpaque(true);
        btn.setFont(myfont.deriveFont(18f));
        btn.setForeground(Color.white);
        btn.setFocusPainted(false);
        btn.setBackground(new Color(51,204,255));
        btn.setBorder(btnbd);
        this.add(btn);
        btn.addActionListener(this);
        JMenuBar mb=new JMenuBar();
        UIManager.put("MenuItem.background", Color.GRAY);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("MenuItem.font",myfont.deriveFont(12f));
        UIManager.put("MenuBar.background", new Color(51,204,255));
        UIManager.put("Menu.foreground", Color.WHITE);
        UIManager.put("Menu.font", myfont.deriveFont(12f));
        mb.setOpaque(true);
        mb.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.setJMenuBar(mb);
                ImageIcon logoimg=new ImageIcon("images/ED3.0.png");
        JMenu logo=new JMenu();
        logo.setIcon(logoimg);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
        JMenu home=new JMenu("<html>Home</html>");
        mb.add(home);
        mb.add(Box.createHorizontalStrut(40));
        home.setForeground(Color.YELLOW);
        forum=new JMenu("Forum ");
        forum.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                forum.setBackground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                forum.setBackground(Color.gray);
            }
        });
        mb.add(forum);
        mb.add(Box.createHorizontalStrut(40));
        compiler=new JMenu("Compiler");
        mb.add(compiler);
        mb.add(Box.createHorizontalStrut(40));
        JMenu arrival=new JMenu("Arrivals");
        userarrival=new JMenuItem("User[]");
        adminarrival=new JMenuItem("Admin[]");
        arrival.add(userarrival);
        arrival.add(adminarrival);
        mb.add(arrival);
        userarrival.addActionListener(this);
        adminarrival.addActionListener(this);
        mb.add(Box.createHorizontalStrut(40));
        test=new JMenu("Test");
        mb.add(test);
        android_mcq=new JMenuItem("Android");
        advjava_mcq=new JMenuItem("Advance Java");
        java_mcq=new JMenuItem("Java");
        advphp_mcq=new JMenuItem("Advance PHP");
        php_mcq=new JMenuItem("PHP");
        php_mcq.addActionListener(this);
        html_mcq=new JMenuItem("HTML");
        python_mcq=new JMenuItem("Python");
        test.add(android_mcq);
        test.add(html_mcq);
        test.add(advjava_mcq);
        test.add(java_mcq);
        test.add(advphp_mcq);
        test.add(php_mcq);
        test.add(python_mcq);
        mb.add(Box.createHorizontalStrut(40));
        JMenu login=new JMenu("Login");
        mb.add(login);
        userlogin=new JMenuItem("User");
        adminlogin=new JMenuItem("Admin");
        userlogin.setOpaque(true);
        userlogin.setBackground(Color.GRAY);
        userlogin.setFont(myfont.deriveFont(12f));
        adminlogin.setOpaque(true);
        adminlogin.setBackground(Color.GRAY);
        adminlogin.setFont(myfont.deriveFont(12f));
        login.add(userlogin);
        login.add(adminlogin);
        userlogin.addActionListener(this);
        adminlogin.addActionListener(this);
        mb.add(Box.createHorizontalStrut(40));
        feedback=new JMenu("Feedback");
        mb.add(feedback);
        //feedback.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        JMenu codes=new JMenu("Codes");
        mb.add(codes);
        html=new JMenuItem("HTML");
        html.addActionListener(this);
        adv_java=new JMenuItem("Advance Java");
        adv_java.addActionListener(this);
        java=new JMenuItem("Core Java");
        java.addActionListener(this);
        adv_php=new JMenuItem("Advance PHP");
        adv_php.addActionListener(this);
        php=new JMenuItem("PHP");
        php.addActionListener(this);
        python=new JMenuItem("Python");
        python.addActionListener(this);
        android=new JMenuItem("Android");
        android.addActionListener(this);
        codes.add(android);
        codes.add(adv_java);
        codes.add(adv_php);
        codes.add(html);
        codes.add(java);
        codes.add(php);
        codes.add(python);
        mb.add(Box.createHorizontalStrut(40));
        about_us=new JMenu("About Us");
        mb.add(about_us);
        //about_us.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        this.setTitle("ED - User Login");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            if(tb1.getText().equals("") && tb2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Credentials!","ED Login Alert",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                    Statement state=conn.createStatement();
                    String val1=String.valueOf(Base64.getEncoder().encodeToString(tb1.getText().getBytes()));
                    String val2=String.valueOf(Base64.getEncoder().encodeToString(tb2.getText().getBytes()));
                    ResultSet op=state.executeQuery("select * from user_login where username='"+val1+"' and password='"+val2+"'");
                    while(op.next()){
                        uname=new String(Base64.getDecoder().decode(op.getString("username")));
                        pwd=new String(Base64.getDecoder().decode(op.getString("password")));
                    }
                    if(tb1.getText().equals(uname) && tb2.getText().equals(pwd)){
                    int res=state.executeUpdate("update user_login set status='1' where username='"+val1+"'");
                    ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar;lib/activation.jar;lib/mail.jar","user_insert.java");
                    ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar;lib/activation.jar;lib/mail.jar","user_insert");
        try{
        pb.start();
        pb2.start();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Credentials!","ED Alert!",JOptionPane.WARNING_MESSAGE);
                    }
                }catch(Exception exc){
                    System.out.println(exc);
                }
                
            }
        }
        else if(e.getSource()==create){
            ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar;lib/activation.jar;lib/mail.jar","user_signup");
            try{
                pb.start();
            }catch(Exception a){
                System.out.println(a);
            }
        }
    }
	public static void main(String[] args) {
		new userlogin();
        }
}