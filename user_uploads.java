import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
class user_uploads extends JFrame implements ActionListener{
    JMenuItem python,adv_php,adv_java,java,android,html,php;
    String fname,path,fdesc;
    JButton btn;
    JPanel panel;
    JScrollPane scrollPane;
    String user,mname;
    user_uploads(){
        getContentPane().setBackground(Color.white);
        Border bd=BorderFactory.createMatteBorder(1,1,1,1,Color.LIGHT_GRAY);
        InputStream font=user_uploads.class.getResourceAsStream("font/Poppins-Regular.ttf");
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
        int b=400;
        int p=70;
        int q=450;
        int g=100;
        int f=520;
        int m=100;
        int n=560;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
            Statement state=conn.createStatement();
            ResultSet rs=state.executeQuery("select * from user_login where status='1'");
            if(rs.next()){
                user=rs.getString("username");
            }
            ResultSet op=state.executeQuery("select * from user_files where username='"+user+"'");
            while(op.next()){
                mname=op.getString("mname");
            fname=op.getString("filename");
                fdesc=op.getString("filedesc");
               String fpath=op.getString("filepath");
            JLabel lbl1=new JLabel(fname);
            lbl1.setBounds(a,b,150,50);
            lbl1.setFont(myboldfont.deriveFont(12f));
            panel.add(lbl1);
            JTextPane lbl2 = new JTextPane();
            lbl2.setContentType("text/html");
            lbl2.setText(fdesc);
            lbl2.setEditable(false); 
            lbl2.setFont(myfont.deriveFont(12f));

            JScrollPane scrollPane = new JScrollPane(lbl2);
            scrollPane.setBounds(p, q, 150, 50);
            panel.add(scrollPane);

            JButton btn=new JButton("View");
            btn.setFont(myfont.deriveFont(12f));
            btn.setBounds(g,f,100,30);
            btn.setOpaque(true);
            btn.setBackground(Color.red);
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            btn.setForeground(Color.white);
            panel.add(btn);
            JButton btn2=new JButton("Delete");
            btn2.setFont(myfont.deriveFont(12f));
            btn2.setBounds(m,n,100,30);
            btn2.setOpaque(true);
            btn2.setBackground(Color.red);
            btn2.setFocusPainted(false);
            btn2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
            btn2.setForeground(Color.white);
            panel.add(btn2); 
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
            btn2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent a){
                    try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                Statement state=conn.createStatement();
                int res=state.executeUpdate("delete from user_files where filename='"+fname+"'");
                if(res!=-1){
                    JOptionPane.showMessageDialog(null,"Content Deletion Successfull!","ED Says!",JOptionPane.INFORMATION_MESSAGE);
                    ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","user_uploads.java");
                    ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","user_uploads");
                    pb.start();
                    pb2.start();
                }
                else
                    JOptionPane.showMessageDialog(null,"Error Occured, try gain after some time!","ED Says!",JOptionPane.ERROR_MESSAGE);
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
            m=m+250;

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
        JLabel tag = new JLabel("Hello");
        tag.setFont(myboldfont.deriveFont(70f));
        tag.setForeground(Color.WHITE);
        tag.setBounds(410,30,600,200);
        panel.add(tag);
        JLabel tagline = new JLabel(mname+"!");
        tagline.setFont(myboldfont.deriveFont(70f));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(410,100,600,200);
        panel.add(tagline);
        JLabel p1=new JLabel("<html>--| You can view as well as delete you uploaded content over ED, Enjoy ED Service..! |--</html>");
        p1.setBounds(400,250,1000,80);
        p1.setFont(myfont.deriveFont(14f));
        p1.setForeground(Color.WHITE);
        panel.add(p1);
        ImageIcon img=new ImageIcon();
        ImageIcon icon=new ImageIcon("images/repository.png");
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
        mb.add(Box.createHorizontalStrut(300));
        JMenu home=new JMenu("Home");
        mb.add(home);
        mb.add(Box.createHorizontalStrut(40));
        home.setForeground(Color.white);
        home.setFont(myfont.deriveFont(12f));
        JMenu forum=new JMenu("Forum ");
        mb.add(forum);
        mb.add(Box.createHorizontalStrut(40));
        JMenu compiler=new JMenu("Compiler");
        mb.add(compiler);
        mb.add(Box.createHorizontalStrut(40));
        JMenu arrival=new JMenu("<html><u>Arrivals</u></html>");
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
        JMenu aboutus=new JMenu("About Us");
        mb.add(aboutus);
        mb.add(Box.createHorizontalStrut(40));
        forum.setFont(myfont.deriveFont(12f));
        forum.setForeground(Color.WHITE);
        compiler.setForeground(Color.WHITE);
        compiler.setFont(myfont.deriveFont(12f));
        arrival.setForeground(Color.black);
        arrival.setFont(myfont.deriveFont(12f));
        papers.setForeground(Color.WHITE);
        papers.setFont(myfont.deriveFont(12f));
        login.setForeground(Color.WHITE);
        login.setFont(myfont.deriveFont(12f));
        feedback.setForeground(Color.WHITE);
        feedback.setFont(myfont.deriveFont(12f));
        codes.setForeground(Color.WHITE);
        codes.setFont(myfont.deriveFont(12f));
        aboutus.setForeground(Color.WHITE);
        aboutus.setFont(myfont.deriveFont(12f));
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
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==java){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","java");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==adv_java){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","adv_java");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==php){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","php");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==adv_php){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","adv_php");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==android){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","android");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==html){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","html");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new user_uploads());
        
    }
}