package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AboutTrain {

	public JFrame frame;
	private JTextField txttn;
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
					AboutTrain window = new AboutTrain();
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
	public AboutTrain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblAboutTrain = new JLabel("About Train");
		lblAboutTrain.setBounds(150, 11, 219, 35);
		lblAboutTrain.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAboutTrain.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblAboutTrain);
		
		JLabel lblTrainName = new JLabel("Train Name:");
		lblTrainName.setBounds(10, 62, 105, 24);
		lblTrainName.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblTrainName);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBounds(11, 178, 105, 24);
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblDestination);
		
		txttn = new JTextField();
		txttn.setBounds(204, 64, 137, 20);
		frame.getContentPane().add(txttn);
		txttn.setColumns(10);
		
		txtdestination = new JTextField();
		txtdestination.setBounds(204, 180, 137, 20);
		txtdestination.setColumns(10);
		frame.getContentPane().add(txtdestination);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(85, 129, 89, 23);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Statement st=DbConnection.getConnection().createStatement();
					st.executeUpdate("use railway");
					
					ResultSet rs=st.executeQuery("select * from train where name='"+txttn.getText()+"'");
					if(rs.next()) {
						txtdestination.setText(rs.getString("destination"));
						txtst.setText(rs.getString("statrtime"));
						txtfair.setText(rs.getString("fair"));
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
		frame.getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(285, 129, 89, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnExit);
		
		JLabel lblStarttime = new JLabel("Start Time:");
		lblStarttime.setBounds(13, 219, 105, 24);
		lblStarttime.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblStarttime);
		
		JLabel lblFair = new JLabel("Fair:");
		lblFair.setBounds(16, 257, 105, 24);
		lblFair.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblFair);
		
		txtst = new JTextField();
		txtst.setBounds(204, 221, 137, 20);
		txtst.setColumns(10);
		frame.getContentPane().add(txtst);
		
		txtfair = new JTextField();
		txtfair.setBounds(204, 259, 137, 20);
		txtfair.setColumns(10);
		frame.getContentPane().add(txtfair);
	}
}
