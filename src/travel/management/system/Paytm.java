package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{
    
	JButton b1;
	
	Paytm(){
		
		JEditorPane j = new JEditorPane();
		j.setEditable(false);
		
		try {
			j.setPage("https://paytm.com/credit-card-bill-payment");
		}
		
		catch(Exception e) {
			j.setContentType("text/html");
			j.setText("<html>Could not load, error 404</html>");
		}
		
		add(j);
		
		JScrollPane js=new JScrollPane(j);
		getContentPane().add(js);
		
		
		b1=new JButton("Back");
		b1.setBounds(610, 20, 80, 40);
		b1.addActionListener(this);
		j.add(b1);
		
		
		setBounds(350,150,800,600);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			this.setVisible(false);
			new Payment().setVisible(true);
		}
	}
	
	
	
	public static void main(String args[]) {
		new Paytm().setVisible(true);
	}
	
}
