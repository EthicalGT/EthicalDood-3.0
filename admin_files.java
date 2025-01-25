import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.*;
class admin_files extends JFrame implements ActionListener,MenuListener{
    JMenu compiler,feedback,about_us,forum,test;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival,adminarrival,php_mcq,java_mcq,advphp_mcq,advjava_mcq,android_mcq,html_mcq,python_mcq,cBook,androidBook,phpBook,javaBook,cppBook,webBook,pythonBook;
    String fname,path,fdesc;
    JButton btn;
    JPanel panel;
    JScrollPane scrollPane;
    String bpath1,bpath2,bpath3,bpath4,bpath5,bpath6,bpath7;
    admin_files(){
        getContentPane().setBackground(Color.white);
        Border bd=BorderFactory.createMatteBorder(1,1,1,1,Color.LIGHT_GRAY);
        InputStream font=admin_files.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        int x = 50; 
        int y = 400; 
        int distance = 250;
        int a=70;
        int b=430;
        int p=70;
        int q=480;
        int g=100;
        int f=550;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
            Statement state=conn.createStatement();
            ResultSet op=state.executeQuery("select * from admin_files");
            while(op.next()){
            fname=op.getString("filename");
                fdesc=op.getString("fdesc");
               String fpath=op.getString("fpath");
            JLabel lbl1=new JLabel(fname);
            lbl1.setBounds(a,b,150,50);
            lbl1.setFont(myboldfont.deriveFont(12f));
            panel.add(lbl1);
            JLabel lbl2=new JLabel("<html>"+fdesc+"</html>");
            lbl2.setBounds(p,q,150,50);
            lbl2.setFont(myfont.deriveFont(12f));
            panel.add(lbl2);
            JButton btn=new JButton("View");
            btn.setFont(myfont.deriveFont(12f));
            btn.setBounds(g,f,100,30);
            btn.setOpaque(true);
            btn.setBackground(Color.red);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            btn.setForeground(Color.white);
            panel.add(btn); 
            btn.addActionListener(new ActionListener(){
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
            JLabel label = new JLabel();
            label.setBounds(x, y, 200, 200);
            label.setOpaque(true);
            label.setBorder(bd);
            panel.add(label);

            x = x+distance;
            a=a+250;
            p=p+250;
            g=g+250;

                }
            
            }catch(Exception exception){
            System.out.println(exception);
        }
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(635,620,120,50);
        follow.setFont(myboldfont.deriveFont(13f));
        follow.setForeground(Color.GRAY);
        panel.add(follow);
        ImageIcon social1=new ImageIcon("images/instagram 2.png");
        JLabel instagram=new JLabel(social1);
        instagram.setBounds(530,660,200,40);
        panel.add(instagram);
        ImageIcon social2=new ImageIcon("images/snapchat 2.png");
        JLabel snapchat=new JLabel(social2);
        snapchat.setBounds(580,660,200,40);
        panel.add(snapchat);
        ImageIcon social3=new ImageIcon("images/whatsapp 2.png");
        JLabel whatsapp=new JLabel(social3);
        whatsapp.setBounds(630,660,200,40);
        panel.add(whatsapp);
        JLabel moto=new JLabel("<html>ETHICALDOOD: Dive into Our Code Haven, Where Imagination Takes Flight, Excellence is Crafted, and Boundaries Fade Away..!</html");
        moto.setBounds(250,700,1000,50);
        moto.setFont(myfont.deriveFont(15f));
        moto.setForeground(Color.GRAY);
        panel.add(moto);
        JLabel version=new JLabel("<html>Version 3.0</html");
        version.setBounds(640,750,1000,50);
        version.setFont(myfont.deriveFont(15f));
        version.setForeground(Color.GRAY);
        panel.add(version);
        JLabel creator=new JLabel("<html>Crafted with &hearts; by GT</html");
        creator.setBounds(615,800,1000,50);
        creator.setFont(myfont.deriveFont(15f));
        creator.setForeground(Color.GRAY);
        panel.add(creator);
        JLabel tagline=new JLabel("Admin Arrivals");
        tagline.setFont(myboldfont.deriveFont(70f));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(410,100,600,100);
        panel.add(tagline);
        JLabel p1=new JLabel("<html>--| All the Admin newly uploaded code files will be display here, Encourage Admin to do more for you too..! |--</html>");
        p1.setBounds(330,200,1000,80);
        p1.setFont(myfont.deriveFont(14f));
        p1.setForeground(Color.WHITE);
        panel.add(p1);
        ImageIcon img=new ImageIcon();
        ImageIcon icon=new ImageIcon("images/user-files.jpg");
        JLabel bg=new JLabel(icon);
        bg.setBounds(0,0,1500,320);
        //bg.setPrefferedSize(new Dimension(1300,700));
        panel.add(bg);
        JMenuBar mb=new JMenuBar();
        UIManager.put("MenuItem.background", Color.GRAY);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("MenuItem.font",myfont.deriveFont(12f));
        UIManager.put("MenuBar.background", new Color(102,100,100));
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
        JMenu arrival=new JMenu("<html><u>Arrivals</u></html>");
        arrival.setForeground(Color.YELLOW);
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
        this.setTitle("ED - Admin Arrivals");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(750, 860));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
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
        admin_files f=new admin_files();
        f.retrieveEbooks();
        
    }
}