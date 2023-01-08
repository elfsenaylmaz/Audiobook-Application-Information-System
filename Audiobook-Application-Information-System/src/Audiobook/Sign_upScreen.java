package Audiobook;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class Sign_upScreen extends JFrame {

	Database database = new Database();
	private static final long serialVersionUID = 1L;
	private JTextField email;
	private JTextField name;
	private JTextField password;
	private JTextField surname;
	private JTextField username;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Sign_upScreen() throws Exception{
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Storytel");
		
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
		
		JLabel lblNewLabel_1_6 = new JLabel("PASSWORD:");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(37, 391, 152, 25);
		getContentPane().add(lblNewLabel_1_6);

		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		username.setColumns(10);
		username.setBounds(189, 352, 210, 25);
		getContentPane().add(username);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("USERNAME:");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(37, 352, 152, 25);
		getContentPane().add(lblNewLabel_1_3_1);
		
		
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
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		password.setColumns(10);
		password.setBounds(189, 390, 210, 25);
		getContentPane().add(password);
		
		JLabel hata_email = new JLabel("e-mail is incorrect");
		hata_email.setForeground(new Color(139, 0, 0));
		hata_email.setHorizontalAlignment(SwingConstants.LEFT);
		hata_email.setBounds(409, 319, 200, 21);
		getContentPane().add(hata_email);
		hata_email.setVisible(false);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		Object[] days = {"day",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Object[] months = {"month",1,2,3,4,5,6,7,8,9,10,11,12};
		Object[] years = {"year",2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010,2009,2008,2007,2006,2005,2004,
				2003,2002,2001,2000,1999,1998,1997,1996,1995,1994,1993,1992,1991,1990,1989,1988,1987,1986,1985,1984,1983,1982,1981,1980,1979,1978,1977,1976,1975,1974,1973,1972,1971,1970};
		comboBox.setModel(new DefaultComboBoxModel(days));
		comboBox.setBounds(189, 244, 70, 32);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(256, 244, 78, 32);
		comboBox_1.setModel(new DefaultComboBoxModel(months));
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(332, 244, 78, 32);
		comboBox_2.setModel(new DefaultComboBoxModel(years));
		getContentPane().add(comboBox_2);
		
		Control control = new Control();
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				try {
					MenuScreen menu;
					
					int hata = 0;
					
					if(control.isStringEmpty(name.getText())) {
						hata = 1;
					}
					
					if(control.isStringEmpty(surname.getText())) {
						hata = 	1;
					}
					
					if(control.isStringEmpty(email.getText())) {
						hata = 1;
					}else if(!control.isEMailValid(email.getText())) {
						hata_email.setVisible(true);	
						email.setText("");
						hata = 2;
					}
					
					if(control.isStringEmpty(password.getText())) {
						hata = 1;
					}
					
					System.out.println(comboBox_2.getSelectedIndex() +""+  comboBox_1.getSelectedIndex() +""+  comboBox.getSelectedIndex());
					if(comboBox_2.getSelectedIndex() == 0 ||  comboBox_1.getSelectedIndex() == 0 ||   comboBox.getSelectedIndex() == 0) {
						hata =1;
					}
					
				   if(hata == 0){
						String date = comboBox_2.getSelectedIndex() + "-" + comboBox_1.getSelectedIndex() + "-" + comboBox.getSelectedIndex();
						 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
						 java.util.Date date1 = sdf.parse(date);
						 
						java.sql.Date sqlDate = new Date(date1.getTime()); 
						boolean flag = database.userRegister(name.getText(), surname.getText(),username.getText() , email.getText() , password.getText(),sqlDate);
						if(flag) {
							JOptionPane.showMessageDialog(null,"Registration successful, log in");
							try {
								menu = new MenuScreen();
								setVisible(false);
								menu.setVisible(true);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
							dispose();
							
						}else
							JOptionPane.showMessageDialog(null,"A user with this username already exists");
						    username.setText("");
					}else if(hata == 1){
						JOptionPane.showMessageDialog(null,"Please fill all the fields!!!");
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
					
			}
		});
		
		btnNewButton.setBounds(189, 454, 141, 62);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 984, 561);
		getContentPane().add(lblNewLabel);
		

		
		

	}
}
