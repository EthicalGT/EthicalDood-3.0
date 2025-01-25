import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.*;
import java.sql.*;

public class emailsender{
  String[] to;
  String user;
  String desc;
    public void sendEmail() {
      try{
      ArrayList<String> al=new ArrayList<String>();
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
      Statement state=conn.createStatement();
      ResultSet set=state.executeQuery("select * from user_login");
      while(set.next()){
      al.add(set.getString("email"));
    }
    set.close();
    ResultSet set2=state.executeQuery("select * from user_files");
    while(set2.next()){
      user=set2.getString("mname");
      desc=set2.getString("filedesc");
    }
    set2.close();
    to=new String[10];
    to=al.toArray(new String[0]);
  }catch(Exception e){
    System.out.println(e);
  }
        String[] arr1;
        String from="bhaskartelore@gmail.com";
        String subject="Member Arrival Alert!";
        String text="Dear Member, Mr. "+user+"\nhas Added some new content on ED. \nContent Description: "+desc+"\nCheck it out!";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");

        String username = "bhaskartelore";
        String password = "apmfhhhvvzbnbsfc";

        // session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            // Set multiple recipients
            for (String recipient : to) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            }
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            System.out.println("Message Sent..!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        emailsender ob = new emailsender();
        ob.sendEmail();
    }
}
