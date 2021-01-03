package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
	
      JProgressBar p;
     
      Thread t1;
      String username;
      
	Loading(String user){
		
	 username=user;
		
		t1=new Thread(this);
		
		 
		JLabel l1= new JLabel("Travel And Tourism Application");
		l1.setBounds(35, 20, 600, 40);
		l1.setFont(new Font("Raleway", Font.BOLD, 35));
		l1.setForeground(Color.blue);
		add(l1);
		
		
		p= new JProgressBar();
		p.setStringPainted(true);
		p.setBounds(150, 100, 300, 25);
		add(p);
		
		
		JLabel l2= new JLabel("Please Wait...");
		l2.setBounds(255, 130, 140, 25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setForeground(Color.red);
		add(l2);
		
		
		JLabel l3= new JLabel("Welcome " + username);
		l3.setBounds(20, 320, 400, 25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setForeground(Color.red);
		add(l3);
		
		t1.start();
		
		setBounds(450, 200, 650, 400);
		getContentPane().setBackground(Color.white);
		setLayout(null);
	}
	
	public void run() {
		
		try {
			for(int i=1;i<=101;i++) {
				int max=p.getMaximum();
				int n=p.getValue();
				if(n<max) {
					p.setValue(p.getValue() + 1);
				}
				else {
					i=101;
					setVisible(false);
					new Dashboard(username).setVisible(true);
				}
				Thread.sleep(50);
				
			}
		}
		
		catch(Exception e) {
			
		}
	}
	
	public static void main(String args[]) {
		new Loading("").setVisible(true);
	}
	
}
