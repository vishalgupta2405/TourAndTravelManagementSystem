package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	String username;
	
	Dashboard(String user){
		username=user;
		
	    JPanel p1= new JPanel();
		p1.setBounds(0, 0, 1600, 65);
		p1.setLayout(null);
		p1.setBackground(new Color(0, 0, 102));
		add(p1);
		
		
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("dashboard.jpg"));
		Image i5= i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l2= new JLabel(i6);
     	l2.setBounds(0, 0, 70, 70);
		p1.add(l2);
		
		
		JLabel l3=new JLabel("Dashboard");
		l3.setFont(new Font("Tahoma", Font.BOLD, 30));
		l3.setForeground(Color.white);
		l3.setBounds(80, 10, 300, 40);
		p1.add(l3);
		
	

	    JPanel p2= new JPanel();
		p2.setBounds(0, 65, 280, 1000);
		p2.setLayout(null);
		p2.setBackground(new Color(0, 0, 102));
		add(p2);
		
		
		
		b1= new JButton("Add Personal Details");
		b1.setBounds(0, 0, 280, 50);
		b1.setBackground(new Color(0, 0, 102));
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		p2.add(b1);
		
		
		b2= new JButton("Update Personal Details");
		b2.setBounds(0, 50, 280, 50);
		b2.setBackground(new Color(0, 0, 102));
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		p2.add(b2);
		
		
		b3= new JButton("View Details");
		b3.setBounds(0, 100, 280, 50);
		b3.setBackground(new Color(0, 0, 102));
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		p2.add(b3);
		
	
    	b4= new JButton("Delete Personal Details");
		b4.setBounds(0, 150, 280, 50);
		b4.setBackground(new Color(0, 0, 102));
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setForeground(Color.white);
		b4.addActionListener(this);
		p2.add(b4);  
		
		
		b5= new JButton("Check Package");
		b5.setBounds(0, 200, 280, 50);
		b5.setBackground(new Color(0, 0, 102));
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		p2.add(b5);
		
		
		b6= new JButton("Book Package");
		b6.setBounds(0, 250, 280, 50);
		b6.setBackground(new Color(0, 0, 102));
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setForeground(Color.white);
		b6.addActionListener(this);
		p2.add(b6);
		
		b7= new JButton("View Package");
		b7.setBounds(0, 300, 280, 50);
		b7.setBackground(new Color(0, 0, 102));
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setForeground(Color.white);
		b7.addActionListener(this);
		p2.add(b7);
		
		
		b8= new JButton("View Hotels");
		b8.setBounds(0, 350, 280, 50);
		b8.setBackground(new Color(0, 0, 102));
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setForeground(Color.white);
		b8.addActionListener(this);
		p2.add(b8);
		
		
		b9= new JButton("Book Hotels");
		b9.setBounds(0, 400, 280, 50);
		b9.setBackground(new Color(0, 0, 102));
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setForeground(Color.white);
		b9.addActionListener(this);
		p2.add(b9);
		
		
		b10= new JButton("View Booked Hotels");
		b10.setBounds(0, 450, 280, 50);
		b10.setBackground(new Color(0, 0, 102));
		b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b10.setForeground(Color.white);
		b10.addActionListener(this);
		p2.add(b10);
		
		
		b11= new JButton("Destinations");
		b11.setBounds(0, 500, 280, 50);
		b11.setBackground(new Color(0, 0, 102));
		b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b11.setForeground(Color.white);
		b11.addActionListener(this);
		p2.add(b11);
		
		
		b12= new JButton("Payment");
		b12.setBounds(0, 550, 280, 50);
		b12.setBackground(new Color(0, 0, 102));
		b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b12.setForeground(Color.white);
		b12.addActionListener(this);
		p2.add(b12);
		
		
		b13= new JButton("About");
		b13.setBounds(0, 600, 280, 50);
		b13.setBackground(new Color(0, 0, 102));
		b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b13.setForeground(Color.white);
		b13.addActionListener(this);
		p2.add(b13);
		
		
	
		

		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
		Image i2= i1.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1= new JLabel(i3);
     	l1.setBounds(0, 0, 1600, 900);
		add(l1);
		
		
		JLabel l4 = new JLabel("Travel and Tourism Management System");
		l4.setBounds(400, 80, 1000, 70);
		l4.setFont(new Font("Tahoma", Font.PLAIN, 55));
		l4.setForeground(Color.white);
		l1.add(l4);
		
		
		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			new AddCustomer(username).setVisible(true);
		}
		
		else if(ae.getSource()==b2) {
			new UpdateCustomer(username).setVisible(true);
		}
		
		else if(ae.getSource()==b3) {
			new ViewCustomer(username).setVisible(true);
		}
		
		else if(ae.getSource()==b5) {
			new CheckPackage().setVisible(true);
		}
       
		else if(ae.getSource()==b6) {
			new BookPackage(username).setVisible(true);
		}
		
		else if(ae.getSource()==b7) {
			new ViewPackage(username).setVisible(true);
		}
		
		else if(ae.getSource()==b8) {
			new CheckHotels().setVisible(true);
		}
		
		else if(ae.getSource()==b11) {
			new Destination().setVisible(true);
		}

		else if(ae.getSource()==b9) {
			new BookHotel(username).setVisible(true);
		}
		
		else if(ae.getSource()==b10) {
			new ViewBookedHotel(username).setVisible(true);
		}
		
		else if(ae.getSource()==b12) {
			new Payment().setVisible(true);
		}
		
		else if(ae.getSource()==b13) {
			new About().setVisible(true);
		}
		
		else if(ae.getSource()==b4) {
			new DeleteCustomer(username).setVisible(true);
		}
	}
	
	
	public static void main(String args[]) {
		new Dashboard("").setVisible(true);
	}
}
