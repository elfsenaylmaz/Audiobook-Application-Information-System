package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class RentScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Database database = new Database();
	public String ssn;
	
	public RentScreen(String ssn) throws Exception {
		setTitle("BookNook");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RentScreen.class.getResource("/icons/audio-book (4).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(40, 40, 40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Integer i;

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("BOOK NAME:");
		lblBookName.setForeground(new Color(236, 65, 0));
		lblBookName.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblBookName.setBounds(70, 150, 113, 40);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("AUTHOR:");
		lblAuthor.setForeground(new Color(236, 65, 0));
		lblAuthor.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblAuthor.setBounds(70, 200, 113, 40);
		contentPane.add(lblAuthor);
		
		JLabel lblNarratedBy = new JLabel("NARRATED BY:");
		lblNarratedBy.setForeground(new Color(236, 65, 0));
		lblNarratedBy.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNarratedBy.setBounds(70, 300, 127, 40);
		contentPane.add(lblNarratedBy);
		
		JLabel lblTime = new JLabel("TIME:");
		lblTime.setForeground(new Color(236, 65, 0));
		lblTime.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblTime.setBounds(70, 350, 49, 40);
		contentPane.add(lblTime);
		
		JLabel lblDailyPrice = new JLabel("DAILY PRICE:");
		lblDailyPrice.setForeground(new Color(236, 65, 0));
		lblDailyPrice.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblDailyPrice.setBounds(70, 400, 113, 40);
		contentPane.add(lblDailyPrice);
		
		JLabel lblCategory = new JLabel("CATEGORY:");
		lblCategory.setForeground(new Color(236, 65, 0));
		lblCategory.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCategory.setBounds(70, 250, 113, 40);
		contentPane.add(lblCategory);
		
		JComboBox<Integer> comboDays = new JComboBox<Integer>();
		comboDays.setBackground(new Color(255, 255, 255));
		comboDays.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		comboDays.setBounds(842, 249, 60, 30);
		for(i = 1; i<31; i++)
			comboDays.addItem(i);
		contentPane.add(comboDays);
		
		JLabel lblHowManyDays = new JLabel("How many days do you want to rent?");
		lblHowManyDays.setForeground(new Color(255, 255, 255));
		lblHowManyDays.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblHowManyDays.setBounds(527, 249, 311, 30);
		contentPane.add(lblHowManyDays);
		
		JLabel lblCurrentBalance = new JLabel("CURRENT BALANCE: " + String.format("%d", database.getBalance(ssn)) + " TL  ");
		lblCurrentBalance.setForeground(new Color(236, 65, 0));
		lblCurrentBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentBalance.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblCurrentBalance.setBounds(553, 211, 311, 30);
		contentPane.add(lblCurrentBalance);
		
		JButton btnRent = new JButton("RENT");
		btnRent.setBackground(new Color(236, 65, 0));
		btnRent.setForeground(new Color(255, 255, 255));
		btnRent.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnRent.setBounds(661, 301, 90, 48);
		contentPane.add(btnRent);
		
		JButton btnGoBack = new JButton("");
		btnGoBack.setBackground(new Color(255, 255, 255));
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksScreen bookScreen;
				try {
					bookScreen = new BooksScreen(ssn);
					bookScreen.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		btnGoBack.setIcon(new ImageIcon(BalanceScreen.class.getResource("/icons/arrow.png")));
		btnGoBack.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnGoBack.setBounds(10, 10, 44, 30);
		contentPane.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("  RENT");
		lblNewLabel.setForeground(new Color(236, 65, 0));
		lblNewLabel.setIcon(new ImageIcon(RentScreen.class.getResource("/icons/audio-book (3).png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel.setBounds(381, 39, 218, 48);
		contentPane.add(lblNewLabel);
	}
}
