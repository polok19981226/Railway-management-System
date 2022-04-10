package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CancelTicket {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelTicket window = new CancelTicket();
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
	public CancelTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 532, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCancelTicket = new JLabel("Cancel Ticket");
		lblCancelTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCancelTicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelTicket.setBounds(10, 11, 496, 38);
		frame.getContentPane().add(lblCancelTicket);
		
		JButton btnCancelTicketoffline = new JButton("Cancel Ticket(Offline)");
		btnCancelTicketoffline.setBackground(Color.WHITE);
		btnCancelTicketoffline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SellTicket s= new SellTicket();
				frame.dispose();
				s.frame.setVisible(true);
			}
		});
		btnCancelTicketoffline.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelTicketoffline.setBounds(10, 106, 159, 31);
		frame.getContentPane().add(btnCancelTicketoffline);
		
		JButton btnCancelTicketonline = new JButton("Cancel Ticket(Online)");
		btnCancelTicketonline.setBackground(Color.WHITE);
		btnCancelTicketonline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SellTicketOnline so= new SellTicketOnline();
				frame.dispose();
				so.frame.setVisible(true);
			}
		});
		btnCancelTicketonline.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelTicketonline.setBounds(347, 106, 159, 31);
		frame.getContentPane().add(btnCancelTicketonline);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(178, 191, 159, 31);
		frame.getContentPane().add(btnExit);
	}
}
