package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.Card;
import model.Deck;

import org.junit.Test;

import Gui.MainFrame;

public class DeckTest {

	/* this test checks if the number of the cards that are in the array is true */
	@Test
	public void testGetNumberOfCards() {
		Deck tester = new Deck("",30);
		ArrayList<Card> cards = new ArrayList<Card>();

		java.net.URL url2 = MainFrame.class.getResource("/pictures/2s.jpg");
		ImageIcon card49 = new ImageIcon(url2);
		Card twos = new Card(card49, 2, "spade", "Two");
		java.net.URL url3 = MainFrame.class.getResource("/pictures/3s.jpg");
		ImageIcon card45 = new ImageIcon(url3);
		Card threes = new Card(card45, 3, "spade", "Three");
		java.net.URL url4 = MainFrame.class.getResource("/pictures/4s.jpg");
		ImageIcon card1 = new ImageIcon(url4);
		Card fours = new Card(card1, 4, "spade", "Four");
		java.net.URL url5 = MainFrame.class.getResource("/pictures/5s.jpg");
		ImageIcon card13 = new ImageIcon(url5);
		Card fives = new Card(card13, 5, "spade", "Five");
		cards.add(twos);
		cards.add(threes); 
		cards.add(fours);
		cards.add(fives);
		tester.setCards(cards);
		assertEquals("Result", 4, tester.getNumberOfCards());
	}

}
