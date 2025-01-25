import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.*;
import java.util.stream.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;

class user_insert extends JFrame implements ActionListener{
    JTextField tb1,tb2,tb3,tb;
    JButton file,insert,alerts,logout,manage;
    JFrame frame;
    File selectedFile;
    Path fsrc,fdest;
    String fname;
    String[] to;
    String user;
    String desc;
    String mname;
    String usern;

    user_insert(){
        InputStream font=user_insert.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        Border bd=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        this.setTitle("Ethicaldood - Member Zone");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        getContentPane().setBackground(Color.white);
        ImageIcon manageimg=new ImageIcon("images/manage.png");
        manage=new JButton(manageimg);
        manage.setBounds(300,10,100,100);
        manage.setBorder(bd);
        manage.setContentAreaFilled(false);
        manage.addActionListener(this);
        this.add(manage);
        ImageIcon alertimg=new ImageIcon("images/alert.jpg");
        alerts=new JButton(alertimg);
        alerts.setBounds(5,10,123,111);
        alerts.setBorder(bd);
        alerts.addActionListener(this);
        this.add(alerts);
        ImageIcon logoutimg=new ImageIcon("images/logout.png");
        logout=new JButton(logoutimg);
        logout.setBounds(605,25,70,70);
        logout.setBorder(bd);
        logout.addActionListener(this);
        this.add(logout);
        JLabel lbl=new JLabel("Join the ED Community");
        lbl.setBounds(835,30,450,50);
        lbl.setForeground(Color.white);
        lbl.setFont(myboldfont.deriveFont(35f));
        this.add(lbl);
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
         Statement state=conn.createStatement();
         ResultSet set=state.executeQuery("select * from user_login where status='1'");
         while(set.next()){
            mname=set.getString("uname");
            usern=set.getString("username");
         }
         set.close();
         state.close();
         conn.close();   
        }catch(Exception a){
            System.out.println(a);
        }
        JLabel label=new JLabel("Member Name");
        label.setBounds(880,100,200,50);
        label.setForeground(Color.white);
        label.setFont(myfont.deriveFont(20f));
        this.add(label);
        tb=new JTextField(mname);
        tb.setEditable(false);
        tb.setBounds(880,150,350,40);
        tb.setBorder(bd);
        tb.setOpaque(true);
        tb.setFont(myfont.deriveFont(20f));
        tb.setForeground(Color.decode("#6495ED"));
        this.add(tb);
        JLabel lbl1=new JLabel("Filename");
        lbl1.setBounds(880,200,100,50);
        lbl1.setForeground(Color.white);
        lbl1.setFont(myfont.deriveFont(20f));
        this.add(lbl1);
        tb1=new JTextField();
        tb1.setBounds(880,250,350,40);
        tb1.setBorder(bd);
        tb1.setEditable(false);
        tb1.setOpaque(true);
        tb1.setFont(myfont.deriveFont(20f));
        tb1.setForeground(Color.decode("#6495ED"));
        this.add(tb1); 
        JLabel lbl2=new JLabel("Path");
        lbl2.setBounds(880,300,100,50);
        lbl2.setForeground(Color.white);
        lbl2.setFont(myfont.deriveFont(20f));
        this.add(lbl2);
        tb2=new JTextField();
        tb2.setEditable(false);
        tb2.setBounds(880,350,350,40);
        tb2.setBorder(bd);
        tb2.setBackground(Color.white);
        tb2.setFont(myfont.deriveFont(20f));
        tb2.setForeground(Color.decode("#6495ED"));
        this.add(tb2);
        file=new JButton("Select File");   
        file.setBounds(880,420,350,40);
        file.setForeground(Color.decode("#6495ED"));
        file.setBackground(Color.white);
        file.setFont(new Font("Calibri",Font.PLAIN,22));
        file.setFocusPainted(false);
        file.addActionListener(this);
        this.add(file);
        JLabel lbl3=new JLabel("Description");
        lbl3.setBounds(880,470,150,50);
        lbl3.setForeground(Color.decode("#6495ED"));
        lbl3.setFont(myfont.deriveFont(20f));
        this.add(lbl3);     
        tb3=new JTextField();
        tb3.setBounds(880,520,350,40);
        tb3.setBorder(bd);
        tb3.setBackground(Color.white);
        tb3.setFont(myfont.deriveFont(20f));
        tb3.setForeground(Color.decode("#6495ED"));
        this.add(tb3);
        insert=new JButton("Add File");
        insert.setBounds(880,590,350,40);
        insert.setForeground(Color.white);
        insert.setContentAreaFilled(false);
        insert.setFont(myfont.deriveFont(20f));
        insert.setFocusPainted(false);
        insert.addActionListener(this);
        insert.setBorder(bd);
        this.add(insert);
        ImageIcon img=new ImageIcon("images/uinsert.png");
        JLabel mainimg=new JLabel(img);
        mainimg.setBounds(0,100,700,600);
        this.add(mainimg);
        ImageIcon leftimg=new ImageIcon("images/sideimg.jpg");
        JLabel bgframe=new JLabel(leftimg);
        bgframe.setOpaque(true);
        bgframe.setBounds(700,0,800,750);
        bgframe.setBackground(new Color(51,51,51));
        this.add(bgframe);
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==file){
            frame=new JFrame();
            JFileChooser fchoose=new JFileChooser();
            int res=fchoose.showOpenDialog(frame);
            if(res==JFileChooser.APPROVE_OPTION){
                selectedFile = fchoose.getSelectedFile();
                fsrc=Path.of(selectedFile.getAbsolutePath());
                fname=selectedFile.getName();
                tb1.setText(fname);
                tb2.setText("pdf/user_files/"+fname);
                //System.out.println(fname);
            }
        }
        if(e.getSource()==insert){
            List<String> pdftxt = new ArrayList<>();
            List<String> edtxt = new ArrayList<>();
            try (PDDocument doc = PDDocument.load(selectedFile);
                 FileReader reader = new FileReader("ED.txt")) {
                PDFTextStripper strip = new PDFTextStripper();
                String text = strip.getText(doc);
                pdftxt.add(text);
                int data;
                while ((data = reader.read()) != -1) {
                    edtxt.add(String.valueOf((char) data));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            double match = calculate(pdftxt, edtxt);

            if (match >= 90) {
                System.out.println("Plagiarism Dectector Result: Plagiarism detected.");
            } else {
                System.out.println("Plagiarism Dectector Result: Plagiarism not detected.");
            }

            if(match<90){
                if(tb.getText().equals("") || tb1.getText().equals("") || tb2.getText().equals("") || tb3.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"All Fields are Mandatory..!");
                }else{
                    String ext=fsrc.getFileName().toString().substring(fsrc.getFileName().toString().lastIndexOf(".")+1);
                    if(ext.equalsIgnoreCase("pdf")){
                        try{
                            fdest=Path.of(tb2.getText());
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                            Statement state=conn.createStatement();
                            int res=state.executeUpdate("insert into user_files(username,mname,filename,filepath,filedesc) values('"+usern+"','"+tb.getText()+"','"+tb1.getText()+"','"+tb2.getText()+"','"+tb3.getText()+"')");
                            if(res!=-1){
                                Files.move(fsrc,fdest,StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("File moved");
                                JOptionPane.showMessageDialog(null,"Thank you for sharing your knowledge with us. Your code Uploaded Successfully..!","ED Alerts",JOptionPane.PLAIN_MESSAGE);
                                JOptionPane.showMessageDialog(null,"If you are done with your task, dont forgot to logout!","ED Alerts!",JOptionPane.INFORMATION_MESSAGE);
                                tb1.setText("");
                                tb2.setText("");
                                tb3.setText("");       
                                try{
                                    ArrayList<String> al=new ArrayList<String>();
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                                    Statement state2=conn2.createStatement();
                                    ResultSet set=state2.executeQuery("select * from user_login");
                                    while(set.next()){
                                        al.add(set.getString("email"));
                                    }
                                    set.close();
                                    state.close();
                                    conn.close();
                                    to=new String[10];
                                    to=al.toArray(new String[0]);
                                }catch(Exception ex2){
                                    System.out.println(ex2);
                                }
                                String[] arr1;
                                String from="bhaskartelore@gmail.com";
                                String subject="ED Member Arrival Alert!";
                                String text="Dear Member, Mr. "+tb.getText()+"\nhas Added some new content on ED about "+tb1.getText()+". \nContent Description: "+tb3.getText()+"\nCheck it out!";
                                Properties properties = new Properties();
                                properties.put("mail.smtp.auth", true);
                                properties.put("mail.smtp.starttls.enable", true);
                                properties.put("mail.smtp.port", "587");
                                properties.put("mail.smtp.host", "smtp.gmail.com");

                                String username = "bhaskartelore";
                                String password = "apmfhhhvvzbnbsfc";
                                Session session = Session.getInstance(properties, new Authenticator() {
                                    @Override
                                    protected PasswordAuthentication getPasswordAuthentication() {
                                        return new PasswordAuthentication(username, password);
                                    }
                                });
                                try {
                                    Message message = new MimeMessage(session);
                                    for (String recipient : to) {
                                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                                    }
                                    message.setFrom(new InternetAddress(from));
                                    message.setSubject(subject);
                                    message.setText(text);
                                    Transport.send(message);
                                    System.out.println("Message Sent..!");
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                } 
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Error Occured..!","ED Alerts",JOptionPane.ERROR_MESSAGE);   
                            }
                        }catch(Exception exc){
                            System.out.println(exc);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Error: Only PDF Files are Allowed..!","ED Alerts",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"ED Says: Plagiarism Detector found copied content, Your request will not proceed to next!!!","ED Plagiarism Detector",JOptionPane.WARNING_MESSAGE);
                tb1.setText("");
                tb2.setText("");
                tb3.setText("");
            }
        }
        else if(e.getSource()==alerts){
            ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","user_alerts.java");
            ProcessBuilder pb1=new ProcessBuilder("java","-cp",".;lib/connector.jar","user_alerts");
            try{
                pb.start();
                pb1.start();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        else if(e.getSource()==manage){
            ProcessBuilder pb=new ProcessBuilder("javac","-cp",".;lib/connector.jar","user_uploads.java");
            ProcessBuilder pb1=new ProcessBuilder("java","-cp",".;lib/connector.jar","user_uploads");
            try{
                pb.start();
                pb1.start();
                dispose();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        else if(e.getSource()==logout){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn4=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                Statement state4=conn4.createStatement();
                System.out.println(usern);
                ProcessBuilder process=new ProcessBuilder("java","-cp",".;lib/connector.jar","userlogin");
                try{
                    process.start();
                }catch(Exception f){
                    System.out.println(f);
                }
                int res4=state4.executeUpdate("update user_login set status='0' where username='"+usern+"'");
                if(res4!=-1)
                    System.out.println("status updated");
                state4.close();
                conn4.close();
            }catch(Exception y){
                System.out.println(y);
            }
            dispose();
        }
    }

    public double calculate(List<String> pdftxt, List<String> edtxt) {
        try {
            String extracted = pdftxt.stream().collect(Collectors.joining()).replaceAll("\\s", "").toLowerCase();
            String matching = edtxt.stream().collect(Collectors.joining()).replaceAll("\\s", "").toLowerCase();

            int totalch = Math.max(extracted.length(), matching.length());
            int matchch = 0;

            for (int i = 0; i < Math.min(extracted.length(), matching.length()); i++) {
                if (extracted.charAt(i) == matching.charAt(i)) {
                    matchch++;
                }
            }

            return ((double) matchch / totalch) * 100;
        } catch(Exception exc){
            System.out.println("Error: "+exc);
            return 0;
        }
    }

    public static void main(String[] args) {
        new user_insert();
    }
}
