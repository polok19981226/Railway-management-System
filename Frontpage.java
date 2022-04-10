package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Frontpage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		  
				try {
					Frontpage window = new Frontpage();
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
	public Frontpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 624, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectYourDesire = new JLabel("Select Your Desire option From Below ");
		lblSelectYourDesire.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectYourDesire.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectYourDesire.setBounds(10, 44, 583, 38);
		frame.getContentPane().add(lblSelectYourDesire);
		
		JButton btnbt = new JButton("Buy Ticket");
		btnbt.setBackground(new Color(255, 255, 255));
		btnbt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuyTicket b= new BuyTicket();
				frame.dispose();
				b.frame.setVisible(true);
			}
		});
		btnbt.setBounds(27, 132, 109, 23);
		frame.getContentPane().add(btnbt);
		
		JButton btnbto = new JButton("Buy ticket(Online) ");
		btnbto.setBackground(new Color(255, 255, 255));
		btnbto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnbto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BuyTicketOnline b1= new BuyTicketOnline();
				frame.dispose();
				b1.frame.setVisible(true);
			}
		});
		btnbto.setBounds(192, 132, 157, 23);
		frame.getContentPane().add(btnbto);
		
		JButton btnst = new JButton("Cancel Ticket");
		btnst.setBackground(new Color(255, 255, 255));
		btnst.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CancelTicket c= new CancelTicket();
				frame.dispose();
				c.frame.setVisible(true);
			}
		});
		btnst.setBounds(393, 132, 146, 23);
		frame.getContentPane().add(btnst);
		
		JButton btnnotice = new JButton("Notice");
		btnnotice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Notice n= new Notice();
				frame.dispose();
				n.frame.setVisible(true);
			}
		});
		btnnotice.setBackground(new Color(255, 255, 255));
		btnnotice.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnnotice.setBounds(27, 184, 109, 23);
		frame.getContentPane().add(btnnotice);
		
		JButton btnats = new JButton("All Train details");
		btnats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AboutTrain at= new AboutTrain();
				frame.dispose();
				at.frame.setVisible(true);
			}
		});
		btnats.setBackground(new Color(255, 255, 255));
		btnats.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnats.setBounds(192, 184, 157, 23);
		frame.getContentPane().add(btnats);
		
		JLabel lblForAnyInformation = new JLabel("For Any Information call 01713792141, 01555698873, 0721771126");
		lblForAnyInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblForAnyInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblForAnyInformation.setBounds(10, 297, 583, 32);
		frame.getContentPane().add(lblForAnyInformation);
		
		JButton btnPayment = new JButton("Payment Method");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    PaymentMethod p= new PaymentMethod();
				frame.dispose();
				p.frame.setVisible(true);
			}
		});
		btnPayment.setBackground(new Color(255, 255, 255));
		btnPayment.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPayment.setBounds(393, 184, 146, 23);
		frame.getContentPane().add(btnPayment);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setBounds(393, 244, 146, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnComplain = new JButton("Complain");
		btnComplain.setBackground(new Color(255, 255, 255));
		btnComplain.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComplain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Complain c= new Complain();
				frame.dispose();
				c.frame.setVisible(true);
			}
		});
		btnComplain.setBounds(192, 244, 157, 23);
		frame.getContentPane().add(btnComplain);
		
		JButton btnViewTicket = new JButton("View Ticket");
		btnViewTicket.setBackground(new Color(255, 255, 255));
		btnViewTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTicket v= new ViewTicket();
				frame.dispose();
				v.frame.setVisible(true);
			}
		});
		btnViewTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewTicket.setBounds(27, 244, 111, 23);
		frame.getContentPane().add(btnViewTicket);
		
		JLabel lblYouSelectPublic = new JLabel("You Select Public Option");
		lblYouSelectPublic.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouSelectPublic.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYouSelectPublic.setBounds(10, 11, 583, 38);
		frame.getContentPane().add(lblYouSelectPublic);
	}
}
