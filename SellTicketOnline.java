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

public class SellTicketOnline {

	public JFrame frame;
	private JTextField txtpn;
	private JTextField txtname;
	private JTextField txtjd;
	private JTextField txthmtyh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellTicketOnline window = new SellTicketOnline();
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
	public SellTicketOnline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 616, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSellTicketonline = new JLabel("Cancel Ticket (Online)");
		lblSellTicketonline.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSellTicketonline.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellTicketonline.setBounds(0, 11, 590, 32);
		frame.getContentPane().add(lblSellTicketonline);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhoneNumber.setBackground(Color.GRAY);
		lblPhoneNumber.setBounds(10, 73, 188, 21);
		frame.getContentPane().add(lblPhoneNumber);
		
		txtpn = new JTextField();
		txtpn.setColumns(10);
		txtpn.setBounds(251, 73, 180, 21);
		frame.getContentPane().add(txtpn);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					
					ResultSet rs=st.executeQuery("select * from buyticketonlines where bkash='"+txtpn.getText()+"'");
					if(rs.next()) {
						txtname.setText(rs.getString("name"));
						txtjd.setText(rs.getString("journeyDate"));
						txthmtyh.setText(rs.getString("amountofticket"));
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Not FOund");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(78, 122, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(390, 122, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBackground(Color.GRAY);
		lblName.setBounds(10, 156, 188, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblJourneyDate = new JLabel("Journey Date:");
		lblJourneyDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJourneyDate.setBackground(Color.GRAY);
		lblJourneyDate.setBounds(10, 188, 188, 21);
		frame.getContentPane().add(lblJourneyDate);
		
		JLabel lblHowManyTickets = new JLabel("How many tickets you have:");
		lblHowManyTickets.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHowManyTickets.setBackground(Color.GRAY);
		lblHowManyTickets.setBounds(10, 220, 188, 21);
		frame.getContentPane().add(lblHowManyTickets);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(251, 156, 180, 21);
		frame.getContentPane().add(txtname);
		
		txtjd = new JTextField();
		txtjd.setColumns(10);
		txtjd.setBounds(251, 188, 180, 21);
		frame.getContentPane().add(txtjd);
		
		txthmtyh = new JTextField();
		txthmtyh.setColumns(10);
		txthmtyh.setBounds(251, 220, 180, 21);
		frame.getContentPane().add(txthmtyh);
		
		JLabel lblDoYouWant = new JLabel("Do you want to cancel it?");
		lblDoYouWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWant.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDoYouWant.setBounds(0, 271, 590, 32);
		frame.getContentPane().add(lblDoYouWant);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name,jd,hmtyh;
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					name=txtname.getText();
					jd=txtjd.getText();
					hmtyh=txthmtyh.getText();
					st.executeUpdate("update buyticket set amountofticket=0 where name='"+name+"' and journeyDate='"+jd+"' and amountofticket='"+hmtyh+"'");
					JOptionPane.showMessageDialog(null, "Ticket Has Been Canceled");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnYes.setBackground(Color.WHITE);
		btnYes.setBounds(78, 314, 89, 23);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNo.setBackground(Color.WHITE);
		btnNo.setBounds(390, 314, 89, 23);
		frame.getContentPane().add(btnNo);
	}
}
