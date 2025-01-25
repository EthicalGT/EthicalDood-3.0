import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;
class admin_insert extends JFrame implements ActionListener{
    JTextField tb1,tb2,tb3;
    JButton file,insert;
    JFrame frame;
    Path fsrc,fdest;
    admin_insert(){
        Border bd=BorderFactory.createMatteBorder(1,1,1,1,new Color(102,255,102));
        this.setTitle("Ethicaldood - Admin Insert");
        Image icon2=Toolkit.getDefaultToolkit().getImage("images/fevicon.png");
        this.setIconImage(icon2);
        getContentPane().setBackground(Color.black);
        ImageIcon img=new ImageIcon("images/addfile.jpeg");
        JLabel mainimg=new JLabel(img);
        mainimg.setBounds(630,50,100,100);
        this.add(mainimg);
        JLabel lbl1=new JLabel("Filename");
        lbl1.setBounds(505,200,100,50);
        lbl1.setForeground(new Color(102,255,102));
        lbl1.setFont(new Font("Calibri",Font.PLAIN,25));
        this.add(lbl1);
        tb1=new JTextField();
        tb1.setBounds(505,250,350,40);
        tb1.setBorder(bd);
        tb1.setBackground(Color.black);
        tb1.setFont(new Font("Calibri",Font.PLAIN,25));
        tb1.setForeground(Color.white);
        this.add(tb1); 
        JLabel lbl2=new JLabel("Path");
        lbl2.setBounds(505,300,100,50);
        lbl2.setForeground(new Color(102,255,102));
        lbl2.setFont(new Font("Calibri",Font.PLAIN,25));
        this.add(lbl2);
        tb2=new JTextField();
        tb2.setBounds(505,350,350,40);
        tb2.setBorder(bd);
        tb2.setBackground(Color.black);
        tb2.setFont(new Font("Calibri",Font.PLAIN,25));
        tb2.setForeground(Color.white);
        this.add(tb2);
        file=new JButton("Select File");   
        file.setBounds(505,420,350,40);
        file.setForeground(Color.white);
        file.setBackground(new Color(0,255,51));
        file.setFont(new Font("Calibri",Font.PLAIN,22));
        file.setFocusPainted(false);
        file.addActionListener(this);
        this.add(file);
        JLabel lbl3=new JLabel("Description");
        lbl3.setBounds(505,470,150,50);
        lbl3.setForeground(new Color(102,255,102));
        lbl3.setFont(new Font("Calibri",Font.PLAIN,25));
        this.add(lbl3);     
        tb3=new JTextField();
        tb3.setBounds(505,520,350,40);
        tb3.setBorder(bd);
        tb3.setBackground(Color.black);
        tb3.setFont(new Font("Calibri",Font.PLAIN,25));
        tb3.setForeground(Color.white);
        this.add(tb3);
        insert=new JButton("Add File");
        insert.setBounds(505,590,350,40);
        insert.setForeground(Color.white);
        insert.setBackground(new Color(0,255,51));
        insert.setFont(new Font("Calibri",Font.PLAIN,22));
        insert.setFocusPainted(false);
        insert.addActionListener(this);
        this.add(insert);
        ImageIcon leftimg=new ImageIcon("images/bg.jpg");
        JLabel bgframe=new JLabel(leftimg);
        bgframe.setOpaque(true);
        bgframe.setBounds(0,0,1550,750);
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
            File selectedFile = fchoose.getSelectedFile();
            fsrc=Path.of(selectedFile.getAbsolutePath());
            tb2.setText("pdf/admin_files/"+selectedFile.getName());
        }
    }
    if(e.getSource()==insert){
        String ext=fsrc.getFileName().toString().substring(fsrc.getFileName().toString().lastIndexOf(".")+1);
        if(ext.equalsIgnoreCase("pdf")){
        try{
        fdest=Path.of(tb2.getText());
        Files.move(fsrc,fdest,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ethicaldood","root","");
        Statement state=conn.createStatement();
        int res=state.executeUpdate("insert into admin_files values('"+tb1.getText()+"','"+tb2.getText()+"','"+tb3.getText()+"')");
        if(res!=-1){
            JOptionPane.showMessageDialog(null,"File Uploaded Successfully..!");
        }
        else{
        JOptionPane.showMessageDialog(null,"Error Occured..!");   
        }
    }catch(Exception exc){
        System.out.println(exc);
    }
}else{
    JOptionPane.showMessageDialog(null,"Error: Only PDF Files are Allowed..!");
}
}
}
	public static void main(String[] args) {
		new admin_insert();
        
	}
}