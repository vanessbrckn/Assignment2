/** Vanessa Bracken
 * ASU ID: 1217621743
 * Assignment 2
 * Class that implements functions that add and subtract integers
 * @author vanessa
 *
 */
 package cse360assign2;
 
 /**
  * Class that declares a @param called total
  * 
  * @param history is a string buffer that will keep track of previous ops in a 
  * string. 
  * 
  */

 public class AddingMachine {

 	private int total;
 	private String history;
 	
 	/**
 	 * Adding Machine holds the variables that will be used in other 
 	 * functions.
 	 * 
 	 * @param total will include the total of all previous operations.
 	 * @param history will append a string describing the calculations.
 	 * 
 	 */
 	
 	public AddingMachine () {
 		total = 0;  // not needed - included for clarity
 		history = " 0 ";
 		
 	}
 	
 	/**
 	 * get Total returns the value of total
 	 * 
 	 * @return total which is the cumulative total after all the operations.
 	 */
 	
 	public int getTotal () {
 		
 		return total;
 	}
 	
 	/**
 	 * value is added to total
 	 * 
 	 * @param value is added to total
 	 * @param history  string equivalent of operation is added to history.
 	 * 
 	 */
 	
 	public void add (int value) {
 		
 		total = total + value;
 		history = history + " + " + value;
 		
 	}
 	
	/**
 	 * value is subtracted from total
 	 * 
 	 * @param value		holds the int that will be subtracted from total
 	 * 
 	 */
 	
 	public void subtract (int value) {
 		
 		total = total - value;
 		history = history + " - " + value;
 	}
 	
 	/**
 	 * @returns the full operation list that was input
 	 *
 	 */
 		
 	public String toString () {
 		return history;
 	}

 	public void clear() {
 	
 	}
 }
