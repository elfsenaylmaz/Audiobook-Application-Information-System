package Audiobook;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sign_upScreen extends JFrame {


	private static final long serialVersionUID = 1L;
	private JTextField email;
	private JTextField name;
	private JTextField phone;
	private JTextField password;
	private JTextField surname;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Sign_upScreen() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Storytel");
		User user = new User();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		getContentPane().setLayout(null);
		

		JLabel lblClentRegster = new JLabel("SIGN UP");
		lblClentRegster.setForeground(new Color(0, 100, 0));
		lblClentRegster.setHorizontalAlignment(SwingConstants.CENTER);
		lblClentRegster.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblClentRegster.setBounds(58, 33, 395, 62);
		getContentPane().add(lblClentRegster);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(37, 152, 152, 25);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SURNAME:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(37, 184, 152, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("BIRTHDAY");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(37, 252, 152, 25);
		getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-MAIL:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(37, 316, 152, 25);
		getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PHONE NUMBER:");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(37, 273, 152, 32);
		getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_6 = new JLabel("PASSWORD:");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(37, 353, 152, 25);
		getContentPane().add(lblNewLabel_1_6);
		
		JLabel hata_phone = new JLabel("phone number is incorrect");
		hata_phone.setForeground(new Color(139, 0, 0));
		hata_phone.setHorizontalAlignment(SwingConstants.LEFT);
		hata_phone.setBounds(409, 280, 169, 21);
		getContentPane().add(hata_phone);
		hata_phone.setVisible(false);
		
		JLabel hata_email = new JLabel("e-mail is incorrect");
		hata_email.setForeground(new Color(139, 0, 0));
		hata_email.setHorizontalAlignment(SwingConstants.LEFT);
		hata_email.setBounds(409, 319, 200, 21);
		getContentPane().add(hata_email);
		hata_email.setVisible(false);

		
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email.setBounds(189, 315, 210, 25);
		getContentPane().add(email);
		email.setColumns(10);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setColumns(10);
		name.setBounds(189, 151, 210, 25);
		getContentPane().add(name);
		
		
		surname = new JTextField();
		surname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		surname.setColumns(10);
		surname.setBounds(189, 183, 210, 25);
		getContentPane().add(surname);
		
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phone.setColumns(10);
		phone.setBounds(189, 281, 210, 25);
		getContentPane().add(phone);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setColumns(10);
		password.setBounds(189, 352, 210, 25);
		getContentPane().add(password);
		
		
		JLabel lblNewLabel_1_2_1 = new JLabel("GENDER:");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(37, 216, 152, 25);
		getContentPane().add(lblNewLabel_1_2_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("FEMALE");
		rdbtnNewRadioButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton.setBounds(189, 214, 78, 28);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("MALE");
		rdbtnNewRadioButton_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton_1.setBounds(263, 214, 65, 28);
		getContentPane().add(rdbtnNewRadioButton_1);
		

		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("OTHER");
		rdbtnNewRadioButton_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 204, 153));
		rdbtnNewRadioButton_2.setBounds(327, 214, 72, 28);
		getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
		}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
		}
		});
		
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hata = 0;
				
				if(user.isStringEmpty(phone.getText())) {
					hata = 2;
				}else if(!user.isPhoneValid(phone.getText())) {
					hata_phone.setVisible(true);	
					phone.setText("");	
					hata = 1;
				}
				
				if(user.isStringEmpty(email.getText())) {
					hata = 	2;
				}else if(!user.isEMailValid(email.getText())) {
					hata_email.setVisible(true);	
					email.setText("");
					hata = 1;
				}
				
				
				if(user.isStringEmpty((email.getText()))) {
					hata = 2;
				}
				
				if(user.isStringEmpty((name.getText()))) {
					hata = 2;
				}
				
				if(user.isStringEmpty((password.getText()))) {
					hata = 2;
				}
				
				
				int gender = -1;
				if(rdbtnNewRadioButton.isSelected()) 
					gender = 0 ;
				else if(rdbtnNewRadioButton_1.isSelected())
					gender = 1;
				else if(rdbtnNewRadioButton_2.isSelected())
					gender = 2;
				if(hata == 2) {
					JOptionPane.showMessageDialog(null,"Please fill all the fields!!!");
				}else if(hata == 0){
					User user = new User();
	
				}
			}
		});
		
		btnNewButton.setBounds(196, 410, 141, 62);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen main;
				try {
					main= new MainScreen();
					main.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 204, 102));
		btnNewButton_2.setBounds(10, 10, 97, 32);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("0(5XX) XXX XX XX");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(57, 297, 152, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 984, 561);
		getContentPane().add(lblNewLabel);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		Object[] days = {"day",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Object[] months = {"month",1,2,3,4,5,6,7,8,9,10,11,12};
		Object[] years = {"year",1,2,3,4,5,6,7,8,9,10,11,12};
		comboBox.setModel(new DefaultComboBoxModel(days));
		comboBox.setBounds(189, 244, 78, 32);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(252, 244, 78, 32);
		comboBox_1.setModel(new DefaultComboBoxModel(months));
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(321, 244, 78, 32);
		comboBox_2.setModel(new DefaultComboBoxModel(years));
		getContentPane().add(comboBox_2);
	}
}
