package travel.management.system;
import java.awt.*;
import  javax.swing.*;
import java.sql.*;
import java.awt.event.*;



public class Payment extends JFrame implements ActionListener {
    
	JButton b1,b2;
	
	Payment(){
	
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("paytm.jpeg"));
		Image i2= i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l2= new JLabel(i3);
     	l2.setBounds(0, 0, 800, 600);
		add(l2);
		
		
		b1=new JButton("Pay");
		b1.setBounds(420, 0, 80, 40);
//		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
//		b1.setBackground(Color.gray);
//		b1.setForeground(Color.white);
     	b1.addActionListener(this);
		l2.add(b1);
		
		

		b2=new JButton("Back");
		b2.setBounds(520,0, 80, 40);
//	    b2.setFont(new Font("Tahoma", Font.BOLD, 14));
//		b2.setBackground(Color.gray);
//		b2.setForeground(Color.white);
		b2.addActionListener(this);
		l2.add(b2);
		
		
		setBounds(350, 150,800,600);
		setLayout(null);
		getContentPane().setBackground(Color.white);
    }
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b2) {
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b1) {
			this.setVisible(false);
			new Paytm().setVisible(true);
		}
	}
	
	public static void main(String args[]) {
		new Payment().setVisible(true);
	}
}
