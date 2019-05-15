/**
 * 
 */
package gettingbacktocode;

/**
 * @author evanb
 *
 */
public class VarPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using variables with printing
		
		//set up variables
		int jk = 1;
		String myString = "sometext";
		
		//print the integer $jk
		System.out.println(jk);
		
		//print the string myString
		System.out.println(myString);
		
		//note the difference between these two lines
		System.out.println(myString); //returns the string "sometext"
		System.out.println("myString"); //returns the string "myString"
		
		//adding to a print function
		System.out.println(myString + " " + jk);
		//note the space, makes it easier to see
	

	}

}
