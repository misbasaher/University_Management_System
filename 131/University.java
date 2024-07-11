package university;
import javax.swing.*;
import java.awt.*;

public class University extends JFrame implements Runnable {// in java 2 clss cannat be extended so we make use of this
    Thread t;
    University() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("clg.jpeg"));
        Image i2= i1.getImage().getScaledInstance(1000, 640, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);//TO WRITE SOMETHING ON THE IMAGE/FRAME
        add(image);
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        int x=1;
        for(int i =2;i<=600; i+=4,x+=1){
            setLocation(600- ((i+x)/2),350-(i/2));
            setSize(i+3*x,i+x/2);
            try{
                Thread.sleep(8);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//MULTITHREADING METHOD
    public void run(){
        try {
            Thread.sleep(5000); //AFTER 5SEC IT WILL CLOSE
            setVisible(false);// Next Frame
            new Login ();
        } catch(Exception e){
        e.printStackTrace();
        }
    }public static void main(String[] args) {
        new University();
    }
}
