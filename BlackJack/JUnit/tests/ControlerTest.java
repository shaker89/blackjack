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
		fail("Not yet implemented");
	}

	@Test
	public void testChickIFOverOrEqual21() {
//		Controler tester = new Controler();
//		Deck d =new Deck();
//		Player wael =new Player("shaker", "Khateeb", 40 , "shaker89", "1234");
//		d.setWael(wael);
//		d.setComputer(wael);
//		tester.setD(d);
//		assertEquals("Result", 0, tester.chickIFOverOrEqual21());
	}

	
	@Test
	public void testShuffle() {
//		Controler tester = new Controler();
//		Deck d =new Deck();
//		tester.setD(d);
//		assertEquals("Result", 0, tester.shuffle());
	}

	@Test
	public void testChickIFOver21() {
//		Controler tester = new Controler();
//		assertEquals("Result", 0, tester.chickIFOver21());
//		
	}

	
	@Test
	public void testAddUser() {
		Controler tester = new Controler();
		assertEquals("Result", true, tester.addUser("shadi", "khateev", "shad", "111", 30));
	}

	@Test
	public void testHit() {
//		Controler tester = new Controler();
//		Deck d= new Deck();
//		d.hit(true, false);
//		
//		assertEquals("Result", "the computer is win", tester.hit());
	}
}
