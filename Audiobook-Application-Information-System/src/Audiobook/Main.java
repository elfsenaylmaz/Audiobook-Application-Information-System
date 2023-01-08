package Audiobook;

import java.awt.EventQueue;


public class Main {

	public static void main(String[] args) throws Exception{
		
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
