package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SellTicket {

	public JFrame frame;
	private JTextField txtname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellTicket window = new SellTicket();
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
	public SellTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSellTicket = new JLabel("Cancel Ticket (Offline)");
		lblSellTicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSellTicket.setBounds(163, 11, 225, 20);
		frame.getContentPane().add(lblSellTicket);
		
		JLabel lblName = new JLabel("Mobile Number:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBackground(Color.GRAY);
		lblName.setBounds(10, 75, 188, 21);
		frame.getContentPane().add(lblName);
		
		txtname = new JTextField();
		txtname.setBounds(277, 75, 194, 20);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Do you want to cancel this ticket?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 176, 510, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mobile;
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					mobile=txtname.getText();
					st.executeUpdate("update buytickets set amountofticket=0 where mobile='"+mobile+"'");
					JOptionPane.showMessageDialog(null, "Ticket Has Been Canceled");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnYes.setBounds(45, 218, 89, 23);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNo.setBounds(368, 218, 89, 23);
		frame.getContentPane().add(btnNo);
	}

}
