import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.awt.Desktop;
import java.sql.*;
class homepage extends JFrame implements ActionListener,MenuListener{
    JMenu compiler,feedback,about_us,forum,test;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival,adminarrival,php_mcq,java_mcq,advphp_mcq,advjava_mcq,android_mcq,html_mcq,python_mcq,cBook,androidBook,phpBook,javaBook,cppBook,webBook,pythonBook;
    JButton contact,btn1;
    String bpath1,bpath2,bpath3,bpath4,bpath5,bpath6,bpath7;
    homepage(){
        InputStream font=homepage.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel l1=new JLabel("<html>HTML, short for HyperText Markup Language, is the standard markup language used for creating web pages. It provides the structure and the content of a webpage, defining elements like headings, paragraph, links, images, and more. HTML uses tags to mark up different parts of the content, and rendered by web browsers.</html>");
        l1.setBounds(130,930,300,200);
        l1.setFont(myfont.deriveFont(16f));
        panel.add(l1);
        JLabel lbl1=new JLabel("<html><u>HTML</u></html>");
        lbl1.setBounds(245,880,100,50);
        lbl1.setFont(myboldfont.deriveFont(20f));
        lbl1.setForeground(Color.RED);
        panel.add(lbl1);
        JLabel features=new JLabel("Key-Features");
        features.setBounds(600,740,200,100);
        features.setFont(myboldfont.deriveFont(27f));
        panel.add(features);
        JLabel kdesc=new JLabel("<html>We provide important codes related to Programming Languages, using which you would be able to understand different Programming aspects.</html>");
		kdesc.setBounds(180,810,1200,40);
        kdesc.setFont(myfont.deriveFont(16f));
        panel.add(kdesc);
        JLabel box1=new JLabel();
        box1.setBounds(100,870,350,260);
        box1.setOpaque(true);
        box1.setBackground(Color.WHITE);
        box1.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box1);
        JLabel box2=new JLabel();
        box2.setBounds(485,870,350,260);
        box2.setOpaque(true);
        box2.setBackground(Color.WHITE);
        JLabel lbl2=new JLabel("<html><u>PHP</u></html>");
        lbl2.setBounds(640,880,100,50);
        lbl2.setFont(myboldfont.deriveFont(20f));
        lbl2.setForeground(Color.RED);
        panel.add(lbl2);
        JLabel l2=new JLabel("<html>PHP is a popular server-side scripting language used for web development. It is known for its simplicity, flexibility, and wide range of applications. In web development, PHP is used to create dynamic web pages, handle form data, interact with databases. </html>");
        l2.setBounds(515,930,300,200);
        l2.setFont(myfont.deriveFont(16f));
        panel.add(l2);
        box2.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box2);
        JLabel box3=new JLabel();
        box3.setBounds(870,870,350,260);
        box3.setOpaque(true);
        box3.setBackground(Color.WHITE);
        JLabel lbl3=new JLabel("<html><u>Java</u></html>");
        lbl3.setBounds(1020,880,100,50);
        lbl3.setFont(myboldfont.deriveFont(20f));
        lbl3.setForeground(Color.RED);
        panel.add(lbl3);
        JLabel l3=new JLabel("<html>Java is a versatile programming language used for developing a wide range of applications. It's known for its platform independance, Java programs can easily run on different operating systems. Java is used for building desktop, web etc. applications.</html>");
        l3.setBounds(900,930,300,200);
        l3.setFont(myfont.deriveFont(16f));
        panel.add(l3);
        box3.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box3);
        JLabel box4=new JLabel();
        box4.setBounds(100,1160,350,290);
        box4.setOpaque(true);
        box4.setBackground(Color.WHITE);
        JLabel lbl4=new JLabel("<html><u>Python</u></html>");
        lbl4.setBounds(245,1170,100,50);
        lbl4.setFont(myboldfont.deriveFont(20f));
        lbl4.setForeground(Color.RED);
        panel.add(lbl4);
        JLabel l4=new JLabel("<html>Python is a versatile and powerful programming language that is widely used in various applications. Its simplicity and readability make it a popular choice for beginners, while its extensive library ecosystem and robust frameworks make it suitable for complex projects.</html>");
        l4.setBounds(130,1220,300,200);
        l4.setFont(myfont.deriveFont(16f));
        panel.add(l4);
        box4.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box4);
        JLabel box5=new JLabel();
        box5.setBounds(485,1160,350,290);
        box5.setOpaque(true);
        box5.setBackground(Color.WHITE);
        JLabel lbl5=new JLabel("<html><u>Android</u></html>");
        lbl5.setBounds(625,1170,100,50);
        lbl5.setFont(myboldfont.deriveFont(20f));
        lbl5.setForeground(Color.RED);
        panel.add(lbl5);
        JLabel l5=new JLabel("<html>Android programming involves developing applications specifically for the android operating system. It uses java as the primary language along with SDK and IDE such as android studio. With android programming you can create wide range of apps, from simple utility apps to complex games. </html>");
        l5.setBounds(515,1220,300,215);
        l5.setFont(myfont.deriveFont(16f));
        panel.add(l5);
        box5.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box5);
        JLabel box6=new JLabel();
        box6.setBounds(870,1160,350,290);
        box6.setOpaque(true);
        box6.setBackground(Color.WHITE);
        JLabel lbl6=new JLabel("<html><u>Advance Java</u></html>");
        lbl6.setBounds(980,1170,150,50);
        lbl6.setFont(myboldfont.deriveFont(20f));
        lbl6.setForeground(Color.RED);
        panel.add(lbl6);
        JLabel l6=new JLabel("<html>Advance Java refers to the more advanced concepts and features of the java programming language beyond the basics. It includes topic such as multithreading, database connectivity, JavaFX for building graphical user interface and advanced data structures and algorithms.</html>");
        l6.setBounds(900,1220,300,215);
        l6.setFont(myfont.deriveFont(16f));
        panel.add(l6);
        box6.setBorder(BorderFactory.createLineBorder(Color.decode("#F5F5DC"),1));
        panel.add(box6);
        ImageIcon icon3=new ImageIcon("images/banner.jpg");
        JLabel poster=new JLabel(icon3);
        poster.setBounds(170,1500,1000,440);
        JLabel heading=new JLabel("Join Our Family..!");
        heading.setBounds(420,1610,800,100);
        heading.setFont(myboldfont.deriveFont(60f));
        heading.setForeground(Color.WHITE);
        panel.add(heading);
        contact=new JButton("Contact Us");
        contact.setBounds(600,1750,150,40);
        contact.setContentAreaFilled(true);
        contact.setBackground(Color.decode("#000"));
        contact.setForeground(Color.WHITE);
        contact.setFont(myfont.deriveFont(18f));
        contact.setBorder(BorderFactory.createLineBorder(Color.WHITE,1));
        contact.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                contact.setBackground(Color.decode("#ff5349"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                contact.setBackground(Color.decode("#000"));
            }
        });
        panel.add(contact);
        panel.add(poster);
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(625,2000,120,50);
        follow.setFont(myboldfont.deriveFont(16f));
        follow.setForeground(Color.black);
        panel.add(follow);
        ImageIcon i=new ImageIcon("images/instagram 2.png");
        JLabel instagram=new JLabel(i);
        instagram.setBounds(630,2040,30,40);
        instagram.setBackground(Color.black);
        panel.add(instagram);
        instagram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("https://www.instagram.com/the_gt_official?igsh=MW10azA5aTBkaTYxbA=="));
                }
            } else {
                System.out.println("not supported");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        });
        ImageIcon icon1=new ImageIcon("images/snapchat 2.png");
        JLabel snapchat=new JLabel(icon1);
        snapchat.setBounds(670,2040,30,40);
        snapchat.setBackground(Color.black);
        panel.add(snapchat);
        snapchat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("https://www.snapchat.com/add/ganeshtelore04?share_id=rBIqcTujtXo&locale=en-US"));
                }
            } else {
                System.out.println("not supported");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        });
        ImageIcon icon4=new ImageIcon("images/whatsapp 2.png");
        JLabel whatsapp=new JLabel(icon4);
        whatsapp.setBounds(710,2040,30,40);
        panel.add(whatsapp);
        whatsapp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("https://api.whatsapp.com/qr/TTCPPLO4MHO3B1?autoload=1&app_absent=0"));
                }
            } else {
                System.out.println("not supported");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            }
        });
        JLabel moto=new JLabel("EthicalDood: Dive into Our Code Haven, Where Imagination Takes Flight, Excellence is Crafted, and Boundaries Fade Away..!");
        moto.setBounds(190,2080,1000,50);
        moto.setFont(myfont.deriveFont(16f));
        moto.setForeground(Color.GRAY);
        panel.add(moto);
        JLabel version=new JLabel("<html>Version 3.0</html");
        version.setForeground(Color.GRAY);
        version.setFont(myfont.deriveFont(16f));
        version.setBounds(640,2120,200,40);
        panel.add(version);
        JLabel creatorline=new JLabel("<html>Crafted with &hearts; by GT</html");
        creatorline.setForeground(Color.GRAY);
        creatorline.setFont(myfont.deriveFont(16f));
        creatorline.setBounds(610,2155,200,40);
        panel.add(creatorline);
        JLabel tagline=new JLabel("Welcome to EthicalDood..!");
        tagline.setFont(myboldfont.deriveFont(70f));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(220,300,1000,100);
        panel.add(tagline);
        JLabel p1=new JLabel("We welcomes you to our website which is built to serve and help those students who have lack of knowledge in programming languages...");
        p1.setBounds(225,365,1000,80);
        p1.setFont(myfont.deriveFont(14f));
        p1.setForeground(Color.WHITE);
        panel.add(p1);
        btn1=new JButton("Visit us to know More");
        btn1.setBounds(600,440,200,50);
        btn1.setForeground(Color.WHITE);
        btn1.setOpaque(false);
        btn1.setContentAreaFilled(false);
        btn1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        btn1.setFont(myfont.deriveFont(14f));
        btn1.setFocusPainted(false);//used to remove outline of button text
        panel.add(btn1);
		ImageIcon img=new ImageIcon();
		ImageIcon icon=new ImageIcon("images/homepage.png");
		JLabel bg=new JLabel(icon);
		bg.setBounds(0,0,1500,700);
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
        java_mcq=new JMenuItem("Java");
        php_mcq=new JMenuItem("PHP");
        php_mcq.addActionListener(this);
        html_mcq=new JMenuItem("HTML");
        python_mcq=new JMenuItem("Python");
         android_mcq.addActionListener(this);
          java_mcq.addActionListener(this);
           html_mcq.addActionListener(this);
            python_mcq.addActionListener(this);
        test.add(android_mcq);
        test.add(html_mcq);
        test.add(java_mcq);
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
        
        panel.setBackground(Color.WHITE);
        this.setTitle("Ethicaldood - HomePage");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(750, 2210));
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
        else if(e.getSource()==android_mcq){
        ProcessBuilder pb=new ProcessBuilder("javac","android_mcq.java");
        ProcessBuilder pb2=new ProcessBuilder("java","android_mcq");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==java_mcq){
        ProcessBuilder pb=new ProcessBuilder("javac","java_mcq.java");
        ProcessBuilder pb2=new ProcessBuilder("java","java_mcq");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==python_mcq){
        ProcessBuilder pb=new ProcessBuilder("javac","python_mcq.java");
        ProcessBuilder pb2=new ProcessBuilder("java","python_mcq");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==html_mcq){
        ProcessBuilder pb=new ProcessBuilder("javac","html_mcq.java");
        ProcessBuilder pb2=new ProcessBuilder("java","html_mcq");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        dispose();
        
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
		homepage h = new homepage();
        h.retrieveEbooks();
	}
}