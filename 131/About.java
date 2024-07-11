package university;

import javax.swing.*;
import java.awt.*;
public class About extends JFrame {
    
    About (){
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(new Color(120,120,120));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("about.jpg"));
        Image i2= i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);//TO WRITE SOMETHING ON THE IMAGE/FRAME
        image.setBounds(350,0,300,200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/> Management System</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma",Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By Misba Saher");
        name.setBounds(70,220,500,30);
        name.setFont(new Font("Tahoma",Font.PLAIN, 30));
        add(name);
        
        JLabel rollno = new JLabel("Reg no: 22ETCS002131");
        rollno.setBounds(70,280,500,30);
        rollno.setFont(new Font("Tahoma",Font.PLAIN, 30));
        add(rollno);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new About();
    }
    
}
