package Junit;


import static org.junit.Assert.*;
import model.Computer;
import model.Deck;
import model.Player;

import org.junit.Test;

import Controller.Controler;

public class ControlerTest {
	

	@Test
	public void testStand() {
		fail("Not yet implemented");
	}

	@Test
	public void testChickIFOverOrEqual21() {
		Controler tester = new Controler();
		Deck d =new Deck("shaker",20);
		
		tester.setD(d);
		assertEquals("Result", 0, tester.chickIFOverOrEqual21());
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