package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Train {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtdestination;
	private JTextField txtst;
	private JTextField txtfair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Train window = new Train();
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
	public Train() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(Color.GRAY);
		label.setBounds(10, 71, 188, 21);
		frame.getContentPane().add(label);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestination.setBackground(Color.GRAY);
		lblDestination.setBounds(10, 113, 188, 21);
		frame.getContentPane().add(lblDestination);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(230, 71, 137, 20);
		frame.getContentPane().add(txtname);
		
		txtdestination = new JTextField();
		txtdestination.setColumns(10);
		txtdestination.setBounds(230, 113, 137, 20);
		frame.getContentPane().add(txtdestination);
		
		JLabel lblTrain = new JLabel("Train");
		lblTrain.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrain.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrain.setBounds(101, 11, 219, 35);
		frame.getContentPane().add(lblTrain);
		
		JLabel lblOnlyAuthoriseUse = new JLabel("Only Authority Use");
		lblOnlyAuthoriseUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlyAuthoriseUse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOnlyAuthoriseUse.setBounds(260, 255, 219, 35);
		frame.getContentPane().add(lblOnlyAuthoriseUse);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,destination,starttime,fair;
				name=txtname.getText();
				destination=txtdestination.getText();
				starttime=txtst.getText();
				fair=txtfair.getText();
				
			try {
				Connection con = DbConnection.getConnection();
				Statement st = con.createStatement();
				//st.executeUpdate("create database railway");
				st.executeUpdate("use railway");
				//st.executeUpdate("create table train(name varchar(20),destination varchar(20),statrtime varchar(20),fair varchar(20))");
				st.executeUpdate("insert into train values('"+name+"','"+destination+"','"+starttime+"','"+fair+"')");
				JOptionPane.showMessageDialog(null, "Train Insert Successfully");
				frame.dispose();
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		btnAdd.setBounds(10, 242, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblStartTime = new JLabel("Start Time:");
		lblStartTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStartTime.setBackground(Color.GRAY);
		lblStartTime.setBounds(10, 154, 188, 21);
		frame.getContentPane().add(lblStartTime);
		
		JLabel lblFair = new JLabel("Fair:");
		lblFair.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFair.setBackground(Color.GRAY);
		lblFair.setBounds(10, 198, 188, 21);
		frame.getContentPane().add(lblFair);
		
		txtst = new JTextField();
		txtst.setColumns(10);
		txtst.setBounds(230, 154, 137, 20);
		frame.getContentPane().add(txtst);
		
		txtfair = new JTextField();
		txtfair.setColumns(10);
		txtfair.setBounds(230, 198, 137, 20);
		frame.getContentPane().add(txtfair);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(161, 242, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
