package tests;

import static org.junit.Assert.*;
import model.Computer;
import model.Deck;
import model.Player;

import org.junit.Test;

import Controller.Controler;

public class ControlerTest {
	@Test
	public void testAddPlayer() {
		Controler tester = new Controler();
		Player p = new Player("shaker", "Khateeb", 40 , "shaker89", "1234");
		assertEquals("Result", true, tester.addPlayer(p));
	}

	@Test
	public void testStand() {
	}

	@Test
	public void testChickIFOverOrEqual21() {
		Controler tester = new Controler();
		Player wael =new Player("shaker", "Khateeb", 40 , "shaker89", "1234");
		Deck d =new Deck("shaker", 20);
		
		d.setchalenger(wael);
		d.setComputer(wael);
		tester.setD(d);
		assertEquals("Result", "the player busted", tester.chickIFOverOrEqual21());
	}

	
	@Test
	public void testShuffle() {
		Controler tester = new Controler();
		Deck d =new Deck(" ",20);
		tester.setD(d);
		assertEquals("Result", 0, tester.shuffle());
	}

	@Test
	public void testChickIFOver21() {
		Controler tester = new Controler();
		assertEquals("Result", "the computer win", tester.chickIFOverOrEqual21());
		
	}

	
	@Test
	public void testAddUser() {
		Controler tester = new Controler();
		assertEquals("Result", true, tester.addUser("shadi", "khateev", "shad", "111", 30));
	}

	@Test
	public void testHit() {
		Controler tester = new Controler();
		Deck d= new Deck("",10);
		d.hit(true, false);
		
		assertEquals("Result", "the computer is win", tester.hit());
	}
}
