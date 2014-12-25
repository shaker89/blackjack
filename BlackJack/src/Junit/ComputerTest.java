package Junit;





import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.Card;
import model.Computer;

import org.junit.Test;

import Gui.MainFrame;

public class ComputerTest {

	@Test
	public void testUpdateSomeOFCards() {
		Computer tester = new Computer();
		java.net.URL url8c = MainFrame.class.getResource("/pictures/8c.jpg");
		ImageIcon card22 = new ImageIcon(url8c);
		Card card1= new Card(card22, 8,"club", "Eight");
		
		java.net.URL url9d = MainFrame.class.getResource("/pictures/9d.jpg");
	    ImageIcon card16 = new ImageIcon(url9d);
	    Card card2 = new Card(card16, 9, "diamond", "Nine");
	    
		ArrayList<Card> handArray = new ArrayList<Card>();
		handArray.add(card1);
		handArray.add(card2);
		//tester.setHandArray(handArray);
		assertEquals("Result", 17, tester.updateSomeOFCards());
		
	}

}