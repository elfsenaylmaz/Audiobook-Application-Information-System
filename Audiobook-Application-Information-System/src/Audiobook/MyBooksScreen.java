package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyBooksScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBooksScreen frame = new MyBooksScreen();
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
	public MyBooksScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList listBooks = new JList();
		listBooks.setBounds(25, 79, 935, 425);
		contentPane.add(listBooks);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnGoBack.setBounds(435, 520, 115, 30);
		contentPane.add(btnGoBack);
		
		JLabel lblMyBooks = new JLabel("MY BOOKS");
		lblMyBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyBooks.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblMyBooks.setBounds(360, 30, 250, 40);
		contentPane.add(lblMyBooks);
	}
}
