package exe;

import java.awt.EventQueue;

import vista.TheLaby;

public class Ejecutable {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheLaby frame = new TheLaby();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
