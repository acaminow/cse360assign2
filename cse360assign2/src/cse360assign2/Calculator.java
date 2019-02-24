package cse360assign2;

public class Calculator 
{
	// int to track total
	private int total;
	
	// string to record history of changes
	private String history;
	
    /**
     * The constructor for the Calculator class will instantiate the "total"
     * variable to 0
     * Constructor will also instantiate the "history" string to "O "
     */
	public Calculator() 
	{
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
    /**
     * The getTotal method will return the current integer value stored in the
     * Calculator class variable "total"
     * 
     * @return the integer value stored in the total variable
     */
	public int getTotal () 
	{
		return total;
	}
	
    /**
     * The add method will not return any value.
     * This method will add the integer value of the parameter passed to the 
     * "total" variable, updating the total with this new amount.
     * The add method will also update the history string to concatenate its
     * current contents with "+ value " but the numerical integer for "value" 
     * will be substituted.
     * 
     * @param value integer value to add to the total variable
     */
	public void add (int value) 
	{
		int numToAdd = value;
		total = total + numToAdd; // add parameter to total
		
		// update history to show addition of parameter value to total
		history = history + "+ " + numToAdd + " ";
	}
	
    /**
     * The subtract method will not return any value.
     * This method will subtract the integer value of the parameter passed 
     * from the "total" variable, updating the total with this new amount.
     * The subtract method will also update the history string to concatenate 
     * its current contents with "- value " but the numerical integer for 
     * value will be substituted.
     * 
     * @param value integer value to subtract from the total variable
     */
	public void subtract (int value) 
	{
		int numToSubtract = value;
		total = total - numToSubtract; // subtract parameter from total
		
		// update history to show subtraction of parameter value from total
		history = history + "- " + numToSubtract + " ";
	}
	
    /**
     * The multiply method will not return any value.
     * This method will multiply the integer value of the parameter passed
     * with the "total" variable, updating the total with this new amount.
     * The multiply method will also update the history string to concatenate 
     * its current contents with "* value " but the numerical integer for 
     * value will be substituted.
     * 
     * @param value integer value to multiply with the total variable
     */
	public void multiply (int value) 
	{
		int numToMultiply = value;
		total = total * numToMultiply; // multiply total with parameter
		
		// update history to show multiplication of parameter value with total
		history = history + "* " + numToMultiply + " ";
	}
	
    /**
     * The divide method will not return any value.
     * This method will divide the "total" variable with the integer parameter 
     * passed to the method, updating the total with this new amount.
     * This method will perform integer division between these operands.
     * If the parameter is zero, the total will be set to zero.
     * This message will not print an error message or perform exception 
     * handling.
     * The divide method will also update the history string to concatenate 
     * its current contents with "/ value " but the numerical integer for 
     * value will be substituted.
     * 
     * @param value integer value to divide the total variable by
     */
	public void divide (int value) 
	{
		int numToDivide = value;
		
		// check if parameter == 0
		if (numToDivide == 0)
		{
			// if so, set total to 0
			total = 0;
			
			// update history to show division of total by 0
			history = history + "/ 0 ";
		}
		
		// else perform int division
		else
		{
			total = total / numToDivide; // int division
			
			// update history to show division of total by parameter value
			history = history + "/ " + numToDivide + " ";
		}
	}
	
    /**
     * The getHistory method will not take any parameters.
     * This method will return a string containing a history of the 
     * modifications made to the "total" variable since its instantiation.
     * The string "history" will be returned as it has been modified during 
     * program execution to track changes.
     * The String will use symbols +, -, *, / to represent addition, 
     * subtraction, multiplication, and division.
     * Operators and operands will be separated by spaces in the string.
     * The String will begin at zero then show all modifications to the value 
     * of total. The full revision history will be presented in this String.
     * 
     * @return String containing the history of changes made to total variable
     */
	public String getHistory () 
	{
		return history;
	}
}
