package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
   
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	
	ForgotPassword(){
		
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBounds(30, 30, 500, 280);
		add(p1);
		
		

		JLabel l1=new JLabel("Username");
		l1.setBounds(40, 20, 100, 25);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.add(l1);
		
		
		t1= new JTextField();
		t1.setBounds(200, 20, 150, 25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		
		b1=new JButton("Search");
		b1.setBounds(380, 20, 100, 25);
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
     	b1.addActionListener(this);
		p1.add(b1);
		
		
		JLabel l2=new JLabel("Name");
		l2.setBounds(40, 60, 100, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.add(l2);
		
		
		t2= new JTextField();
		t2.setBounds(200, 60, 150, 25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		
		
		JLabel l3=new JLabel("Security Question");
		l3.setBounds(40, 100, 140, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.add(l3);
		
		
		t3= new JTextField();
		t3.setBounds(200, 100, 250, 25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t3);
		
		
		
		JLabel l4=new JLabel("Answer");
		l4.setBounds(40, 140, 140, 25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.add(l4);
		
		
		

		t4= new JTextField();
		t4.setBounds(200, 140, 150, 25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		
		
		
		b2=new JButton("Retrieve");
		b2.setBounds(380, 140, 100, 25);
	    b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		p1.add(b2);
		
		
		JLabel l5=new JLabel("Password");
		l5.setBounds(40, 180, 125, 25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.add(l5);
		
		
		t5= new JTextField();
		t5.setBounds(200, 180, 150, 25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t5);
		
		
		b3=new JButton("Back");
		b3.setBounds(170, 230, 100, 25);
	    b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setBackground(Color.gray);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		p1.add(b3);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("forgotpassword.jpg"));
		Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l6=new JLabel(i3);
		l6.setBounds(580, 70, 200, 200);
		add(l6);

		
		
		
		
		setBounds(300, 200, 850, 380);
		getContentPane().setBackground(Color.white);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Conn c= new Conn();
		if(ae.getSource()==b1) {
			try {
			String sql="select * from account where username='"+t1.getText()+"'";
			ResultSet rs= c.s.executeQuery(sql);
			while(rs.next()) {
				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("security"));
			}
			}
			catch(Exception e) {
				
			}
		}
		else if(ae.getSource()==b2) {
			try {
				String sql="select * from account where answer='"+t4.getText()+"' and username='"+t1.getText()+"'";
				ResultSet rs= c.s.executeQuery(sql);
				while(rs.next()) {
					t5.setText(rs.getString("password"));
				}
				}
				catch(Exception e) {
					
				}
		}
		else if(ae.getSource()==b3) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		new ForgotPassword().setVisible(true);
	}
	
}
