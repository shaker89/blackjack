package Controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

import javax.swing.JOptionPane;

import model.Player;
import Gui.MainFrame;
import Gui.gui_Main;

public class main {

	public static void main(String[] args) {
 System.out.println("Game Is Running");
 System.out.println("astgfr allah al3dem");
 System.out.println("ya zlme le m5rbenhaaaaaa!!");
 int flag;
 final Controler system= readSavedData();
 gui_Main gm = new gui_Main(system);
 gm.setVisible(true);
 system.saveSystem();
// MainFrame mf = new MainFrame(system);
// mf.setVisible(true);
 //flag=c.start();
 //System.out.println("end of the game");


	}
	private static Controler readSavedData() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("BlackJack.ser");
			ois = new ObjectInputStream(fis);
			return (Controler) ois.readObject();
		} catch (Exception e) {
			return new Controler();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (Exception e) {
				return new Controler();
			}
		}
	}
	
}
