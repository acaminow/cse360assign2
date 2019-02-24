package cse360assign2;

public class Calculator {

	private int total;
	
    /**
     * The constructor for the Calculator class will instantiate the "total"
     * variable to 0
     */
	public Calculator() {
		total = 0;  // not needed - included for clarity
	}
	
    /**
     * The getTotal method will return the current integer value stored in the
     * Calculator class variable "total"
     * 
     * @return the integer value stored in the total variable
     */
	public int getTotal () {
		return 0;
	}
	
    /**
     * The add method will not return any value.
     * This method will add the integer value of the parameter passed to the 
     * "total" variable, updating the total with this new amount.
     * 
     * @param value integer value to add to the total variable
     */
	public void add (int value) {
		
	}
	
    /**
     * The subtract method will not return any value.
     * This method will subtract the integer value of the parameter passed 
     * from the "total" variable, updating the total with this new amount.
     * 
     * @param value integer value to subtract from the total variable
     */
	public void subtract (int value) {
		
	}
	
    /**
     * The multiply method will not return any value.
     * This method will multiply the integer value of the parameter passed
     * with the "total" variable, updating the total with this new amount.
     * 
     * @param value integer value to multiply with the total variable
     */
	public void multiply (int value) {
		
	}
	
    /**
     * The divide method will not return any value.
     * This method will divide the "total" variable with the integer parameter 
     * passed to the method, updating the total with this new amount.
     * This method will perform integer division between these operands.
     * If the parameter is zero, the total will be set to zero.
     * This message will not print an error message or perform exception 
     * handling.
     * 
     * @param value integer value to divide the total variable by
     */
	public void divide (int value) {
		
	}
	
    /**
     * The getHistory method will not take any parameters.
     * This method will return a string containing a history of the 
     * modifications made to the "total" variable since its instantiation.
     * The String will use symbols +, -, *, / to represent addition, 
     * subtraction, multiplication, and division.
     * Operators and operands will be separated by spaces in the string.
     * The String will begin at zero then show all modifications to the value 
     * of total. The full revision history will be presented in this String.
     * 
     * @return String containing the history of changes made to total variable
     */
	public String getHistory () {
		return "";
	}
}
