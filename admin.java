import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javazoom.jl.player.*;
import javax.swing.event.*;
import java.net.*;
class admin extends JFrame implements ActionListener,MenuListener{
    JMenuItem content1,content2;
    JMenu home,forum,compiler,feedback;
	admin(){
        InputStream font=admin.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
		JLabel tagline=new JLabel("Welcome to ED Admin Panel GT..!");
        tagline.setFont(new Font("Calibri",Font.BOLD,70));
        tagline.setForeground(Color.WHITE);
        tagline.setBounds(200,300,1000,100);
        this.add(tagline);
        JLabel p1=new JLabel("Welcome to Admin Panel, here you'll be able to control the EthicalDood Contents.");
        p1.setBounds(400,365,1000,80);
        p1.setFont(new Font("Arial",Font.PLAIN,15));
        p1.setForeground(Color.WHITE);
        this.add(p1);
        JLabel keyfeature=new JLabel("Key Features");
        keyfeature.setBounds(600,800,200,80);
        keyfeature.setForeground(Color.WHITE);
        this.add(keyfeature);
		ImageIcon img=new ImageIcon();
		ImageIcon icon=new ImageIcon("images/admin.jpg");
		JLabel bg=new JLabel(icon);
		bg.setBounds(0,0,1500,700);
		//bg.setPrefferedSize(new Dimension(1300,700));
		this.add(bg);
		JMenuBar mb=new JMenuBar();
        UIManager.put("MenuItem.background", Color.GRAY);
        UIManager.put("MenuItem.foreground", Color.WHITE);
        UIManager.put("MenuItem.font",myfont.deriveFont(12f));
        UIManager.put("MenuBar.background", Color.black);
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
		home=new JMenu("Home ");
		mb.add(home);
        home.addMenuListener(this);
		mb.add(Box.createHorizontalStrut(40));
		home.setForeground(Color.WHITE);
		forum=new JMenu("Forum ");
		mb.add(forum);
        forum.addMenuListener(this);
		mb.add(Box.createHorizontalStrut(40));
        compiler=new JMenu("Compiler");
        mb.add(compiler);
        compiler.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        JMenu arrival=new JMenu("User");
        mb.add(arrival);
        mb.add(Box.createHorizontalStrut(40));
        JMenu content=new JMenu("Contents");
        content1=new JMenuItem("Remove");
        content2=new JMenuItem("Add");
        content.add(content1);
        content.add(content2);
        content1.addActionListener(this);
        content2.addActionListener(this);
        mb.add(content);
        mb.add(Box.createHorizontalStrut(40));
        feedback=new JMenu("Feedback");
        mb.add(feedback);
        feedback.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        this.setTitle("ED - Admin");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==forum){
       ProcessBuilder pb=new ProcessBuilder("javac","user_forum.java");
        ProcessBuilder pb2=new ProcessBuilder("java","user_forum");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==content1){
       ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","delete_file.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","delete_file");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exc){
        System.out.println(exc);
    }
    }
    else if(e.getSource()==content2){
       ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","admin_insert.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","admin_insert");
        try{
        Process p=pb.start();
        pb2.start();
        //int exitCode=p.waitFor();
        
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
        ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","user_feedbacks.java");
        ProcessBuilder pb2=new ProcessBuilder("java","-cp",".;lib/connector.jar","user_feedback");
        try{
            pb.start();
            pb2.start();
            dispose();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    else if(event.getSource()==forum){
        ProcessBuilder pb=new ProcessBuilder("javac","admin_forum.java");
        ProcessBuilder pb2=new ProcessBuilder("java","admin_forum");
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
	public static void main(String[] args) {
		new admin();
        try{
            FileInputStream audio=new FileInputStream("audio/access granted.mp3");
            Player player=new Player(audio);
            player.play();
            }catch(Exception e){
                System.out.println(e);
            }
	}
}