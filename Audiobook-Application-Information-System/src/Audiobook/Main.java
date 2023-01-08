package Audiobook;

import java.awt.EventQueue;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Database d = new Database();
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MainScreen main  = new MainScreen();
					Sign_upScreen main = new Sign_upScreen();
					main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
