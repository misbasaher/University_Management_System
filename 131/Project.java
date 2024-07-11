package university;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        setSize(1540,850);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("main.jpg"));
        Image i2= i1.getImage().getScaledInstance(1600, 650, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);//TO WRITE SOMETHING ON THE IMAGE/FRAME
        image.setBounds(550,0,500,500);
        add(image);
        
        //Adding new Information.
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLACK);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        newInformation.add(studentInfo);
        studentInfo.addActionListener(this);
        setJMenuBar(mb);
       
        //Details of each menu
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        mb.add(details);
        
        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
  
        
        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);
        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);
        
        JMenuItem entermarks = new JMenuItem("Enter marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //UPDATE INFO
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
        updatefacultyInfo .setBackground(Color.WHITE);
        updatefacultyInfo.addActionListener(this);
        updateInfo.add(updatefacultyInfo );
        
        JMenuItem updatestudentInfo  = new JMenuItem("Update Student Details");
        updatestudentInfo.setBackground(Color.WHITE);
        updatestudentInfo.addActionListener(this);
        updateInfo.add(updatestudentInfo);
        
        //FEE DETAILS
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform  = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        // UTILITY
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        getContentPane().setBackground(new Color(0,0,0));
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        getContentPane().setBackground(new Color(0,0,0));
        utility.add(calc);
        
        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);
        
        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Deatils");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);
        
        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);
        
        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Deatils");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);
        
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);
        
        JMenuItem ab  = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
      
        //  LOGOUT
        JMenu exit = new JMenu("Logout");
        exit.setForeground(Color.BLACK);
        mb.add(exit);
        
        JMenuItem logout  = new JMenuItem("Logout");
        logout.setBackground(Color.WHITE);
        logout.addActionListener(this);
        exit.add(logout);
        
        setJMenuBar(mb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("Logout")){
            setVisible(false);
        }else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("Calc.exe");
            }catch (Exception e){}
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){}
        }else if (msg.equals("New Faculty Information")){
            new AddFaculty();
            
        }else if (msg.equals("New Student Information")){
            new AddStudent();
        }
        else if (msg.equals("View Faculty Details")){
            new FacultyDetails();
        }else if (msg.equals("View Student Details")){
            new StudentDetails();
        }else if (msg.equals("Faculty Leave")){
            new FacultyLeave();
        }else if (msg.equals("Student Leave")){
            new StudentLeave();
        }else if (msg.equals("Faculty Leave Details")){
            new FacultyLeaveDetails();
        }else if (msg.equals("Student Leave Deatils")){
            new StudentLeaveDetails();
        }else if (msg.equals("Update Faculty Details")){
            new UpdateFaculty();
        }else if (msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if (msg.equals("Enter marks")){
            new EnterMarks();
        }else if (msg.equals("Examination Results")){
            new ExaminationDetails();
        }else if (msg.equals("Fee Structure")){
            new FeeStructure();
        }else if (msg.equals("About")){
            new About();
        }else if (msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
    public static void main(String[] args){
        new Project ();
    }
}
