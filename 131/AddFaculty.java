package university;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddFaculty extends JFrame implements ActionListener {
    
    
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfadhar;
    JLabel labelempID;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    
    Random ran = new Random();
    String empID = "101" + String.format("%01d", Math.abs(ran.nextInt() % 100));

   AddFaculty (){
       
       setSize(900,700);
       setLocation(350,50);
       setLayout(null);
       
       getContentPane().setBackground(new Color(128,128,128));
       
       JLabel heading = new JLabel("New Faculty Details");
       heading.setBounds(310,30,500,50);
       heading.setFont(new Font("serif",Font.BOLD, 30));
       add(heading);
       
       JLabel lblname = new JLabel("Name");
       lblname.setBounds(50,150,100,30);
       lblname.setFont(new Font("serif",Font.BOLD,20));
       add(lblname);
       
       tfname = new JTextField();
       tfname.setBounds(200,150,150,30);
       add(tfname);
       
       JLabel lblfname= new JLabel("Father's Name");
       lblfname.setBounds(400,150,200,30);
       lblfname.setFont(new Font("serif",Font.BOLD,20));
       add(lblfname);
       
       tffname = new JTextField();
       tffname.setBounds(600,150,150,30);
       add(tffname);
       
       JLabel lblempID= new JLabel("EmpID");
       lblempID.setBounds(50,200,300,30);
       lblempID.setFont(new Font("serif",Font.BOLD,20));
       add(lblempID);
       
       labelempID= new JLabel(empID);
       labelempID.setBounds(200,200,300,30);
       labelempID.setFont(new Font("serif",Font.BOLD,20));
       add(labelempID);
       
       JLabel lbldob = new JLabel("DOB");
       lbldob.setBounds(400,200,300,30);
       lbldob.setFont(new Font("serif",Font.BOLD,20));
       add(lbldob);
       
       dcdob = new JDateChooser();
       dcdob.setBounds(600,200,150,30);
       add(dcdob);
       
       JLabel lbladdress= new JLabel("Address");
       lbladdress.setBounds(50,250,200,30);
       lbladdress.setFont(new Font("serif",Font.BOLD,20));
       add(lbladdress);
       
       tfaddress = new JTextField();
       tfaddress.setBounds(200,250,150,30);
       add(tfaddress);
       
       JLabel lblphone= new JLabel("Phone No.");
       lblphone.setBounds(400,250,200,30);
       lblphone.setFont(new Font("serif",Font.BOLD,20));
       add(lblphone);
       
       tfphone = new JTextField();
       tfphone.setBounds(600,250,150,30);
       add(tfphone);
       
       JLabel lblemail= new JLabel("Email Id");
       lblemail.setBounds(50,300,200,30);
       lblemail.setFont(new Font("serif",Font.BOLD,20));
       add(lblemail);
       
       tfemail = new JTextField();
       tfemail.setBounds(200,300,150,30);
       add(tfemail);
       
       JLabel lblx= new JLabel("Class X (%)");
       lblx.setBounds(400,300,200,30);
       lblx.setFont(new Font("serif",Font.BOLD,20));
       add(lblx);
       
       tfx = new JTextField();
       tfx.setBounds(600,300,150,30);
       add(tfx);
       
       
       JLabel lblxii= new JLabel("Class XII (%)");
       lblxii.setBounds(50,350,200,30);
       lblxii.setFont(new Font("serif",Font.BOLD,20));
       add(lblxii);
       
       tfxii = new JTextField();
       tfxii.setBounds(200,350,150,30);
       add(tfxii);
       
       JLabel lbladhar= new JLabel("Adhar No.");
       lbladhar.setBounds(400,350,200,30);
       lbladhar.setFont(new Font("serif",Font.BOLD,20));
       add(lbladhar);
       
       tfadhar = new JTextField();
       tfadhar.setBounds(600,350,150,30);
       add(tfadhar);
       
       JLabel lblcourse = new JLabel("Qualification");
       lblcourse.setBounds(50,400,200,30);
       lblcourse.setFont(new Font("serif",Font.BOLD,20));
       add(lblcourse);
       
       String course[] = {"B.Tech","FAD","M.Tech","Bsc","Msc","MBBS","BDS","MBA"};
       cbcourse = new JComboBox(course);
       cbcourse.setBounds(200,400,150,30);
       cbcourse.setBackground(Color.WHITE);
       add(cbcourse);
       
       JLabel lblbranch = new JLabel("Department");
       lblbranch.setBounds(400,400,200,30);
       lblbranch.setFont(new Font("serif",Font.BOLD,20));
       add(lblbranch);
       
       String branch[] = {"Computer Science","Information Science","AI&ML","Aerospace ","Robotics","Civil","Mechanical","Product Design","Fashion Design"};
       cbbranch = new JComboBox(branch);
       cbbranch.setBounds(600,400,150,30);
       cbbranch.setBackground(Color.WHITE);
       add(cbbranch);
       
       
        submit= new JButton("Submit");
        submit.setBounds(250,550,120,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD,16));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450,550,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD,16));
        add(cancel);

       
       
       setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String empID = labelempID.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x= tfx.getText();
            String xii = tfxii.getText();
            String adhar=tfadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            
            try{
                String query ="insert into faculty values('"+name+"', '"+fname+"','"+empID+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+adhar+"', '"+course+"', '"+branch+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Faculty Details Inserted Sucessfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddFaculty();
    }
}

