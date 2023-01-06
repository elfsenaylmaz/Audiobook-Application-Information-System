package Audiobook;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MainScreen() {
		
		setTitle("Storytel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("SIGN UP");
		btnNewButton_2.setForeground(new Color(102, 51, 51));
		btnNewButton_2.setBackground(new Color(255, 204, 153));
		btnNewButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sign_upScreen sign_up;
				try {
					sign_up = new Sign_upScreen();
					setVisible(false);
					sign_up.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		btnNewButton_2.setBounds(518, 229, 294, 98);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("SIGN IN");
		btnNewButton_2_1.setForeground(new Color(102, 51, 51));
		btnNewButton_2_1.setBackground(new Color(255, 204, 153));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sign_inScreen sign_in;
				try {
					sign_in = new Sign_inScreen();
					setVisible(false);
					sign_in.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(172, 231, 294, 94);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME TO STORYTEL");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 153, 0));
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 35));
		lblNewLabel_2.setBounds(172, 84, 640, 101);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 11, 974, 561);
		contentPane.add(lblNewLabel_1);
	}

}
