import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.swing.event.*;
import java.net.*;
import javazoom.jl.player.*;
class adminlogin extends JFrame implements ActionListener,MenuListener{
    JTextField tb1,tb2;
    JButton btn;
    String uname,pwd;
    JMenu compiler,feedback,about_us,forum,test;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival,adminarrival,php_mcq,java_mcq,advphp_mcq,advjava_mcq,android_mcq,html_mcq,python_mcq,cBook,androidBook,phpBook,javaBook,cppBook,webBook,pythonBook;
    String bpath1,bpath2,bpath3,bpath4,bpath5,bpath6,bpath7;
	adminlogin(){
        InputStream font=adminlogin.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        getContentPane().setBackground(Color.white);
        JLabel heading=new JLabel("Welcome Back GT!");
        heading.setFont(myboldfont.deriveFont(40f));
        heading.setBounds(100,220,400,50);
        heading.setForeground(Color.white);
        this.add(heading);
        JLabel desc=new JLabel("<html>Hey GT, Login to Admin Page to Manage Ethicaldood by validating your login credentials..!</html>");
        desc.setBounds(100,270,300,100);
        desc.setForeground(Color.white);
        desc.setFont(myfont.deriveFont(18f));
        this.add(desc);
        Border bottombd=BorderFactory.createMatteBorder(0,0,1,0,new Color(0,102,0));
        ImageIcon img=new ImageIcon("images/green gradient.jpg");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(550,750);
        sidebg.setOpaque(true);
        sidebg.setBackground(Color.GREEN);
        sidebg.setForeground(Color.RED);
        this.add(sidebg);
        JLabel login=new JLabel("Login");
        login.setBounds(925,120,150,100);
        login.setFont(myboldfont.deriveFont(50f));
        login.setForeground(new Color(0,102,0));
        this.add(login);
        JLabel uname=new JLabel("Username :");
        uname.setBounds(775,220,100,50);
        uname.setForeground(new Color(0,102,0));
        uname.setFont(myfont.deriveFont(18f));
        this.add(uname);
        tb1=new JTextField();
        tb1.setBounds(882,220,300,50);
        tb1.setBorder(bottombd);
        tb1.setOpaque(true);
        tb1.setFont(myfont.deriveFont(18f));
        //tb1.setBackground(new Color(204,204,204));
        tb1.setForeground(new Color(0,102,0));
        tb1.setHorizontalAlignment(JTextField.LEFT);
        
        this.add(tb1);
        JLabel pwd=new JLabel("Password: ");
        pwd.setBounds(775,320,100,50);
        pwd.setForeground(new Color(0,102,0));
        pwd.setFont(myfont.deriveFont(18f));
        this.add(pwd);
        tb2=new JTextField();
        tb2.setBounds(882,320,300,50);
        tb2.setFont(myfont.deriveFont(18f));
        tb2.setBorder(bottombd);
        tb2.setOpaque(true);
        tb2.setForeground(new Color(0,102,0));
        //tb2.setBackground(new Color(204,204,204));
        this.add(tb2);
        btn=new JButton("Submit");
        btn.setBounds(890,420,200,40);
        btn.setOpaque(true);
        btn.setFont(myfont.deriveFont(20f));
        btn.setForeground(Color.white);
        btn.setFocusPainted(false);
        btn.setBackground(new Color(0,102,0));
        this.add(btn);
        btn.addActionListener(this);
        JMenuBar mb=new JMenuBar();
        UIManager.put("MenuItem.background", Color.decode("#234f1e"));
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("MenuItem.font",myfont.deriveFont(12f));
        UIManager.put("MenuBar.background", Color.decode("#234f1e"));
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
        mb.add(Box.createHorizontalStrut(230));
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
        forum.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        compiler=new JMenu("Compiler");
        mb.add(compiler);
        compiler.addMenuListener(this);
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
        JMenu loginn=new JMenu("Login");
        mb.add(loginn);
        userlogin=new JMenuItem("User");
        adminlogin=new JMenuItem("Admin");
        userlogin.setOpaque(true);
        userlogin.setBackground(Color.GRAY);
        userlogin.setFont(myfont.deriveFont(12f));
        adminlogin.setOpaque(true);
        adminlogin.setBackground(Color.GRAY);
        adminlogin.setFont(myfont.deriveFont(12f));
        loginn.add(userlogin);
        loginn.add(adminlogin);
        userlogin.addActionListener(this);
        adminlogin.addActionListener(this);
        mb.add(Box.createHorizontalStrut(40));
        feedback=new JMenu("Feedback");
        mb.add(feedback);
        feedback.addMenuListener(this);
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
        JMenu ebooks=new JMenu("EBooks");
        mb.add(ebooks);
        cBook=new JMenuItem("C");
        cBook.addActionListener(this);
        cppBook=new JMenuItem("C++");
        cppBook.addActionListener(this);
        phpBook=new JMenuItem("PHP");
        phpBook.addActionListener(this);
        javaBook=new JMenuItem("Java");
        javaBook.addActionListener(this);
        androidBook=new JMenuItem("Android Programming");
        androidBook.addActionListener(this);
        pythonBook=new JMenuItem("Python");
        pythonBook.addActionListener(this);
        webBook=new JMenuItem("Web Technology");
        webBook.addActionListener(this);
        ebooks.add(cBook);
        ebooks.add(cppBook);
        ebooks.add(phpBook);
        ebooks.add(javaBook);
        ebooks.add(androidBook);
        ebooks.add(pythonBook);
        ebooks.add(webBook);
        mb.add(Box.createHorizontalStrut(40));
        about_us=new JMenu("About Us");
        mb.add(about_us);
        about_us.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        this.setTitle("Ethicaldood - Admin Login");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            boolean match1=tb2.getText().toString().matches("^(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*[0-9])(?=.{6,12}$).*$");
            boolean match2 = tb1.getText().toString().matches("^[a-zA-Z]*$");
            if(tb1.getText().toString().isEmpty() && tb2.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Enter Credentials!","ED Login Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(!match1){
                JOptionPane.showMessageDialog(null,"Password should contain 1 uppercase, 1 special symbol, 1 digit and min length should be 6!","ED Login Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(!match2){
                JOptionPane.showMessageDialog(null,"Username should consist alphabets only!","ED Login Alert",JOptionPane.WARNING_MESSAGE);
            }else{
                try{
                    FileInputStream audio=new FileInputStream("audio/access_denied.mp3");
                    Player player=new Player(audio);
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                    Statement state=conn.createStatement();
                    ResultSet op=state.executeQuery("select * from admin_login");
                    while(op.next()){
                        uname=op.getString("adminname");
                        pwd=op.getString("password");
                    }
                    if(tb1.getText().equals(uname) && tb2.getText().equals(pwd)){
                    ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar;lib/mplayer.jar","admin");
        try{
        pb.start();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
                    }
                    else{
                        player.play();
                    }
                }catch(Exception exc){
                    System.out.println(exc);
                }
                
            }
        }
        if(e.getSource()==python){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","python");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==php_mcq){
        ProcessBuilder pb=new ProcessBuilder("java","php_mcq");
        try{
            System.out.println("clicked");
            pb.start();
            dispose();
        }catch(Exception exc){
            System.out.println(exc);
        }
    }
    else if(e.getSource()==java){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","java");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==adv_java){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","adv_java");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==php){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","php");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==adv_php){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","adv_php");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==android){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","android");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==html){
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","html.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","html");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        }catch(Exception exc){
      }
    }
    else if(e.getSource()==userlogin){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","userlogin");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
}
    else if(e.getSource()==adminlogin){
        ProcessBuilder pb1=new ProcessBuilder("javac","-cp",".;lib/connector.jar;lib/mplayer.jar","adminlogin.java");
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar;lib/mplayer.jar","adminlogin");
        try{
        pb1.start();
        Process p=pb.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==userarrival){
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","user_files.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","user_files");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==adminarrival){
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","admin_files.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","admin_files");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }

    else if(e.getSource()==cBook){
        try{
                    File file=new File(bpath1);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==cppBook){
        try{
                    File file=new File(bpath2);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==phpBook){
        try{
                    File file=new File(bpath3);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==javaBook){
        try{
                    File file=new File(bpath4);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==webBook){
        try{
                    File file=new File(bpath5);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==pythonBook){
        try{
                    File file=new File(bpath6);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }

        else if(e.getSource()==androidBook){
        try{
                    File file=new File(bpath7);
                if(file.exists()){
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().open(file);
                    }else{
                        System.out.println("not supported");
                    }
                }
            }catch(Exception exc){
                System.out.println(exc);
            }
        }
    }
    public void menuSelected(MenuEvent event){
        if(event.getSource()==compiler){
        try{
        Desktop.getDesktop().browse(new URI("https://www.programiz.com/java-programming/online-compiler"));
    }catch(Exception b){
        System.out.println(b);
    }
}      
    else if(event.getSource()==feedback){
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","feedback.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","feedback");
        try{
            pb.start();
            pb2.start();
            dispose();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    else if(event.getSource()==about_us){
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","about.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","about");
        try{
            pb.start();
            pb2.start();
            dispose();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    else if(event.getSource()==forum){
        ProcessBuilder pb=new ProcessBuilder("javac","user_forum.java");
        ProcessBuilder pb2=new ProcessBuilder("java","user_forum");
        try{
            pb.start();
            pb2.start();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    }
    public void menuCanceled(MenuEvent event){

    }
    public void menuDeselected(MenuEvent event){

    }
    public void retrieveEbooks(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
            Statement st=conn.createStatement();
            ResultSet rs1=st.executeQuery("select path from ebooks where bookname='C'");
            if(rs1.next()){
                bpath1=rs1.getString("path");
            }
            ResultSet rs2=st.executeQuery("select path from ebooks where bookname='C++'");
            if(rs2.next()){
                bpath2=rs2.getString("path");
            }
            ResultSet rs3=st.executeQuery("select path from ebooks where bookname='PHP'");
            if(rs3.next()){
                bpath3=rs3.getString("path");
            }
            ResultSet rs4=st.executeQuery("select path from ebooks where bookname='Java'");
            if(rs4.next()){
                bpath4=rs4.getString("path");
            }
            ResultSet rs5=st.executeQuery("select path from ebooks where bookname='Web Technology'");
            if(rs5.next()){
                bpath5=rs5.getString("path");
            }
            ResultSet rs6=st.executeQuery("select path from ebooks where bookname='Python'");
            if(rs6.next()){
                bpath6=rs6.getString("path");
            }
            ResultSet rs7=st.executeQuery("select path from ebooks where bookname='Android Programming'");
            if(rs7.next()){
                bpath7=rs7.getString("path");
            }
            rs1.close();
            rs2.close();
            rs3.close();
            rs4.close();
            rs5.close();
            rs6.close();
            rs7.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
	public static void main(String[] args) {
		adminlogin a=new adminlogin();
        a.retrieveEbooks();
        }
}