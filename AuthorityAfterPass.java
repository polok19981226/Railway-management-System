package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AuthorityAfterPass {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthorityAfterPass window = new AuthorityAfterPass();
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
	public AuthorityAfterPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeAuthorityPlease = new JLabel("Welcome  Authority. Please Select Your Desire Option");
		lblWelcomeAuthorityPlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeAuthorityPlease.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWelcomeAuthorityPlease.setBounds(10, 11, 414, 23);
		frame.getContentPane().add(lblWelcomeAuthorityPlease);
		
		JButton btnAddTrain = new JButton("Add Train");
		btnAddTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Train t=new Train();
				frame.dispose();
				t.frame.setVisible(true);
			}
		});
		btnAddTrain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddTrain.setBounds(49, 91, 125, 23);
		frame.getContentPane().add(btnAddTrain);
		
		JButton btnViewComplain = new JButton("View Complain");
		btnViewComplain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowComplain sc=new ShowComplain();
				frame.dispose();
				sc.frame.setVisible(true);
			}
		});
		btnViewComplain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewComplain.setBounds(225, 91, 131, 23);
		frame.getContentPane().add(btnViewComplain);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(139, 173, 125, 23);
		frame.getContentPane().add(btnExit);
	}

}
