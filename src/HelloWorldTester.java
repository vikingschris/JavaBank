import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class HelloWorldTester {
	private static final double CURRENT_BALANCE = 200;
	private static final double INTEREST_RATE = 5;
	
	public static void main(String[] args) throws Exception
	{
		HelloWorld hello = new HelloWorld("Costco",8541);
		System.out.println("ShipperName: " + hello.getShipperName() + "\n" + "ShipperID: " + 
		hello.getShipperID());
		
		System.out.println(hello.rec(7));
		
		Child sev = new Child("Westfield",8436,1);
		System.out.println(sev.getShipperName() + "\n" + sev.getShipperID() + "\n"
		 + sev.getOrderID());
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Submit");
		Scanner in = new Scanner(System.in);
		
		BankAccount p1 = new BankAccount(CURRENT_BALANCE);
		JLabel label = new JLabel("balance: " + p1.getBalance());
		class BankListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e)
			{
				double interest = p1.getBalance() * 5 / 100;
				p1.deposit(interest);
				label.setText("balance: " + p1.getBalance());
			}

		}
		ActionListener listener = new BankListener();
		button.addActionListener(listener);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		
		/*try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","password");
			PreparedStatement state = conn.prepareStatement("SELECT * FROM christable");
			
			
			ResultSet res = state.executeQuery();
			
			
			while(res.next()){
				System.out.println(res.getString(2));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}*/
		
		
		
		
	}

}
