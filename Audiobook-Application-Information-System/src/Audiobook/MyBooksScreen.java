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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MyBooksScreen extends JFrame {

	private static final long serialVersionUID = 1L;
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
		
		JLabel lblMyBooks = new JLabel("MY BOOKS");
		lblMyBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyBooks.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblMyBooks.setBounds(360, 30, 250, 40);
		contentPane.add(lblMyBooks);
		
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
		btnGoBack.setIcon(new ImageIcon(MyBooksScreen.class.getResource("/icons/arrow.png")));
		btnGoBack.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnGoBack.setBounds(25, 10, 44, 30);
		contentPane.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("Your Fav Category: ... ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel.setBounds(350, 515, 250, 30);
		contentPane.add(lblNewLabel);
	}
}
