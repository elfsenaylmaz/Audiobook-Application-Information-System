package Audiobook;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class MenuScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MenuScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooks = new JButton("BOOKS");
		btnBooks.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBooks.setBounds(345, 245, 300, 50);
		contentPane.add(btnBooks);
		
		JButton btnBalance = new JButton("BALANCE");
		btnBalance.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBalance.setBounds(345, 385, 300, 50);
		contentPane.add(btnBalance);
		
		JButton btnMyBooks = new JButton("MY BOOKS");
		btnMyBooks.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnMyBooks.setBounds(345, 315, 300, 50);
		contentPane.add(btnMyBooks);
		
		JLabel lblWelcome = new JLabel("WELCOME, USER");
		lblWelcome.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblWelcome.setBounds(45, 25, 300, 40);
		contentPane.add(lblWelcome);
		
		JLabel lblCurBal = new JLabel("CURRENT BALANCE: 0000");
		lblCurBal.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblCurBal.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCurBal.setBounds(650, 25, 300, 40);
		contentPane.add(lblCurBal);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnLogOut.setBounds(345, 455, 300, 50);
		contentPane.add(btnLogOut);
	}
}