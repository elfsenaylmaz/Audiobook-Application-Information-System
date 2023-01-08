package Audiobook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BalanceScreen extends JFrame {
	
	Database db = new Database();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	public BalanceScreen() throws Exception{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel balanceLabel = new JLabel("100");
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		balanceLabel.setBackground(Color.WHITE);
		balanceLabel.setOpaque(true);
		balanceLabel.setBounds(204, 120, 101, 30);
		contentPane.add(balanceLabel);
		
		
		JLabel lblCurrentBalanceText = new JLabel("CURRENT BALANCE :\r\n");
		lblCurrentBalanceText.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrentBalanceText.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCurrentBalanceText.setBounds(102, 67, 212, 30);
		contentPane.add(lblCurrentBalanceText);
		
		JLabel lblCurrentBalance = new JLabel("0");
		lblCurrentBalance.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblCurrentBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblCurrentBalance.setBounds(322, 67, 74, 30);
		contentPane.add(lblCurrentBalance);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tmp = Integer.parseInt(balanceLabel.getText())+10;
				String tmp2 = tmp + "";
				balanceLabel.setText(tmp2);
			}
		});
		btnPlus.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnPlus.setBounds(315, 120, 44, 30);
		contentPane.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tmp = Integer.parseInt(balanceLabel.getText())-10;
				if(tmp >= 0) {
					String tmp2 = tmp + "";
					balanceLabel.setText(tmp2);
				}
				else {
					JOptionPane message  = new JOptionPane();
					message.showMessageDialog(null, "Invalid balance entry!");
				}
				
			}
		});
		btnMinus.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		btnMinus.setBounds(150, 120, 44, 30);
		contentPane.add(btnMinus);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = lblCurrentBalance.getText();
				int tmp2 = Integer.parseInt(tmp) + Integer.parseInt(balanceLabel.getText());
				tmp = tmp2 + "";
				lblCurrentBalance.setText(tmp);
				
				try {
					 db.increaseBalance(tmp2,"4000");     //  user_ssn döndürcez
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
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
