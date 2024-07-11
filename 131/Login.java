package university;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, cancel;
    JTextField tfusername;
    JPasswordField tfpassword;
    Login (){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,20);//left,right,width,height
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,60,100,20);//left,right,width,height
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150,60,150,20);
        add(tfpassword);
        
        login= new JButton("Login");
        login.setBounds(50,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD,16));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD,16));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);//TO WRITE SOMETHING ON THE IMAGE/FRAME
        image.setBounds(350,20,200,200);
        add(image);
        
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("background.jpeg"));
        Image i22= i11.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel img = new JLabel(i33);//TO WRITE SOMETHING ON THE IMAGE/FRAME
        img.setBounds(0,0,600,300);
        add(img);
       
        setSize(600,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == login){
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from login where username = '" + username+"' and password ='"+password+"'";
            try{
                Conn c = new Conn();
                ResultSet rs =c.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Project();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                    setVisible(false);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == cancel){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
