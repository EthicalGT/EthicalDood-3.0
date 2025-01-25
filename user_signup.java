import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
class user_signup extends JFrame implements ActionListener{
    JTextField tb,tb1,tb2,tb3;
    JButton btn,create;
    String uname,pwd;
	user_signup(){
        InputStream font=user_signup.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        getContentPane().setBackground(Color.white);
        JLabel heading=new JLabel("Welcome Back Member!");
        heading.setFont(myboldfont.deriveFont(35f));
        heading.setBounds(100,225,450,50);
        heading.setForeground(Color.white);
        this.add(heading);
        JLabel desc=new JLabel("<html>Hey User, create your account on Ethicaldood to contribute ED Community..! If you already have Account then kindly sign-in...</html>");
        desc.setBounds(100,270,440,120);
        desc.setForeground(Color.white);
        desc.setFont(myfont.deriveFont(20f));
        this.add(desc);
        Border bdbtn=BorderFactory.createMatteBorder(1,1,1,1,Color.decode("#f7f7f7"));
        create=new JButton("Sign-In");
        create.setBounds(200,420,200,40);
        create.setOpaque(true);
        create.setContentAreaFilled(false);
        create.setFont(myfont.deriveFont(20f));
        create.setForeground(Color.white);
        create.setBorder(bdbtn);
        create.setFocusPainted(false);
        create.addActionListener(this);
        this.add(create);
        Border bottombd=BorderFactory.createMatteBorder(0,0,1,0,new Color(51,204,255));
        ImageIcon img=new ImageIcon("images/uloginbg.png");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(565,750);
        sidebg.setOpaque(true);
        this.add(sidebg);
        JLabel login=new JLabel("Sign-Up");
        login.setBounds(925,80,300,100);
        login.setFont(myboldfont.deriveFont(50f));
        login.setForeground(new Color(51,204,255));
        this.add(login);
        JLabel name=new JLabel("Name: ");
        name.setBounds(772,200,100,50);
        name.setForeground(new Color(51,204,255));
        name.setFont(myfont.deriveFont(18f));
        this.add(name);
        tb=new JTextField();
        tb.setBounds(882,200,300,50);
        tb.setFont(myfont.deriveFont(18f));
        tb.setBorder(bottombd);
        tb.setOpaque(true);
        tb.setForeground(new Color(51,204,255));
        this.add(tb);
        JLabel uname=new JLabel("Username :");
        uname.setBounds(772,300,150,50);
        uname.setForeground(new Color(51,204,255));
        uname.setFont(myfont.deriveFont(18f));
        this.add(uname);
        tb1=new JTextField();
        tb1.setBounds(882,300,300,50);
        tb1.setBorder(bottombd);
        tb1.setOpaque(true);
        tb1.setFont(myfont.deriveFont(18f));
        //tb1.setBackground(new Color(204,204,204));
        tb1.setForeground(new Color(51,204,255));
        tb1.setHorizontalAlignment(JTextField.LEFT);
        this.add(tb1);
        JLabel pwd=new JLabel("Password: ");
        pwd.setBounds(772,400,100,50);
        pwd.setForeground(new Color(51,204,255));
        pwd.setFont(myfont.deriveFont(18f));
        this.add(pwd);
        tb2=new JTextField();
        tb2.setBounds(882,400,300,50);
        tb2.setFont(myfont.deriveFont(18f));
        tb2.setBorder(bottombd);
        tb2.setOpaque(true);
        tb2.setForeground(new Color(51,204,255));
        this.add(tb2);

        JLabel email=new JLabel("E-Mail: ");
        email.setBounds(772,500,100,50);
        email.setForeground(new Color(51,204,255));
        email.setFont(myfont.deriveFont(18f));
        this.add(email);
        tb3=new JTextField();
        tb3.setBounds(882,500,300,50);
        tb3.setFont(myfont.deriveFont(18f));
        tb3.setBorder(bottombd);
        tb3.setOpaque(true);
        tb3.setForeground(new Color(51,204,255));
        this.add(tb3);
        Border btnbd=BorderFactory.createMatteBorder(1,1,1,1,new Color(51,204,255));
        btn=new JButton("Submit");
        btn.setBounds(930,600,200,40);
        btn.setOpaque(true);
        btn.setFont(myboldfont.deriveFont(18f));
        btn.setForeground(Color.white);
        btn.setFocusPainted(false);
        btn.setBackground(new Color(51,204,255));
        btn.setBorder(btnbd);
        this.add(btn);
        btn.addActionListener(this);
        this.setTitle("Ethicaldood - User Sign-Up");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            if(tb.getText().equals("") || tb1.getText().equals("") || tb2.getText().equals("") || tb3.getText().equals("")){
                JOptionPane.showMessageDialog(null,"All fields are mandatory!");
            }else{
                try{
                    String username=Base64.getEncoder().encodeToString(tb1.getText().getBytes());
                    String password=Base64.getEncoder().encodeToString(tb2.getText().getBytes()); 
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                    Statement state=conn.createStatement();
                    String sql="insert into user_login values('"+username+"','"+password+"','"+tb.getText()+"','"+tb3.getText()+"','"+0+"')";
                    int res=state.executeUpdate(sql);
                    if(res!=-1){
                    String to=tb3.getText();
                    String from="bhaskartelore@gmail.com";
                    String subject="EthicalDood Alerts!";
                    String text="Dear Member, Thank you for creating account in EthicalDood. Here's your username "+tb1.getText()+" Please keep it safe!\nWith Regards\nED Team";
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", true);
                    properties.put("mail.smtp.starttls.enable", true);
                    properties.put("mail.smtp.port", "587");
                    properties.put("mail.smtp.host", "smtp.gmail.com");

                    String uname = "bhaskartelore";
                    String pwd = "apmfhhhvvzbnbsfc";

                    Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(uname, pwd);
            }
        });
                    try {
                    Message message = new MimeMessage(session);
                    
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                    
                    message.setFrom(new InternetAddress(from));
                    message.setSubject(subject);
                    message.setText(text);
                    Transport.send(message);
                    System.out.println("Message Sent..!");
                    } catch (Exception ex) {
                    ex.printStackTrace();
                    } 
                    JOptionPane.showMessageDialog(null,"Account Created Successfully!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Error Occured!");
                    }
                }catch(Exception exc){
                    System.out.println(exc);
                }
                
            }
        }
        if(e.getSource()==create){
            ProcessBuilder pb=new ProcessBuilder("java","-cp",".;lib/connector.jar","userlogin");
        try{
        Process p=pb.start();
        //int exitCode=p.waitFor();
        
    }catch(Exception exception){
        System.out.println(exception);
    }
        }
    }
	public static void main(String[] args) {
		new user_signup();
        }
}