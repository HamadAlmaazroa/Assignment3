
package cse360assign3;

/**
 * 
 * Calculator - Calculator class that I will use to do some arithmetic operation
 * @author hamadalmazroa
 *
 */
 
public class Calculator {

	private int total;
	
	/**
	 * Calculator - constructor that is used to set the variable total to zero
	 * 
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - get total method that has no argument and will return a 0
	 * @return 0
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
	}
	
	/**
	 * subtract - subtract method that is used to subtract integers and reuturn the differen
	 * between the two
	 * 
	 * @param value
	 */
	
	public void subtract (int value) {
		total -= value;
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

	}
	
	/**
	 * getHistory - getHistory method that is used to an empty string
	 * 
	 */
	
	public String getHistory () {
		return "";
	}
}