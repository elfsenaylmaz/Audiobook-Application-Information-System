package Audiobook;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Sign_inScreen extends JFrame {

	/**
	 * 
	 */
	Database database = new Database();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterUsernameHere;
	private JTextField textField_1;
	public String ssn;

	public Sign_inScreen() throws Exception{
		setTitle("Storytel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen main;
				try {
					main = new MainScreen();
					main.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
	
		
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 204, 153));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		contentPane.add(btnNewButton_2);
		
		
		JLabel lblClentLognScreen = new JLabel("USER LOGIN");
		lblClentLognScreen.setForeground(new Color(255, 153, 0));
		lblClentLognScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblClentLognScreen.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblClentLognScreen.setBounds(255, 89, 474, 105);
		contentPane.add(lblClentLognScreen);
		
		JLabel lblNewLabel = new JLabel("USERNAME:");
		lblNewLabel.setForeground(new Color(255, 153, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(255, 203, 230, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(new Color(255, 153, 0));
		lblPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(255, 264, 230, 49);
		contentPane.add(lblPassword);
		
		txtEnterUsernameHere = new JTextField();
		txtEnterUsernameHere.setForeground(new Color(0, 0, 0));
		txtEnterUsernameHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterUsernameHere.setToolTipText("");
		txtEnterUsernameHere.setBounds(499, 205, 230, 49);
		contentPane.add(txtEnterUsernameHere);
		txtEnterUsernameHere.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(499, 265, 230, 49);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuScreen menu;
				try {
					ssn = database.userLogin(txtEnterUsernameHere.getText(),textField_1.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				if(ssn == null) {
					JOptionPane.showMessageDialog(null,"Login failed!");
				}else {
					try {
						menu = new MenuScreen();
						setVisible(false);
						menu.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					dispose();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 153));
		
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton.setBounds(405, 368, 173, 67);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 1009, 550);
		contentPane.add(lblNewLabel_1);
	}

}
