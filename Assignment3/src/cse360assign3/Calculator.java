package cse360assign3;

/**
 * 
 * Calculator - Calculator class that I will use to do some arithmetic operation
 * @author hamadalmazroa
 *
 */
 
public class Calculator {
 
	private int total;
	private String historyOfAction;
	private String temporary;
	
	/**
	 * Calculator - constructor that is used to set the variable total to zero
	 * 
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		historyOfAction = "" + 0;
		temporary = "";
	}
	
	/**
	 * getTotal - get total method that has no argument and will return the total
	 * 
	 * @return total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - add method that is used to add integers and reuturn the sum
	 * 
	 * @param value
	 */
	public void add (int value) {
		total += value;
		historyOfAction +=" + " + value; 
	}
	
	/**
	 * subtract - subtract method that is used to subtract integers
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		total -= value;
		historyOfAction +=" - " + value; 

	}
	
	/**
	 * multiply - multiply method that is used to multiply integers
	 * 
	 * @param value
	 */
	
	public void multiply (int value) {
		if(total == 0)
			total =1;
		
		total = total * value;
		historyOfAction +=" * " + value; 
	}
	
	/**
	 * divide - divide method that is used to divide integers
	 * 
	 * @param value
	 */
	
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
		total /= value;
		historyOfAction +=" / " + value; 
	}
	
	/**
	 * getHistory - getHistory method that is used to return a history
	 *  of all arithmetic operations as a string.
	 * 
	 * @return temporary which has the history of the arithmetic operation
	 */
	
	public String getHistory () {
		temporary = historyOfAction;
		historyOfAction = "" + 0;
		return temporary;	
		
	}
}