package Controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

import javax.swing.JOptionPane;

import model.Player;
import Gui.MainFrame;
import Gui.LogIn_Frame;

public class main {

	public static void main(String[] args) {
 System.out.println("Game Is Running");
// if(Controler.haveInstance()==false)
//	 System.out.println("dont have instance");
// else System.out.println("have instance");
//final Controler system = Controler.getInstance();
 final Controler system= readSavedData();
 LogIn_Frame gm = LogIn_Frame.getInstance(system);
 gm.setVisible(true);
// system.saveSystem();


	}
	public static Controler readSavedData() {
//		if(Controler.getInstance()==null)
//			System.out.println("error");
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
