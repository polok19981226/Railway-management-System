package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Notice {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notice window = new Notice();
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
	public Notice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 873, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNotice = new JLabel("Notice");
		lblNotice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotice.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotice.setBounds(221, 11, 75, 23);
		frame.getContentPane().add(lblNotice);
		
		JLabel lblTheTrain = new JLabel("1. The train A which travels from Dhaka to Chittagong wil  be late for 50 minutes on 29.12.2019");
		lblTheTrain.setHorizontalAlignment(SwingConstants.LEFT);
		lblTheTrain.setBounds(10, 41, 639, 43);
		frame.getContentPane().add(lblTheTrain);
		
		JLabel lblSalesOf = new JLabel("2. Sales of tickets for Eid ul Ajha will be available from 25.01.2020 [ 9am to 6pm ] people can buy online aslo.");
		lblSalesOf.setBounds(10, 83, 639, 43);
		frame.getContentPane().add(lblSalesOf);
		
		JLabel lblTrainA = new JLabel("3. Train A B C D will be available on Monday, Thursday, Saturday & Sunday sequencially.");
		lblTrainA.setBounds(10, 124, 639, 43);
		frame.getContentPane().add(lblTrainA);
		
		JLabel lblNewLabel = new JLabel("4. The train A, B, C, D will be available on platform 1, platform 2, platform 3 & platform 4 till next notice.");
		lblNewLabel.setBounds(10, 162, 639, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblForMore = new JLabel("5. For more information visit www.railwaymanagementsystem.org \r \n  or visit our android app 'Railway Management System'.");
		lblForMore.setBounds(10, 208, 837, 43);
		frame.getContentPane().add(lblForMore);
	}
}
