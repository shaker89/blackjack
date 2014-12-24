/**
 * 
 */
package Controller;

import java.io.Serializable;

/**
 * @author wael
 *
 */
public interface IControler extends Serializable  {
	
	
	
	
	
	//using this function when clicking on hit button
	public String hit();
	
	
	//using this function when clicking on stand button
	public String stand();
	
	
	
	//using this function when clicking on start button
	public void start();
	
	
	// shuflle the cards
	
	public int shuffle();
	
	public void updateSumOFCards();
	


//this function chick if the sum of the plaey is over 17




public String chickIFOverOrEqual21();
	
	
	

}
