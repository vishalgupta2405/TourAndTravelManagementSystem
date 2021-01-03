package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
	
	JLabel l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JButton b3;
	
	ViewBookedHotel(String user){
		
		JLabel heading =new JLabel("VIEW BOOKED HOTEL DETAILS");
		heading.setBounds(60,0,300,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(heading);
		
		

		JLabel l2=new JLabel("Username");
		l2.setBounds(30, 50, 100, 30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l2);
	  
		
		l11=new JLabel();
		l11.setBounds(250, 50, 200, 30);
		l11.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l11);
	  
	  
		JLabel l3=new JLabel("Hotel Name");
		l3.setBounds(30, 90, 100, 30);
		l3.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l3);
		
		
		l16=new JLabel();
		l16.setBounds(250, 90, 200, 30);
		l16.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l16);
		
		
			

		JLabel l4=new JLabel("Total Persons");
		l4.setBounds(30, 130, 100, 30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l4);
		
		l17=new JLabel();
		l17.setBounds(250, 130, 200, 30);
		l17.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l17);
		
		
		
		JLabel l5=new JLabel("Total Days ");
		l5.setBounds(30, 170, 100, 30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l5);
	  
		
		l12=new JLabel();
		l12.setBounds(250, 170, 200, 30);
		l12.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l12);
		
		
		JLabel l6=new JLabel("AC/NON-AC");
		l6.setBounds(30, 210, 100, 30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l6);
	  
		
		l13=new JLabel();
		l13.setBounds(250, 210, 200, 30);
		l13.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l13);
	  
		
		JLabel l7=new JLabel("Food Included");
		l7.setBounds(30, 250, 100, 30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l7);
	  
		
		l14=new JLabel();
		l14.setBounds(250, 250, 200, 30);
		l14.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l14);
	  
		
		JLabel l8=new JLabel("ID");
		l8.setBounds(30, 290, 100, 30);
		l8.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l8);
	  
		
		l15=new JLabel();
		l15.setBounds(250, 290, 200, 30);
		l15.setForeground(Color.red);
		l15.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l15);
		
		
		

		JLabel l10=new JLabel("Number");
		l10.setBounds(30, 330, 100, 30);
		l10.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l10);
	  
		
		l18=new JLabel();
		l18.setBounds(250, 330, 200, 30);
		l18.setForeground(Color.red);
		l18.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l18);
		
		
		JLabel l31=new JLabel("Phone");
		l31.setBounds(30, 370, 100, 30);
		l31.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l31);
	  
		
		l19=new JLabel();
		l19.setBounds(250, 370, 200, 30);
		l19.setForeground(Color.red);
		l19.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l19);
		
		
		JLabel l21=new JLabel("Total Cost");
		l21.setBounds(30, 410, 100, 30);
		l21.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l21);
	  
		
		l20=new JLabel();
		l20.setBounds(250, 410, 200, 30);
		l20.setForeground(Color.red);
		l20.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(l20);
		
		
		
		
		

		b3= new JButton("Back");
		b3.setBounds(150, 460, 150, 25);
		b3.setBackground(Color.black);
	//	b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		add(b3);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("bookedDetails.jpg"));
		Image i2= i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l9= new JLabel(i3);
     	l9.setBounds(450, 20, 500, 400);
		add(l9);
		
		
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from bookHotel where username='"+user+"'");
			
			while(rs.next()) {
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("days"));
				l13.setText(rs.getString("ac"));
				l14.setText(rs.getString("food"));
				l15.setText(rs.getString("id"));
				l16.setText(rs.getString("hotel"));
				l17.setText(rs.getString("persons"));
				l18.setText(rs.getString("number"));
				l19.setText(rs.getString("phone"));
				l20.setText(rs.getString("cost"));
			}
		}
		
		catch(Exception e) {
			
		}
		
		
		
		
		
		setBounds(300,150,1000,600);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
	} 
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b3) {
			this.setVisible(false);
		}
	}
	
	
	
	public static void main(String args[]) {
		new ViewBookedHotel("").setVisible(true);
	}

}
