package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;



import lab1.Dbc;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BuyTicketOnline {

	public JFrame frame;
	private JTextField txtname;
	private JTextField txtjd;
	private JTextField txtjt;
	private JTextField txtbkash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyTicketOnline window = new BuyTicketOnline();
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
	public BuyTicketOnline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 490, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouSelectBuy = new JLabel("You Selected Buy Ticket (Online)");
		lblYouSelectBuy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYouSelectBuy.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouSelectBuy.setBounds(89, 0, 243, 21);
		frame.getContentPane().add(lblYouSelectBuy);
		
		JLabel label = new JLabel("Please Fullfil All The Information");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(89, 21, 243, 21);
		frame.getContentPane().add(label);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBackground(Color.GRAY);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(10, 48, 188, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblJourneyDate = new JLabel("Journey Date:");
		lblJourneyDate.setBackground(Color.GRAY);
		lblJourneyDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJourneyDate.setBounds(10, 80, 188, 21);
		frame.getContentPane().add(lblJourneyDate);
		
		JLabel lblJourneyTime = new JLabel("Journey Time:");
		lblJourneyTime.setBackground(Color.GRAY);
		lblJourneyTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJourneyTime.setBounds(10, 110, 188, 21);
		frame.getContentPane().add(lblJourneyTime);
		
		JLabel lblStartJourney = new JLabel("Train Name:");
		lblStartJourney.setBackground(Color.GRAY);
		lblStartJourney.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStartJourney.setBounds(10, 142, 188, 21);
		frame.getContentPane().add(lblStartJourney);
		
		JLabel lblHowManyTicketsWants = new JLabel("How Many Tickets Wants:");
		lblHowManyTicketsWants.setBackground(Color.GRAY);
		lblHowManyTicketsWants.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHowManyTicketsWants.setBounds(10, 168, 188, 21);
		frame.getContentPane().add(lblHowManyTicketsWants);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBackground(Color.GRAY);
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDestination.setBounds(10, 200, 188, 21);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setBackground(Color.GRAY);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClass.setBounds(10, 232, 188, 21);
		frame.getContentPane().add(lblClass);
		
		JLabel lblBkashNumber = new JLabel("Bkash Number/ Phone Number:");
		lblBkashNumber.setBackground(Color.GRAY);
		lblBkashNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBkashNumber.setBounds(10, 264, 188, 21);
		frame.getContentPane().add(lblBkashNumber);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(246, 48, 180, 20);
		frame.getContentPane().add(txtname);
		
		txtjd = new JTextField();
		txtjd.setColumns(10);
		txtjd.setBounds(246, 78, 180, 20);
		frame.getContentPane().add(txtjd);
		
		txtjt = new JTextField();
		txtjt.setColumns(10);
		txtjt.setBounds(246, 110, 180, 20);
		frame.getContentPane().add(txtjt);
		
		txtbkash = new JTextField();
		txtbkash.setColumns(10);
		txtbkash.setBounds(246, 264, 180, 20);
		frame.getContentPane().add(txtbkash);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "A", "B", "C", "D"}));
		comboBox.setBounds(246, 141, 180, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2"}));
		comboBox_1.setBounds(246, 167, 180, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Dhaka", "Chittagong", "Rajshahi", "Rangpur"}));
		comboBox_2.setBounds(246, 199, 180, 22);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "AC", "Shovon"}));
		comboBox_3.setBounds(246, 231, 180, 22);
		frame.getContentPane().add(comboBox_3);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(Color.WHITE);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,jd,jt,sj,hmtw,destination,clas,bkash;
				name=txtname.getText();
				jd=txtjd.getText();
				jt=txtjt.getText();
				bkash=txtbkash.getText();
				hmtw=comboBox_1.getSelectedItem().toString();
				destination=comboBox_2.getSelectedItem().toString();
				clas=comboBox_3.getSelectedItem().toString();
				sj=comboBox.getSelectedItem().toString();
				
				try {
					Connection con = Dbc.getConnection();
					Statement st = con.createStatement();
					//st.executeUpdate("create database railway");
					st.executeUpdate("use railway");
					//st.executeUpdate("create table buyticketonlines(name varchar(20),journeyDate varchar(20),journeyTime varchar(20),Trainname varchar(20),amountofticket varchar(10),destination varchar(20),class varchar(20),bkash varchar(20))");
					st.executeUpdate("insert into buyticketonlines values('"+name+"','"+jd+"','"+jt+"','"+sj+"','"+hmtw+"','"+destination+"','"+clas+"','"+bkash+"')");
					JOptionPane.showMessageDialog(null, "Buy Ticket Online Successfully");
					
					
				}catch(Exception e1) {
					e1.printStackTrace();

				}
			}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setBounds(69, 316, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(361, 316, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnNewButton = new JButton("Home Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frontpage f=new Frontpage();
				frame.dispose();
				f.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(207, 316, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}
