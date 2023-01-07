package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BooksScreen extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BooksScreen frame = new BooksScreen();
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
	public BooksScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox categoryComboBox = new JComboBox(new String[] {"Biyografi"});
		categoryComboBox.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		categoryComboBox.setBounds(25, 25, 200, 30);
		contentPane.add(categoryComboBox);
		
		JComboBox timeComboBox = new JComboBox<>();
		timeComboBox.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		timeComboBox.setBounds(232, 25, 200, 30);
		contentPane.add(timeComboBox);
		
		JButton btnFilter = new JButton("New button");
		btnFilter.setBounds(442, 24, 31, 30);
		contentPane.add(btnFilter);
		
		searchField = new JTextField();
		searchField.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		searchField.setBounds(724, 25, 200, 30);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("New button");
		btnSearch.setBounds(931, 24, 31, 30);
		contentPane.add(btnSearch);
		
		JList listBooks = new JList();
		listBooks.setBounds(25, 84, 937, 424);
		contentPane.add(listBooks);
		
		JButton btnNewButton = new JButton("GO BACK");
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton.setBounds(25, 518, 114, 30);
		contentPane.add(btnNewButton);
		
		JButton btnBuy = new JButton("RENT");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RentScreen rentScreen;
				try {
					rentScreen = new RentScreen();
					rentScreen.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		btnBuy.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnBuy.setBounds(848, 518, 114, 30);
		contentPane.add(btnBuy);
	}
}
