package university;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class FacultyDetails extends JFrame implements ActionListener {
    
    Choice cempID;
    JTable table;
    JButton search, print, update, add, cancel;
    FacultyDetails(){
        
        getContentPane().setBackground(new Color(112,128,144));
        setLayout(null);
        
        JLabel heading =new JLabel("Search by Employee ID");
        heading.setBounds(20,20,150,20);
        add(heading);
        
        cempID = new Choice();
        cempID.setBounds(180,20,150,20);
        add(cempID );
        
        
        try{
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from faculty");
            while(rs.next()){
                cempID.add(rs.getString("empID"));
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try{
            Conn c =new Conn();
            ResultSet rs = c.s.executeQuery("select * from faculty");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        print  = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);
        
        add = new JButton("Add");
        add.setBounds(320,70,80,20);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(420,70,80,20);
        cancel.addActionListener(this);
        add(cancel);
        
        
        setSize(900, 700);
        setLocation(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() ==search){
            String query ="select * from faculty where empID ='"+cempID.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == print){
            try{
                table.print();
            } catch (Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == add){
            setVisible(false);
            new AddFaculty();
            
        }else if (ae.getSource() == update){
            setVisible(false);
            new UpdateFaculty();
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new FacultyDetails();
    }
    
}