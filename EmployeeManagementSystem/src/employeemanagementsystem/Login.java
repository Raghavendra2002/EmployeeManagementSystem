package employeemanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;





public class Login extends JFrame implements ActionListener{
    JButton login;
    JTextField  tfusername;
    JTextField  tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(450,200,600,300);
        setLayout(null);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        JLabel lblpassword = new JLabel("password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);
        
        
       tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);
        
        
       login = new JButton("LOGIN");
       login.setBounds(150, 140, 150, 30);
       login.setBackground(Color.BLACK);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
       
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
       Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       
       JLabel image = new JLabel(i3);
       image.setBounds(300, 0, 200, 200);
       add(image);
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        try {
            
            String username=tfusername.getText();
            String password=tfpassword.getText();
            
            Conn c = new Conn();
            
            String query = "select * from login where username = '"+username+"' and password ='"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            
            if(rs.next()){
                setVisible(false);
                new Home();
            }else {
                JOptionPane.showMessageDialog(null, "Invalid user name");
                setVisible(false);
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
