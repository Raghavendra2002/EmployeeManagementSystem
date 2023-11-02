
package employeemanagementsystem;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;
import java.sql.*;



public class Update extends JFrame  implements ActionListener{
    
    
    JTextField tfeducation,tffname,tfsalary,tfphone,tfaadhar,tfemail,tfdesignation,tfaddress,tfname;
     JLabel lblempid;
    
    
    
    JButton add,back;
    
    String empid;
            
    Update(String empid){
        
        this.empid=empid;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       //heading ........................................... 
       JLabel heading = new JLabel("Update employee details ");
       heading.setBounds(320, 30, 500, 50);
       heading.setFont(new Font("serit",Font.BOLD,25));
       add(heading);
       
       
       //name...............................................
       JLabel labelname = new JLabel("Name");
       labelname.setBounds(50, 150, 150, 30);
       labelname.setFont(new Font("serit",Font.PLAIN,20));
       add(labelname);
       
       JLabel lblname = new JLabel();
       lblname.setBounds(200, 150, 150, 30);
       add(lblname);
       
       //father name.....................................................
       JLabel labelfname = new JLabel("father Name");
       labelfname.setBounds(400, 150, 150, 30);
       labelfname.setFont(new Font("serit",Font.PLAIN,20));
       add(labelfname);
       
       tffname = new JTextField();
       tffname.setBounds(600, 150, 150, 30);
       add(tffname);
       
       //dob/........................................
       
       JLabel labeldob = new JLabel("Date of birth");
       labeldob.setBounds(50, 200, 150, 30);
       labeldob.setFont(new Font("serit",Font.PLAIN,20));
       add(labeldob);
       
       
       JLabel lbldob = new JLabel();
       lbldob.setBounds(200, 200, 150, 30);
       add(lbldob);
       
       
        //salary.....................................................
       JLabel labelsalary= new JLabel("salary");
       labelsalary.setBounds(400, 200, 150, 30);
       labelsalary.setFont(new Font("serit",Font.PLAIN,20));
       add(labelsalary);
       
       tfsalary= new JTextField();
       tfsalary.setBounds(600, 200, 150, 30);
       add(tfsalary);
       
       
       //addres...........................................
       JLabel labeladdress= new JLabel("addresss");
       labeladdress.setBounds(50, 250, 150, 30);
       labeladdress.setFont(new Font("serit",Font.PLAIN,20));
       add(labeladdress);
       
       tfaddress = new JTextField();
       tfaddress.setBounds(200, 250, 150, 30);
       add(tfaddress);
       
       
       
       //phone.........................
       
        JLabel labelphone= new JLabel("phione");
       labelphone.setBounds(400, 250, 150, 30);
       labelphone.setFont(new Font("serit",Font.PLAIN,20));
       add(labelphone);
       
       tfphone= new JTextField();
       tfphone.setBounds(600, 250, 150, 30);
       add(tfphone);
       
       
       // email,................................
        JLabel labelemail= new JLabel("email");
       labelemail.setBounds(50, 300, 150, 30);
       labelemail.setFont(new Font("serit",Font.PLAIN,20));
       add(labelemail);
       
       tfemail= new JTextField();
       tfemail.setBounds(200, 300, 150, 30);
       add(tfemail);
       
       
       //education 
       
        JLabel labeleducation= new JLabel("hightest education");
       labeleducation.setBounds(400, 300, 150, 30);
       labeleducation.setFont(new Font("serit",Font.PLAIN,20));
       add(labeleducation);
       
       
      
      tfeducation = new JTextField();
      tfeducation.setBounds(600, 300, 150, 30);
      tfeducation.setBackground(Color.WHITE);
      add(tfeducation);
      
      //designation...................
      
       JLabel labeldesignation= new JLabel("designation");
       labeldesignation.setBounds(50, 350, 150, 30);
       labeldesignation.setFont(new Font("serit",Font.PLAIN,20));
       add(labeldesignation);
       
       tfdesignation= new JTextField();
       tfdesignation.setBounds(200, 350, 150, 30);
       add(tfdesignation);
       
       
       //aadhar .........................
       
        JLabel labelaadhar= new JLabel("aadhar");
       labelaadhar.setBounds(400, 350, 150, 30);
       labelaadhar.setFont(new Font("serit",Font.PLAIN,20));
       add(labelaadhar);
       
       JLabel lblaadhar= new JLabel();
       lblaadhar.setBounds(600, 350, 150, 30);
       add(lblaadhar);
       
       
       //empid
       
        JLabel labelempid= new JLabel("empid");
       labelempid.setBounds(50, 400, 150, 30);
       labelempid.setFont(new Font("serit",Font.PLAIN,20));
       add(labelempid);
       
       lblempid= new JLabel();
       lblempid.setBounds(200, 400, 150, 30);
       lblempid.setFont(new Font("serit",Font.PLAIN,20));
       add(lblempid);
       
       
       try {
           
           Conn c = new Conn();
           String query = "select * from employee where empid='"+empid+"'" ;
           
           ResultSet rs = c.s.executeQuery(query);
           
           while(rs.next()){
               lblname.setText(rs.getString("name"));
               tffname.setText(rs.getString("fname"));
               lbldob.setText(rs.getString("dob"));
               tfaddress.setText(rs.getString("name"));
               tfsalary.setText(rs.getString("name"));
               tfphone.setText(rs.getString("name"));
               tfemail.setText(rs.getString("email"));
               tfeducation.setText(rs.getString("education"));
               tfdesignation.setText(rs.getString("designation"));
               lblaadhar.setText(rs.getString("aadhar"));
               lblempid.setText(rs.getString("empid"));
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
       
        
       add = new JButton("update details");
       add.setBounds(250, 550, 150, 40);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
      add.addActionListener(this);
       add(add);
       
       back = new JButton("back ");
       back.setBounds(450, 550, 150, 40);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
      back.addActionListener(this);
       add(back);
        
        setBounds(300,100,900,700);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
           // String name=tfname.getText();
            String fname=tffname.getText();
            //String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String phone =tfphone.getText();
            String email=tfemail.getText();
            String address = tfaddress.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            //String aadhar = tfaadhar.getText();
            //String empid=lblempid.getText();
            
            
            try {
                Conn c = new Conn();
                String query = "update  employee set  fname = '"+fname+"' , salary = '"+salary+"' , address = '"+address+"' , phone ='"+phone+"' ,  email = '"+email+"' , education = '"+education+"' , designation = '"+designation+"'  where empid = '"+empid+"' ";
                
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated  sucessfully");
                setVisible(false);
                new Home();
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else {
            setVisible(false);
            new Home();
        }
    }
   public static void main(String[] args){
       new Update("id");
   } 
}
