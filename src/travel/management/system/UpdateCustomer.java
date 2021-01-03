package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	JComboBox c1;
	JRadioButton r1,r2;
	JButton b1,b2;
	
	
     UpdateCustomer(String user){
    	 
    	 JLabel l11=new JLabel("UPDATE CUSTOMER DETAILS");
  		l11.setBounds(50, 0, 300, 25);
  	    l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
  		add(l11);
    	 

 		JLabel l1=new JLabel("Username :");
 		l1.setBounds(30, 50, 150, 25);
 	//	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l1);
 		
 		t1= new JTextField();
		t1.setBounds(220, 50, 150, 25);
	//	t1.setBorder(BorderFactory.createEmptyBorder());
		add(t1);
		
		
		JLabel l2=new JLabel("ID :");
 		l2.setBounds(30, 90, 150, 25);
 	//	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l2);
 		

 		t8= new JTextField();
		t8.setBounds(220, 90, 150, 25);
	//	t8.setBorder(BorderFactory.createEmptyBorder());
		add(t8);
		
		
		
		JLabel l3=new JLabel("Number :");
 		l3.setBounds(30, 130, 150, 25);
 	//	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l3);
 		
 		t2= new JTextField();
		t2.setBounds(220, 130, 150, 25);
	//	t2.setBorder(BorderFactory.createEmptyBorder());
		add(t2);
		
		
		
		JLabel l4=new JLabel("Name :");
 		l4.setBounds(30, 170, 150, 25);
 	//	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l4);
 		
 		t3= new JTextField();
		t3.setBounds(220, 170, 150, 25);
	//	t3.setBorder(BorderFactory.createEmptyBorder());
		add(t3);
		
		
		JLabel l5=new JLabel("Gender :");
 		l5.setBounds(30, 210, 150, 25);
 	//	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l5);
 		
 		

 		t9= new JTextField();
		t9.setBounds(220, 210, 150, 25);
	//	t9.setBorder(BorderFactory.createEmptyBorder());
		add(t9);
 		
 		
 		JLabel l6=new JLabel("Country :");
 		l6.setBounds(30, 250, 150, 25);
 	//	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l6);
 		
 		t4= new JTextField();
		t4.setBounds(220, 250, 150, 25);
	//	t4.setBorder(BorderFactory.createEmptyBorder());
		add(t4);
		
		
		
		JLabel l7=new JLabel("Address :");
 		l7.setBounds(30, 290, 150, 25);
 	//	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l7);
 		
 		t5= new JTextField();
		t5.setBounds(220, 290, 150, 25);
	//	t5.setBorder(BorderFactory.createEmptyBorder());
		add(t5);
    	 
		
		
		JLabel l8=new JLabel("Phone No. :");
 		l8.setBounds(30, 330, 150, 25);
 	//	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l8);
 		
 		t6= new JTextField();
		t6.setBounds(220, 330, 150, 25);
	//	t6.setBorder(BorderFactory.createEmptyBorder());
		add(t6);
		
		
		
		JLabel l9=new JLabel("Email :");
 		l9.setBounds(30, 370, 150, 25);
 	//	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
 		add(l9);
 		
 		t7= new JTextField();
		t7.setBounds(220, 370, 150, 25);
	//	t7.setBorder(BorderFactory.createEmptyBorder());
		add(t7);
		
		

	    b1= new JButton("Update");
		b1.setBounds(70, 430, 100, 25);
	//	b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		
	    b2=new JButton("Back");
		b2.setBounds(220, 430, 100, 25);
	//	b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("update1.jpg"));
		Image i2= i1.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l10= new JLabel(i3);
     	l10.setBounds(450, 50, 300, 350);
		add(l10);
		
		
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from customer where username='"+user+"'");
			
			while(rs.next()) {
				t1.setText(rs.getString("username"));
				t2.setText(rs.getString("number"));
				t3.setText(rs.getString("name"));
				t4.setText(rs.getString("country"));
				t5.setText(rs.getString("address"));
				t6.setText(rs.getString("phone"));
				t7.setText(rs.getString("email"));
				t8.setText(rs.getString("id"));
				t9.setText(rs.getString("gender"));
			}
		}
		
		catch(Exception e) {
			
		}
		
		
		
    	 setBounds(320, 180, 850, 550);
    	 getContentPane().setBackground(Color.white);
    	 setLayout(null);
     }
     
     
     
     public void actionPerformed(ActionEvent ae) {
    	
    	 
    	 if(ae.getSource()==b1) {
    		 
    		 
        	 String username=t1.getText();
        	 String id=t8.getText();
        	 String number=t2.getText();
        	 String name=t3.getText();
        	 String radio=t9.getText();
        	 String country=t4.getText();
        	 String address=t5.getText();
        	 String phone=t6.getText();
        	 String email=t7.getText();
        	 
        	 String q="update customer set username='"+username+"', id= '"+id+"', number= '"+number+"', name= '"+name+"',gender= '"+radio+"',country= '"+country+"',address= '"+address+"',phone= '"+phone+"',email= '"+email+"'";
        	 try {
        		 Conn c=new Conn();
        		 c.s.executeUpdate(q);
        		 
        		 JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
        		 this.setVisible(false);
        	 }
        	 
        	 catch(Exception e) {
        		 
        	 }
    		 
    	 }
    	 
    	 if(ae.getSource()==b2) {
    		 this.setVisible(false);
    	 }
     }
     
     public static void main(String args[]) {
    	 new UpdateCustomer("").setVisible(true);
     }
}
