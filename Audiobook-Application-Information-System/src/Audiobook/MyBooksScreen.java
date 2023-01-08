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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class MyBooksScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	public Database database = new Database();
	private JPanel contentPane;
	public String ssn;
	
	public MyBooksScreen(String ssn) throws Exception{
		ArrayList<Record> list = new ArrayList<Record>();
		list = database.callView(ssn);
		DefaultListModel<String> myBooks = new DefaultListModel<>();
		for(Record r: list) {
			String name = r.bookName;
			String author = r.author;
			
			myBooks.addElement(name + "\t \t   " +author);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		@SuppressWarnings("unchecked")
		JList<String> listBooks = new JList<String>(myBooks);
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
					menuScreen = new MenuScreen(ssn);
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
		
		JLabel favCategoryLabel = new JLabel("Your Fav Category: ... ");
		favCategoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		favCategoryLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		favCategoryLabel.setBounds(328, 515, 272, 30);
		contentPane.add(favCategoryLabel);
	}
}
