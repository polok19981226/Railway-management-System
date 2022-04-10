package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class BuyTicket {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtjd;
	private JTextField txtjt;
	private JTextField txtnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyTicket window = new BuyTicket();
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
	public BuyTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 518, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouSelectBuy = new JLabel("You Selected Buy Ticket. ");
		lblYouSelectBuy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYouSelectBuy.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouSelectBuy.setBounds(128, 0, 243, 21);
		frame.getContentPane().add(lblYouSelectBuy);
		
		JLabel lblPleaseFullfilAll = new JLabel("Please Fullfil All The Information");
		lblPleaseFullfilAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseFullfilAll.setBounds(128, 24, 233, 21);
		frame.getContentPane().add(lblPleaseFullfilAll);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBackground(Color.GRAY);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(21, 54, 188, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblJourneyDate = new JLabel("Journey Date:");
		lblJourneyDate.setBackground(Color.GRAY);
		lblJourneyDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJourneyDate.setBounds(21, 86, 188, 21);
		frame.getContentPane().add(lblJourneyDate);
		
		JLabel lblJourneyTime = new JLabel("Journey Time (Schedule):");
		lblJourneyTime.setBackground(Color.GRAY);
		lblJourneyTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJourneyTime.setBounds(21, 118, 188, 21);
		frame.getContentPane().add(lblJourneyTime);
		
		JLabel lblStartJourney = new JLabel("Train Name:");
		lblStartJourney.setBackground(Color.GRAY);
		lblStartJourney.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStartJourney.setBounds(21, 150, 188, 21);
		frame.getContentPane().add(lblStartJourney);
		
		JLabel lblHowManyTickets = new JLabel("How Many Tickets Wants:");
		lblHowManyTickets.setBackground(Color.GRAY);
		lblHowManyTickets.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHowManyTickets.setBounds(21, 182, 188, 21);
		frame.getContentPane().add(lblHowManyTickets);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBackground(Color.GRAY);
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestination.setBounds(21, 214, 188, 21);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBackground(Color.GRAY);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClass.setBounds(21, 246, 188, 21);
		frame.getContentPane().add(lblClass);
		
		txtname = new JTextField();
		txtname.setBounds(240, 56, 180, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtjd = new JTextField();
		txtjd.setColumns(10);
		txtjd.setBounds(240, 86, 180, 20);
		frame.getContentPane().add(txtjd);
		
		txtjt = new JTextField();
		txtjt.setColumns(10);
		txtjt.setBounds(240, 118, 180, 20);
		frame.getContentPane().add(txtjt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "A", "B", "C", "D"}));
		comboBox.setBounds(240, 149, 180, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2"}));
		comboBox_1.setBounds(240, 181, 180, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Dhaka", "Chittagong", "Rajshahi", "Rangpur"}));
		comboBox_2.setBounds(240, 213, 180, 22);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ac ", "Shovon"}));
		comboBox_3.setBounds(240, 245, 180, 22);
		frame.getContentPane().add(comboBox_3);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(Color.WHITE);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,jd,jt,hmtw,destination,clas,mob,sj;
				name=txtname.getText();
				jd=txtjd.getText();
				jt=txtjt.getText();
				hmtw=comboBox_1.getSelectedItem().toString();
				destination=comboBox_2.getSelectedItem().toString();
				clas=comboBox_3.getSelectedItem().toString();
				mob=txtnumber.getText();
				sj=comboBox.getSelectedItem().toString();
				
			try {
				Connection con = DbConnection.getConnection();
				Statement st = con.createStatement();
				//st.executeUpdate("create database railway");
				st.executeUpdate("use railway");
				//st.executeUpdate("create table buytickets(name varchar(20),journeyDate varchar(20),journeyTime varchar(20),trainname varchar(20),amountofticket varchar(10),destination varchar(20),class varchar(20),mobile varchar(20))");
				st.executeUpdate("insert into buytickets values('"+name+"','"+jd+"','"+jt+"','"+sj+"','"+hmtw+"','"+destination+"','"+clas+"','"+mob+"')");
				JOptionPane.showMessageDialog(null, "Buy Ticket Successfully");
				
				
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setBounds(66, 332, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(390, 332, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblBkash = new JLabel("Mobile:");
		lblBkash.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBkash.setBackground(Color.GRAY);
		lblBkash.setBounds(21, 278, 188, 21);
		frame.getContentPane().add(lblBkash);
		
		txtnumber = new JTextField();
		txtnumber.setColumns(10);
		txtnumber.setBounds(240, 277, 180, 20);
		frame.getContentPane().add(txtnumber);
		
		JButton btnHomePage = new JButton("Home Page");
		btnHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frontpage f=new Frontpage();
				frame.dispose();
				f.frame.setVisible(true);
			}
		});
		btnHomePage.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHomePage.setBackground(Color.WHITE);
		btnHomePage.setBounds(231, 332, 103, 23);
		frame.getContentPane().add(btnHomePage);
	}
}
