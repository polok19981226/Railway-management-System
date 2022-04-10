package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Authority {

	public JFrame frame;
	private JTextField txtun;
	private JTextField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authority window = new Authority();
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
	public Authority() {
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
		
		JLabel lblFillTheOptions = new JLabel("Fill the Options to Access the Authority Option");
		lblFillTheOptions.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFillTheOptions.setHorizontalAlignment(SwingConstants.CENTER);
		lblFillTheOptions.setBounds(10, 23, 414, 34);
		frame.getContentPane().add(lblFillTheOptions);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUserName.setBounds(24, 83, 73, 23);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(24, 125, 73, 23);
		frame.getContentPane().add(lblPassword);
		
		txtun = new JTextField();
		txtun.setBounds(141, 84, 126, 20);
		frame.getContentPane().add(txtun);
		txtun.setColumns(10);
		
		txtpass = new JTextField();
		txtpass.setColumns(10);
		txtpass.setBounds(141, 126, 126, 20);
		frame.getContentPane().add(txtpass);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AuthorityAfterPass af=new AuthorityAfterPass();
				
				String name,password;
				name=txtun.getText();
				password=txtpass.getText();
				if((name.equals("Polok"))&&(password.equals("1234"))) {
					frame.dispose();
					af.frame.setVisible(true);
			}
			}});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnter.setBounds(44, 185, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(263, 185, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
