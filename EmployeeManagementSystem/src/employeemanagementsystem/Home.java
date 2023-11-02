
package employeemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Home  extends JFrame implements ActionListener{
    
    JButton add,remove,view,update;
    
    
    Home(){
        setBounds(250,100,1120,630);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       
       JLabel image = new JLabel(i3);
       image.setBounds(0, 0, 1120, 630);
       add(image);

       
       JLabel heading = new JLabel("Employee management system");
       heading.setBounds(650, 20, 400, 40);
       heading.setFont(new Font("serit",Font.BOLD,25));
       image.add(heading);
       
       add = new JButton("add");
       add.setBounds(650, 80, 150, 40);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add.addActionListener(this);
       add(add);
       
       view = new JButton("view");
       view.setBounds(820, 80, 150, 40);
       view.setBackground(Color.BLACK);
       view.setForeground(Color.WHITE);
       view.addActionListener(this);
       add(view);
       
       
       update = new JButton("update");
       update.setBounds(650, 140, 150, 40);
       update.setBackground(Color.BLACK);
       update.setForeground(Color.WHITE);
       update.addActionListener(this);
       add(update);
       
       remove = new JButton("remove");
       remove.setBounds(820, 140, 150, 40);
       remove.setBackground(Color.BLACK);
       remove.setForeground(Color.WHITE);
       remove.addActionListener(this);
       add(remove);
        
        
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==add){
            
            setVisible(false);
            
            new Add();
        }
        else if (ae.getSource()==view){
            setVisible(false);
            new View();
        }
        else if(ae.getSource()==remove){
            setVisible(false);
            
            new Remove();
        }
        
        else if(ae.getSource()==update){
            setVisible(false);
            new View();
            
        }
    }
    
    public static void main(String[] args){
        new Home();
    }
    
}
