package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ViewTicket {

	public JFrame frame;
	private JTextField txtmobile;
	private JTextField txtjd;
	private JTextField txtjt;
	private JTextField txtclass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTicket window = new ViewTicket();
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
	public ViewTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 684, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblToConfirmYour = new JLabel("To View Your Ticket Please Fullfil The Answer");
		lblToConfirmYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToConfirmYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblToConfirmYour.setBounds(10, 11, 648, 37);
		frame.getContentPane().add(lblToConfirmYour);
		
		txtmobile = new JTextField();
		txtmobile.setColumns(10);
		txtmobile.setBounds(248, 82, 194, 20);
		frame.getContentPane().add(txtmobile);
		
		JButton btnView = new JButton("View(Offline)");
		btnView.setBackground(Color.WHITE);
		btnView.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					
					ResultSet rs=st.executeQuery("select * from buytickets where mobile='"+txtmobile.getText()+"'");
					if(rs.next()) {
						txtjt.setText(rs.getString("journeyTime"));
						txtjd.setText(rs.getString("journeyDate"));
						txtjt.setText(rs.getString("class"));
						txtclass.setText(rs.getString("amountofticket"));
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "No Ticket Found. Please Check Again.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnView.setBounds(36, 134, 150, 23);
		frame.getContentPane().add(btnView);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(454, 134, 123, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClass.setBackground(Color.GRAY);
		lblClass.setBounds(10, 242, 188, 21);
		frame.getContentPane().add(lblClass);
		
		JLabel lblHowManyTicket = new JLabel("Tickets:");
		lblHowManyTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHowManyTicket.setBackground(Color.GRAY);
		lblHowManyTicket.setBounds(10, 287, 188, 21);
		frame.getContentPane().add(lblHowManyTicket);
		
		txtjd = new JTextField();
		txtjd.setColumns(10);
		txtjd.setBounds(248, 194, 194, 20);
		frame.getContentPane().add(txtjd);
		
		txtjt = new JTextField();
		txtjt.setColumns(10);
		txtjt.setBounds(248, 242, 194, 20);
		frame.getContentPane().add(txtjt);
		
		txtclass = new JTextField();
		txtclass.setColumns(10);
		txtclass.setBounds(248, 287, 194, 20);
		frame.getContentPane().add(txtclass);
		
		JButton btnViewonline = new JButton("View(Online)");
		btnViewonline.setBackground(Color.WHITE);
		btnViewonline.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewonline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					
					ResultSet rs=st.executeQuery("select * from buyticketonlines where bkash='"+txtmobile.getText()+"'");
					if(rs.next()) {
						txtjt.setText(rs.getString("journeyTime"));
						txtjd.setText(rs.getString("journeyDate"));
						txtjt.setText(rs.getString("class"));
						txtclass.setText(rs.getString("amountofticket"));
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "No Ticket Found. Please Check Again.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnViewonline.setBounds(248, 134, 150, 23);
		frame.getContentPane().add(btnViewonline);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number:");
		lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMobileNumber.setBackground(Color.GRAY);
		lblMobileNumber.setBounds(10, 85, 188, 21);
		frame.getContentPane().add(lblMobileNumber);
		
		JLabel label = new JLabel("Journey Date:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(Color.GRAY);
		label.setBounds(10, 194, 188, 21);
		frame.getContentPane().add(label);
	}

}
