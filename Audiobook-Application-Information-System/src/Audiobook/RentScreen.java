package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RentScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentScreen frame = new RentScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RentScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Integer i;

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("BOOK NAME:");
		lblBookName.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblBookName.setBounds(70, 150, 250, 40);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("AUTHOR:");
		lblAuthor.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblAuthor.setBounds(70, 200, 250, 40);
		contentPane.add(lblAuthor);
		
		JLabel lblNarratedBy = new JLabel("NARRATED BY:");
		lblNarratedBy.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNarratedBy.setBounds(70, 300, 250, 40);
		contentPane.add(lblNarratedBy);
		
		JLabel lblTime = new JLabel("TIME:");
		lblTime.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblTime.setBounds(70, 350, 250, 40);
		contentPane.add(lblTime);
		
		JLabel lblDailyPrice = new JLabel("DAILY PRICE:");
		lblDailyPrice.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblDailyPrice.setBounds(70, 400, 250, 40);
		contentPane.add(lblDailyPrice);
		
		JLabel lblCategory = new JLabel("CATEGORY:");
		lblCategory.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCategory.setBounds(70, 250, 250, 40);
		contentPane.add(lblCategory);
		
		JComboBox<Integer> comboDays = new JComboBox<Integer>();
		comboDays.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		comboDays.setBounds(805, 248, 60, 30);
		for(i = 1; i<31; i++)
			comboDays.addItem(i);
		contentPane.add(comboDays);
		
		JLabel lblHowManyDays = new JLabel("How many days do you want to rent?");
		lblHowManyDays.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblHowManyDays.setBounds(490, 248, 311, 30);
		contentPane.add(lblHowManyDays);
		
		JLabel lblCurrentBalance = new JLabel("CURRENT BALANCE: 0000\r\n");
		lblCurrentBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentBalance.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCurrentBalance.setBounds(520, 209, 311, 30);
		contentPane.add(lblCurrentBalance);
		
		JButton btnRent = new JButton("RENT");
		btnRent.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnRent.setBounds(629, 300, 85, 40);
		contentPane.add(btnRent);
	}
}
