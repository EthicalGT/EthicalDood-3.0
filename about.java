import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.*;
class about extends JFrame implements ActionListener,MenuListener{
    JMenu compiler,feedback,about_us,forum,test;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival,adminarrival,php_mcq,java_mcq,advphp_mcq,advjava_mcq,android_mcq,html_mcq,python_mcq,cBook,androidBook,phpBook,javaBook,cppBook,webBook,pythonBook;
	String bpath1,bpath2,bpath3,bpath4,bpath5,bpath6,bpath7;
    about(){
        
        InputStream font=about.class.getResourceAsStream("font/Poppins-Regular.ttf");
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
        panel.setBackground(Color.white);
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(625,1300,120,50);
        follow.setFont(myboldfont.deriveFont(16f));
        follow.setForeground(Color.black);
        panel.add(follow);
        ImageIcon i=new ImageIcon("images/instagram 2.png");
        JLabel instagram=new JLabel(i);
        instagram.setBounds(630,1340,30,40);
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
        snapchat.setBounds(670,1340,30,40);
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
        ImageIcon icon3=new ImageIcon("images/whatsapp 2.png");
        JLabel whatsapp=new JLabel(icon3);
        whatsapp.setBounds(710,1340,30,40);
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
        JLabel version=new JLabel("<html>Version 3.0</html");
        version.setForeground(Color.GRAY);
        version.setFont(myfont.deriveFont(16f));
        version.setBounds(640,1390,200,40);
        panel.add(version);
        JLabel creatorline=new JLabel("<html>Crafted with &hearts; by GT</html");
        creatorline.setForeground(Color.GRAY);
        creatorline.setFont(myfont.deriveFont(16f));
        creatorline.setBounds(615,1440,200,40);
        panel.add(creatorline);
        ImageIcon img3=new ImageIcon("images/admininfo.png");
        JLabel kdesc=new JLabel(img3);
		kdesc.setBounds(70,860,1200,461);
        panel.add(kdesc);
        ImageIcon img2=new ImageIcon("images/about.jpg");
        JLabel box1=new JLabel(img2);
        box1.setBounds(670,400,600,400);
        box1.setOpaque(true);
        panel.add(box1);
        JLabel tagline=new JLabel("About Us");
        tagline.setFont(myboldfont.deriveFont(70f));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(520,150,1000,100);
        panel.add(tagline);
        JLabel p1=new JLabel("<html>We are college student like you. We are from Maharashtra, Wakadi. By peoviding codes we enhance students learning. Coding is important for students because it helps to increase confidence. Because coding empowers student with applicable skills such as creativity, problem solving and persistence, it also empowers them to more confidently face a variety of challenges and opportunities. Programming helps us to automate tasks, create new technologies, and develop more efficient systems. With ever-groming importance of technology in our world, learning to program is becoming more and more essential..!</html>");
        p1.setBounds(100,420,400,400);
        p1.setFont(myfont.deriveFont(17f));
        p1.setForeground(Color.GRAY);
        panel.add(p1);
        JLabel label=new JLabel("Welcome to EthicalDood 3.0!");
        label.setBounds(100,385,400,50);
        label.setForeground(Color.black);
        label.setOpaque(false);
        label.setFont(myboldfont.deriveFont(25f));
        panel.add(label);
        
		ImageIcon img=new ImageIcon();
		ImageIcon icon=new ImageIcon("images/background.jpg");
		JLabel bg=new JLabel(icon);
		bg.setBounds(0,0,1500,350);
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
        about_us=new JMenu("<html><u>About Us</u></html>");
        mb.add(about_us);
        about_us.addMenuListener(this);
        about_us.setForeground(Color.YELLOW);
        mb.add(Box.createHorizontalStrut(40));
        JMenu aboutus=new JMenu("<html><u>About Us</u></html>");
        aboutus.setForeground(Color.yellow);
        mb.add(aboutus);
        mb.add(Box.createHorizontalStrut(40));

        this.setTitle("ED - About");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel.setPreferredSize(new Dimension(750, 1500));
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
		about a=new about();
        a.retrieveEbooks();
	}
}