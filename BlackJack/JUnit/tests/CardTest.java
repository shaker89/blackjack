package tests;

import static org.junit.Assert.*;

import javax.swing.ImageIcon;

import model.Card;

import org.junit.Test;

import Gui.MainFrame;

public class CardTest {

	@Test
	public void testGetValue() {
		java.net.URL url8c = MainFrame.class.getResource("/pictures/8c.jpg");
		ImageIcon card22 = new ImageIcon(url8c);
		Card tester = new Card(card22, 8,"club", "Eight");
		assertEquals("Result", 8, tester.getValue());
	}

	

}
