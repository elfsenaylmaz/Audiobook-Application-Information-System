package Audiobook;

import java.awt.EventQueue;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception{
		
		Database d = new Database();
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
