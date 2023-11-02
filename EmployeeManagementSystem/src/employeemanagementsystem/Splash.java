
package employeemanagementsystem;


import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    
    JButton clickhere;
    
    Splash(){
       
       setBounds(200,50,1170,650);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
       heading.setBounds(80, 30, 1200, 60);
       heading.setFont(new Font("serit",Font.PLAIN,60));
       heading.setForeground(Color.red);
       add(heading);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       
       JLabel image = new JLabel(i3);
       image.setBounds(50, 100, 1050, 500);
       add(image);
       
       
       
       clickhere = new JButton("click here to continue");
       clickhere.setBounds(400, 400, 300, 70);
       clickhere.setBackground(Color.BLACK);
       clickhere.setForeground(Color.WHITE);
       clickhere.addActionListener(this);
       image.add(clickhere);
       
       setVisible(true); 
       
       
       while(true){
           heading.setVisible(false);
           
          try{
               
               Thread.sleep(500); 
               
           }catch(Exception e){
               //e.printStackTrace();
           }
           
           heading.setVisible(true);
           
            try{
               
               Thread.sleep(500);
               
           }catch(Exception e){
               //e.printStackTrace();
           }
           
       }
    }
    
    
    public  void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
    
    
    
    
    public static void main(String[] args){
        
        new Splash();
        
    }
    
}
