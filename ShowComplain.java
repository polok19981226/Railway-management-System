package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ShowComplain {

	public JFrame frame;
	private JTextField txtphone;
	private JTextField txtname;
	private JTextField txtComplain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowComplain window = new ShowComplain();
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
	public ShowComplain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Show Complain");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 795, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 61, 111, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblComplain = new JLabel("Complain:");
		lblComplain.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComplain.setBounds(10, 229, 84, 22);
		frame.getContentPane().add(lblComplain);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(10, 183, 84, 22);
		frame.getContentPane().add(lblName);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					
					ResultSet rs=st.executeQuery("select * from complain where phonenumber='"+txtphone.getText()+"'");
					if(rs.next()) {
						txtname.setText(rs.getString("name"));
						txtComplain.setText(rs.getString("complain"));
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "No Complain Found on This Number. Please Check Again.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(131, 111, 111, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnHomePage = new JButton("Home Page");
		btnHomePage.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHomePage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frontpage f=new Frontpage();
				frame.dispose();
				f.frame.setVisible(true);
			}
		});
		btnHomePage.setBounds(314, 111, 111, 23);
		frame.getContentPane().add(btnHomePage);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(545, 111, 89, 23);
		frame.getContentPane().add(btnExit);
		
		txtphone = new JTextField();
		txtphone.setBounds(131, 62, 155, 20);
		frame.getContentPane().add(txtphone);
		txtphone.setColumns(10);
		
		txtname = new JTextField();
		txtname.setColumns(10);
		txtname.setBounds(131, 184, 155, 20);
		frame.getContentPane().add(txtname);
		
		txtComplain = new JTextField();
		txtComplain.setColumns(10);
		txtComplain.setBounds(131, 230, 513, 130);
		frame.getContentPane().add(txtComplain);
		
		JLabel lblAuthorityUseOnly = new JLabel("Authority Use Only");
		lblAuthorityUseOnly.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAuthorityUseOnly.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthorityUseOnly.setBounds(598, 393, 111, 29);
		frame.getContentPane().add(lblAuthorityUseOnly);
	}
}
