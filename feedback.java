import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
public class feedback extends JFrame implements ActionListener{
    private JButton submit;
    JTextField tb1,tb2;
    JTextArea tb3;
    JMenuItem python,adv_php,adv_java,java,android,html,php;
	public feedback(){
        InputStream font=feedback.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        JLabel keyfeature=new JLabel("");
        keyfeature.setLocation(450,130);
        keyfeature.setBorder(BorderFactory.createLineBorder(Color.white,2));
        keyfeature.setSize(450,430);
        this.add(keyfeature);
        JLabel name=new JLabel("Name: ");
        name.setSize(150,70);
        name.setLocation(520,150);
        name.setFont(new Font("Calibri",Font.BOLD,20));
        this.add(name);
        tb1=new JTextField();
        tb1.setSize(300,40);
        tb1.setLocation(520,200);
        tb1.setOpaque(false);
        Border bottombd=BorderFactory.createMatteBorder(0,0,1,0,Color.black);
        tb1.setBorder(bottombd);
        tb1.setFont(new Font("Calibri",Font.PLAIN,20));
        this.add(tb1);
        JLabel contact=new JLabel("Contact No: ");
        contact.setSize(150,70);
        contact.setLocation(520,250);
        contact.setFont(new Font("Calibri",Font.BOLD,20));
        this.add(contact);
        tb2=new JTextField();
        tb2.setSize(300,40);
        tb2.setLocation(520,300);
        tb2.setOpaque(false);
        tb2.setBorder(bottombd);
        tb2.setFont(new Font("Calibri",Font.PLAIN,20));
        this.add(tb2);
        JLabel msg=new JLabel("Message/Suggestions: ");
        msg.setSize(300,70);
        msg.setLocation(520,350);
        msg.setFont(new Font("Calibri",Font.BOLD,20));
        this.add(msg);
        tb3=new JTextArea();
        tb3.setSize(300,80);
        tb3.setLocation(520,400);
        tb3.setOpaque(false);
        tb3.setBorder(bottombd);
        tb3.setFont(new Font("Calibri",Font.PLAIN,20));
        this.add(tb3);
        submit=new JButton("Submit");
        submit.setBounds(600,500,150,40);
        submit.setContentAreaFilled(false);
        submit.setFocusPainted(false);
        submit.addActionListener(this);
        this.add(submit);
        /*JLabel creatorline=new JLabel("<html>Crafted with &hearts; by GT</html");
        creatorline.setForeground(Color.WHITE);
        creatorline.setFont(new Font("Arial",Font.PLAIN,15));
        creatorline.setBounds(615,615,200,40);
        this.add(creatorline);*/
        JLabel follow=new JLabel("Follow Me On");
        follow.setBounds(635,570,120,50);
        follow.setFont(new Font("Arial",Font.PLAIN,15));
        follow.setForeground(Color.white);
        this.add(follow);
        ImageIcon icon=new ImageIcon("images/instagram.png");
        JLabel instagram=new JLabel(icon);
        instagram.setBounds(530,600,200,40);
        this.add(instagram);
        ImageIcon icon1=new ImageIcon("images/snapchat.png");
        JLabel snapchat=new JLabel(icon1);
        snapchat.setBounds(580,600,200,40);
        this.add(snapchat);
        ImageIcon icon3=new ImageIcon("images/whatsapp.png");
        JLabel whatsapp=new JLabel(icon3);
        whatsapp.setBounds(630,600,200,40);
        this.add(whatsapp);
        JLabel tagline=new JLabel("Feedback");
        tagline.setFont(new Font("Calibri",Font.BOLD,80));
        tagline.setForeground(new Color(102,102,102));
        tagline.setSize(500,100);
        tagline.setLocation(530,30);
        this.add(tagline);
		ImageIcon img=new ImageIcon();
		ImageIcon imgicon=new ImageIcon("images/feedback.jpg");
		JLabel bg=new JLabel(imgicon);
		bg.setBounds(0,0,1500,700);
		//bg.setPrefferedSize(new Dimension(1300,700));
		this.add(bg);
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
		JMenu home=new JMenu("Home ");
		mb.add(home);
		mb.add(Box.createHorizontalStrut(40));
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
        this.setTitle("Ethicaldood - Feedback");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submit) { 
            boolean match1 = tb2.getText().matches("^\\d{1,10}$");
            boolean match2 = tb1.getText().matches("^[a-zA-Z]{10,}$");
            boolean match3 = tb3.getText().matches("^[a-zA-Z\\s]{20,}$");

            if (!match1 || !match2 || !match3 || tb1.getText().isEmpty() || tb2.getText().isEmpty() || tb3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields correctly!");
            } else { 
                try {
                    String uname = tb1.getText();
                    String cno = tb2.getText();
                    String message = tb3.getText();

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood", "root", "");
                    Statement state = conn.createStatement();
                    String sql = "insert into feedbacks values('" + uname + "','" + cno + "','" + message + "')";
                    int res = state.executeUpdate(sql);
                    if (res != -1) {
                        JOptionPane.showMessageDialog(null, "Feedback submitted successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error occurred while submitting feedback.");
                    }
                    state.close();
                    conn.close();
                } catch (Exception exc) {
                    System.out.println(exc);
                }
            }
        }
        else if(e.getSource()==python){
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
		new feedback();

        }
}