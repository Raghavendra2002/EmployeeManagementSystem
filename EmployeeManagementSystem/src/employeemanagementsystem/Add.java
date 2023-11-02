
package employeemanagementsystem;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;



public class Add extends JFrame  implements ActionListener{
    
    Random ran= new Random();
    int number=ran.nextInt(999999);
    
    JTextField tfname ,tffname,tfsalary,tfphone,tfaadhar,tfemail,tfdesignation,tfaddress;
     JLabel lblempid;
    
    JDateChooser dcdob;
    JComboBox cbeducation;
    
    JButton add,back;
            
    Add(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       //heading ........................................... 
       JLabel heading = new JLabel("Add employee details ");
       heading.setBounds(320, 30, 500, 50);
       heading.setFont(new Font("serit",Font.BOLD,25));
       add(heading);
       
       
       //name...............................................
       JLabel labelname = new JLabel("Name");
       labelname.setBounds(50, 150, 150, 30);
       labelname.setFont(new Font("serit",Font.PLAIN,20));
       add(labelname);
       
       tfname = new JTextField();
       tfname.setBounds(200, 150, 150, 30);
       add(tfname);
       
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
       
       
       dcdob= new JDateChooser();
       dcdob.setBounds(200, 200, 150, 30);
       add(dcdob);
       
       
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
       
       
      String courses[] = {"BBA","BCA","BTECH","MTECH"};
      cbeducation = new JComboBox(courses);
      cbeducation.setBounds(600, 300, 150, 30);
      cbeducation.setBackground(Color.WHITE);
      add(cbeducation);
      
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
       
       tfaadhar= new JTextField();
       tfaadhar.setBounds(600, 350, 150, 30);
       add(tfaadhar);
       
       
       //empid
       
        JLabel labelempid= new JLabel("empid");
       labelempid.setBounds(50, 400, 150, 30);
       labelempid.setFont(new Font("serit",Font.PLAIN,20));
       add(labelempid);
       
       lblempid= new JLabel(""+number);
       lblempid.setBounds(200, 400, 150, 30);
       lblempid.setFont(new Font("serit",Font.PLAIN,20));
       add(lblempid);
       
        
       add = new JButton("add details");
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
            String name=tfname.getText();
            String fname=tffname.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String phone =tfphone.getText();
            String email=tfemail.getText();
            String address = tfaddress.getText();
            String education = (String)cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empid=lblempid.getText();
            
            
            try {
                Conn c = new Conn();
                String query = "insert into employee values('"+name+"','"+fname+"','"+dob+"', '"+salary+"' , '"+address+"' ,'"+phone+"' , '"+email+"' , '"+education+"' , '"+designation+"' , '"+aadhar+"' , '"+empid+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added sucessfully");
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
       new Add();
   } 
}
