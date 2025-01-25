import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.awt.Desktop;
class python_mcq extends JFrame implements ActionListener, MenuListener{
    JMenu compiler;
    JMenuItem python,adv_php,adv_java,java,android,html,php,userlogin,adminlogin,userarrival;
    JButton submit;
    JRadioButton q1a,q1b,q1c,q1d,q2a,q2b,q2c,q2d,q3a,q3b,q3c,q3d,q4a,q4b,q4c,q4d,q5a,q5b,q5c,q5d;
    int mcq1,mcq2,mcq3,mcq4,mcq5;
	python_mcq(){
        ButtonGroup group = new ButtonGroup();
        ButtonGroup group2 = new ButtonGroup();
        ButtonGroup group3 = new ButtonGroup();
        ButtonGroup group4 = new ButtonGroup();
        ButtonGroup group5 = new ButtonGroup();
        
        InputStream font=python_mcq.class.getResourceAsStream("font/Poppins-Regular.ttf");
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
        instagram.setBounds(530,1340,200,40);
        panel.add(instagram);
        ImageIcon icon1=new ImageIcon("images/snapchat 2.png");
        JLabel snapchat=new JLabel(icon1);
        snapchat.setBounds(580,1340,200,40);
        panel.add(snapchat);
        ImageIcon icon3=new ImageIcon("images/whatsapp 2.png");
        JLabel whatsapp=new JLabel(icon3);
        whatsapp.setBounds(630,1340,200,40);
        panel.add(whatsapp);
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
        JLabel tagline=new JLabel("Python Test");
        tagline.setFont(myboldfont.deriveFont(50f));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(550,50,1000,100);
        panel.add(tagline);
        JLabel Que1=new JLabel("<html>1. What does the __init__ method do in Python classes?</html>");
        Que1.setBounds(300,180,750,100);
        Que1.setFont(myfont.deriveFont(20f));
        Que1.setForeground(Color.white);
        panel.add(Que1);
        q1a = new JRadioButton("It initializes class variables.",false);
        q1a.setBounds(320,250,700,30);
        q1a.setOpaque(false);
        q1a.setFocusPainted(false);
        q1a.setFont(myfont.deriveFont(18f));
        q1a.setForeground(Color.white);
        q1b = new JRadioButton(" It is the constructor method called when a new instance of the class is created.");
        q1b.setBounds(320,280,700,30);
        q1b.setOpaque(false);
        q1b.setFocusPainted(false);
        q1b.setFont(myfont.deriveFont(18f));
        q1b.setForeground(Color.white);
        q1c = new JRadioButton("It defines the behavior of the class when used with the + operator.");
        q1c.setBounds(320,310,700,30);
        q1c.setOpaque(false);
        q1c.setFocusPainted(false);
        q1c.setFont(myfont.deriveFont(18f));
        q1c.setForeground(Color.white);
        q1d = new JRadioButton(" It is a special method used to override the behavior of the equality operator (==)");
        q1d.setBounds(320,340,750,30);
        q1d.setOpaque(false);
        q1d.setFocusPainted(false);
        q1d.setFont(myfont.deriveFont(18f));
        q1d.setForeground(Color.white);
        group.add(q1a);
        group.add(q1b);
        group.add(q1c);
        group.add(q1d);
        panel.add(q1a);
        panel.add(q1b);
        panel.add(q1c);
        panel.add(q1d);
        JLabel Que2=new JLabel("<html>2. In Python, what is the purpose of the super() function?</html>");
        Que2.setBounds(300,360,750,100);
        Que2.setFont(myfont.deriveFont(20f));
        Que2.setForeground(Color.white);
        panel.add(Que2);
        q2a = new JRadioButton("It returns the superclass of a class.",false);
        q2a.setBounds(320,450,600,30);
        q2a.setOpaque(false);
        q2a.setFocusPainted(false);
        q2a.setFont(myfont.deriveFont(18f));
        q2a.setForeground(Color.white);
        q2b = new JRadioButton("It calls the constructor of the superclass");
        q2b.setBounds(320,480,600,30);
        q2b.setOpaque(false);
        q2b.setFocusPainted(false);
        q2b.setFont(myfont.deriveFont(18f));
        q2b.setForeground(Color.white);
        q2c = new JRadioButton("It provides access to inherited methods and properties");
        q2c.setBounds(320,510,600,30);
        q2c.setOpaque(false);
        q2c.setFocusPainted(false);
        q2c.setFont(myfont.deriveFont(18f));
        q2c.setForeground(Color.white);
        q2d = new JRadioButton("It creates a new instance of a class");
        q2d.setBounds(320,540,600,30);
        q2d.setOpaque(false);
        q2d.setFocusPainted(false);
        q2d.setFont(myfont.deriveFont(18f));
        q2d.setForeground(Color.white);
        group2.add(q2a);
        group2.add(q2b);
        group2.add(q2c);
        group2.add(q2d);
        panel.add(q2a);
        panel.add(q2b);
        panel.add(q2c);
        panel.add(q2d);
        JLabel Que3=new JLabel("<html>3. What is the purpose of the __slots__ attribute in Python classes?</html>");
        Que3.setBounds(300,550,800,120);
        Que3.setFont(myfont.deriveFont(20f));
        Que3.setForeground(Color.white);
        panel.add(Que3);
        q3a = new JRadioButton("It specifies the methods that can be accessed by instances of the class",false);
        q3a.setBounds(320,660,700,30);
        q3a.setOpaque(false);
        q3a.setFocusPainted(false);
        q3a.setFont(myfont.deriveFont(18f));
        q3a.setForeground(Color.white);
        q3b = new JRadioButton("It restricts the creation of new attributes to those listed in the attribute");
        q3b.setBounds(320,690,700,30);
        q3b.setOpaque(false);
        q3b.setFocusPainted(false);
        q3b.setFont(myfont.deriveFont(18f));
        q3b.setForeground(Color.white);
        q3c = new JRadioButton("It defines the slots where the attributes are stored in memory");
        q3c.setBounds(320,720,700,30);
        q3c.setOpaque(false);
        q3c.setFocusPainted(false);
        q3c.setFont(myfont.deriveFont(18f));
        q3c.setForeground(Color.white);
        q3d = new JRadioButton("It limits the size of the objects created from the class");
        q3d.setBounds(320,750,700,30);
        q3d.setOpaque(false);
        q3d.setFocusPainted(false);
        q3d.setFont(myfont.deriveFont(18f));
        q3d.setForeground(Color.white);
        group3.add(q3a);
        group3.add(q3b);
        group3.add(q3c);
        group3.add(q3d);
        panel.add(q3a);
        panel.add(q3b);
        panel.add(q3c);
        panel.add(q3d);
        JLabel Que4=new JLabel("<html>4. What does the *args and **kwargs syntax in Python functions represent?</html>");
        Que4.setBounds(300,780,750,100);
        Que4.setFont(myfont.deriveFont(20f));
        Que4.setForeground(Color.white);
        panel.add(Que4);
        q4a = new JRadioButton("They are used to define default arguments for functions",false);
        q4a.setBounds(320,870,600,30);
        q4a.setOpaque(false);
        q4a.setFocusPainted(false);
        q4a.setFont(myfont.deriveFont(18f));
        q4a.setForeground(Color.white);
        q4b = new JRadioButton("They are used to specify variable-length arguments and keyword arguments, respectively");
        q4b.setBounds(320,900,800,30);
        q4b.setOpaque(false);
        q4b.setFocusPainted(false);
        q4b.setFont(myfont.deriveFont(18f));
        q4b.setForeground(Color.white);
        q4c = new JRadioButton("They are used to define static methods in classes");
        q4c.setBounds(320,930,600,30);
        q4c.setOpaque(false);
        q4c.setFocusPainted(false);
        q4c.setFont(myfont.deriveFont(18f));
        q4c.setForeground(Color.white);
        q4d = new JRadioButton("They are used to define class variables and instance variables, respectively");
        q4d.setBounds(320,960,600,30);
        q4d.setOpaque(false);
        q4d.setFocusPainted(false);
        q4d.setFont(myfont.deriveFont(18f));
        q4d.setForeground(Color.white);
        group4.add(q4a);
        group4.add(q4b);
        group4.add(q4c);
        group4.add(q4d);
        panel.add(q4a);
        panel.add(q4b);
        panel.add(q4c);
        panel.add(q4d);
        JLabel Que5=new JLabel("<html>5. What is the purpose of the __call__ method in Python classes?</html>");
        Que5.setBounds(300,980,750,100);
        Que5.setFont(myfont.deriveFont(20f));
        Que5.setForeground(Color.white);
        panel.add(Que5);
        q5a = new JRadioButton("It is called when an instance of the class is created",false);
        q5a.setBounds(320,1060,500,30);
        q5a.setOpaque(false);
        q5a.setFocusPainted(false);
        q5a.setFont(myfont.deriveFont(18f));
        q5a.setForeground(Color.white);
        q5b = new JRadioButton("It is used to define a callable object that can be invoked with parentheses");
        q5b.setBounds(320,1090,720,30);
        q5b.setOpaque(false);
        q5b.setFocusPainted(false);
        q5b.setFont(myfont.deriveFont(18f));
        q5b.setForeground(Color.white);
        q5c = new JRadioButton("It is called when an instance of the class is garbage collected");
        q5c.setBounds(320,1120,500,30);
        q5c.setOpaque(false);
        q5c.setFocusPainted(false);
        q5c.setFont(myfont.deriveFont(18f));
        q5c.setForeground(Color.white);
        q5d = new JRadioButton("It is used to define the behavior of the class when used with the () operator");
        q5d.setBounds(320,1150,500,30);
        q5d.setOpaque(false);
        q5d.setFocusPainted(false);
        q5d.setFont(myfont.deriveFont(18f));
        q5d.setForeground(Color.white);
        group5.add(q5a);
        group5.add(q5b);
        group5.add(q5c);
        group5.add(q5d);
        panel.add(q5a);
        panel.add(q5b);
        panel.add(q5c);
        panel.add(q5d);
        submit=new JButton("Submit");
        submit.setBounds(600,1210,150,40);
        submit.setForeground(Color.white);
        submit.setOpaque(true);
        submit.setBackground(Color.GREEN);
        submit.setFocusPainted(false);
        submit.setFont(myfont.deriveFont(18f));
        panel.add(submit);
        submit.addActionListener(this);
        ImageIcon shadow=new ImageIcon("images/shadow1.png");
        JLabel label=new JLabel(shadow);
        label.setBounds(280,150,800,800);
        panel.add(label);
		ImageIcon img=new ImageIcon();
		ImageIcon icon=new ImageIcon("images/mcq.jpg");
		JLabel bg=new JLabel(icon);
		bg.setBounds(0,0,1500,1300);
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
        home.setFont(myfont.deriveFont(12f));
		JMenu forum=new JMenu("Forum ");
		mb.add(forum);
		mb.add(Box.createHorizontalStrut(40));
        compiler=new JMenu("Compiler");
        mb.add(compiler);
        compiler.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        JMenu arrival=new JMenu("Arrivals");
        mb.add(arrival);
        userarrival=new JMenuItem("User[]");
        JMenuItem adminarrival=new JMenuItem("Admin[]");
        arrival.add(userarrival);
        arrival.add(adminarrival);
        mb.add(Box.createHorizontalStrut(40));
        JMenu test=new JMenu("<html><u>Test</u></html>");
        test.setForeground(Color.black);
        mb.add(test);
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

        this.setTitle("ED - Advance PHP Test");
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
    else if(e.getSource()==userlogin){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","userlogin");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
}
    else if(e.getSource()==adminlogin){
        ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","adminlogin");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==submit){
        if(q1a.isSelected()){
            mcq1=0;
        }
        else if(q1b.isSelected()){
            mcq1=2;
        }
        else if(q1c.isSelected()){
            mcq1=0;
        }
        else if(q1d.isSelected()){
            mcq1=0;
        }
        if(q2a.isSelected()){
            mcq2=0;
        }else if(q2b.isSelected()){
            mcq2=0;
        }else if(q2c.isSelected()){
            mcq2=2;
        }else if(q2d.isSelected()){
            mcq2=0;
        }
        if(q3a.isSelected()){
            mcq3=0;
        }else if(q3b.isSelected()){
            mcq3=2;
        }else if(q3c.isSelected()){
            mcq3=0;
        }else if(q3d.isSelected()){
            mcq3=0;
        }
        if(q4a.isSelected()){
            mcq4=0;
        }else if(q4b.isSelected()){
            mcq4=2;
        }else if(q4c.isSelected()){
            mcq4=0;
        }else if(q4d.isSelected()){
            mcq4=0;
        }
        if(q5a.isSelected()){
            mcq5=0;
        }else if(q5b.isSelected()){
            mcq5=2;
        }else if(q5c.isSelected()){
            mcq5=0;
        }else if(q5d.isSelected()){
            mcq5=0;
        }
        int res=mcq1+mcq2+mcq3+mcq4+mcq5;
        if(res<=8){
        JOptionPane.showMessageDialog(null,"Your Score are :"+res+" Kindly re-study the language!","Test Result",JOptionPane.WARNING_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null,"Congrats! Your Score are :"+res+" You scored full marks you can go with another language now..!","Test Result",JOptionPane.INFORMATION_MESSAGE);
    }
}
}
    public void menuSelected(MenuEvent event){
        try{
        Desktop.getDesktop().browse(new URI("https://www.programiz.com/java-programming/online-compiler"));
    }catch(Exception b){
        System.out.println(b);
    }
    }
    public void menuCanceled(MenuEvent event){

    }
    public void menuDeselected(MenuEvent event){

    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new python_mcq());
        
	}
}