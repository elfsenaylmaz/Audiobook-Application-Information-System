package Audiobook;

import java.awt.EventQueue;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception{
		
		Database database = new Database();
		database.isExpired();
		System.out.println("aaaaa");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen main  = new MainScreen();
					main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
