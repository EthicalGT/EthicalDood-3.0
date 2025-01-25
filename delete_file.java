import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.time.*;
class delete_file extends JFrame implements ActionListener{
    JTextArea tb1;
    JTextField tb;
    JButton btn,create;
    String mname;
	delete_file(){
        InputStream font=delete_file.class.getResourceAsStream("font/Poppins-Regular.ttf");
        Font myfont=null;
        try{
            myfont=Font.createFont(Font.TRUETYPE_FONT,font);
        }catch(Exception fexc){
            System.out.println(fexc);
        }
        Font myboldfont=myfont.deriveFont(Font.BOLD);
        JLabel heading=new JLabel("<html>ED Content Management</html>");
        heading.setBounds(370,50,800,120);
        heading.setForeground(Color.white);
        heading.setFont(myboldfont.deriveFont(50f));
        this.add(heading);
        JLabel desc=new JLabel("<html>Hey There GT!, Enter the message by which user will be able to understand contents eligibility based on our system. This will help maintain a positive and respectful community.</html>");
        desc.setBounds(380,140,600,120);
        desc.setForeground(Color.white);
        desc.setFont(myfont.deriveFont(20f));
        this.add(desc);
        Border bdbtn=BorderFactory.createMatteBorder(1,1,1,1,Color.decode("#f7f7f7"));
        Border bottombd=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        Border bd=BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        create=new JButton("Submit");
        create.setBounds(610,470,200,40);
        create.setOpaque(true);
        create.setContentAreaFilled(false);
        create.setFont(myfont.deriveFont(20f));
        create.setForeground(Color.white);
        create.setBorder(bdbtn);
        create.setFocusPainted(false);
        this.add(create);
        create.addActionListener(this);
        JLabel lbl=new JLabel("File ID: ");
        lbl.setBounds(400,275,150,50);
        lbl.setForeground(Color.white);
        lbl.setFont(myfont.deriveFont(18f));
        this.add(lbl);
        tb=new JTextField();
        tb.setBounds(500,270,440,50);
        tb.setBorder(bd);
        tb.setFont(myfont.deriveFont(18f));
        tb.setForeground(Color.white);
        tb.setOpaque(false);
        this.add(tb);
        JLabel uname=new JLabel("Message :");
        uname.setBounds(400,340,150,50);
        uname.setForeground(Color.white);
        uname.setFont(myfont.deriveFont(18f));
        this.add(uname);
        tb1=new JTextArea();
        tb1.setBounds(500,350,440,100);
        tb1.setBorder(bottombd);
        tb1.setFont(myfont.deriveFont(18f));
        tb1.setForeground(Color.white);
        tb1.setOpaque(false);
        this.add(tb1);
        ImageIcon img=new ImageIcon("images/bg2.jpg");
        JLabel sidebg=new JLabel(img);
        sidebg.setSize(1367,768);
        sidebg.setOpaque(true);
        this.add(sidebg);
        
        
        Border btnbd=BorderFactory.createMatteBorder(1,1,1,1,new Color(51,204,255));
        this.setTitle("ED Admin- Content Management");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        this.setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==create){
            LocalDate date = LocalDate.now();
            LocalTime time=LocalTime.now();
            String dt=String.valueOf(date)+" "+String.valueOf(time);
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
                    Statement state=conn.createStatement();
                    ResultSet set=state.executeQuery("select mname from user_files where fid='"+tb.getText()+"'");
                    while(set.next()){
                        mname=set.getString("mname")+" ";
                    }
                    String query="delete from user_files where fid='"+tb.getText()+"'";
                    String sql="insert into deleted_files values('"+mname+" "+tb1.getText()+"','"+dt+"')";
                    int res=state.executeUpdate(sql);
                    int op=state.executeUpdate(query);
                    if(res!=-1 && op!=-1){
                    JOptionPane.showMessageDialog(null,"Action Performed!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Error Occured!");
                    }
                    set.close();
                    state.close();
                    conn.close();
                }catch(Exception exc){
                    System.out.println(exc);
                }
    }
}
	public static void main(String[] args) {
		new delete_file();
        }
}