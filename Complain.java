package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;



import lab1.Dbc;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Complain {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtphone;
	private JTextField txtcomplain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complain window = new Complain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Complain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Complain Section\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 396, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPleaseWriteDown = new JLabel("Please Write Down Your Complain with correctly fullfil the options");
		lblPleaseWriteDown.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseWriteDown.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPleaseWriteDown.setBounds(10, 54, 396, 37);
		frame.getContentPane().add(lblPleaseWriteDown);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(10, 107, 103, 23);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhoneNumber.setBounds(10, 141, 103, 23);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblComplain = new JLabel("Complain:");
		lblComplain.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComplain.setBounds(10, 175, 103, 23);
		frame.getContentPane().add(lblComplain);
		
		txtname = new JTextField();
		txtname.setBounds(207, 108, 172, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.setColumns(10);
		txtphone.setBounds(207, 142, 172, 20);
		frame.getContentPane().add(txtphone);
		
		txtcomplain = new JTextField();
		txtcomplain.setColumns(10);
		txtcomplain.setBounds(207, 176, 172, 174);
		frame.getContentPane().add(txtcomplain);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,phonenumber,complain;
				name=txtname.getText();
				phonenumber=txtphone.getText();
				complain=txtcomplain.getText();
			
				try {
				Connection con = Dbc.getConnection();
				Statement st = con.createStatement();
				//st.executeUpdate("create database railway");
				st.executeUpdate("use railway");
				//st.executeUpdate("create table complain(name varchar(20),phonenumber varchar(20),complain varchar(1000))");
				st.executeUpdate("insert into complain values('"+name+"','"+phonenumber+"','"+complain+"')");
				JOptionPane.showMessageDialog(null, "Complain Inseart Successfully");
				frame.dispose();
				
				}catch(Exception e1) {
					e1.printStackTrace();	
				}
			}
		});
		btnSubmit.setBounds(94, 383, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(255, 383, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
