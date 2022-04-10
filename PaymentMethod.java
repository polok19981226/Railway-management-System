package railway;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PaymentMethod {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentMethod window = new PaymentMethod();
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
	public PaymentMethod() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 844, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentMethod.setBounds(10, 11, 808, 38);
		frame.getContentPane().add(lblPaymentMethod);
		
		JLabel lblGetThe = new JLabel("1. Get the Code which give by the Railway Management System");
		lblGetThe.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGetThe.setBounds(10, 57, 808, 38);
		frame.getContentPane().add(lblGetThe);
		
		JLabel lblDial = new JLabel("2. Dial *247# from your Bkash number\r\n");
		lblDial.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDial.setBounds(10, 106, 808, 38);
		frame.getContentPane().add(lblDial);
		
		JLabel lblSelectPayment = new JLabel("3. Select Payment Option");
		lblSelectPayment.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSelectPayment.setBounds(10, 155, 808, 38);
		frame.getContentPane().add(lblSelectPayment);
		
		JLabel lblWriteDown = new JLabel("4. Write down the number given by the Railway Management System");
		lblWriteDown.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblWriteDown.setBounds(10, 204, 808, 38);
		frame.getContentPane().add(lblWriteDown);
		
		JLabel lblAddAmount = new JLabel("5. Add Amount");
		lblAddAmount.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAddAmount.setBounds(10, 253, 808, 38);
		frame.getContentPane().add(lblAddAmount);
		
		JLabel lblGiveYour = new JLabel("6. Give your PIN Number\r\n");
		lblGiveYour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblGiveYour.setBounds(10, 302, 808, 38);
		frame.getContentPane().add(lblGiveYour);
		
		JLabel lblFinish = new JLabel("7. Finish");
		lblFinish.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFinish.setBounds(10, 351, 808, 38);
		frame.getContentPane().add(lblFinish);
	}
}
