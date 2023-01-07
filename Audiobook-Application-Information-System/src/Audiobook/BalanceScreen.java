package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BalanceScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalanceScreen frame = new BalanceScreen();
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
	public BalanceScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrentBalance = new JLabel("CURRENT BALANCE: 0000\r\n");
		lblCurrentBalance.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentBalance.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCurrentBalance.setBounds(100, 69, 300, 30);
		contentPane.add(lblCurrentBalance);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(205, 120, 100, 30);
		contentPane.add(textFieldAmount);
		textFieldAmount.setColumns(10);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnPlus.setBounds(315, 120, 44, 30);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnMinus.setBounds(150, 120, 44, 30);
		contentPane.add(btnMinus);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnNewButton_2.setBounds(204, 160, 100, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnGoBack = new JButton("");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuScreen menuScreen;
				try {
					menuScreen = new MenuScreen();
					menuScreen.setVisible(true);
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
	}
}
