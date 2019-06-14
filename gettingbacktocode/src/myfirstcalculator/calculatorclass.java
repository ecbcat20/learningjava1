/**
 * 
 */
package myfirstcalculator;

import javax.swing.JButton;

/**
 * @author evanb
 *
 */
import myfirstcalculator.frame;
public class calculatorclass {

	/**
	 * @param args
	 * @return 
	 */


	public String add = "Add";
	public String sub = "Subtract";
	public String div = "Divide";
	public String mult = "Multiply";

	//create buttons
	public static JButton addition = new JButton("+");
	public static JButton subtraction = new JButton("-");
	public static JButton multiplication = new JButton("x");
	public static JButton division = new JButton("÷");
	public static JButton equals = new JButton("=");

	public static String calcVal = frame.calcField.getText();

	public static int operationChosen = 0;
	//1 = add, 2 = sub, 3 = multiply, 4 = divide
	
	public static void mainOp() {

		//add all to frame
		frame.panel.add(addition);
		frame.panel.add(subtraction);
		frame.panel.add(multiplication);
		frame.panel.add(division);
		frame.panel.add(equals);

		//set everything visible
		addition.setVisible(true);
		subtraction.setVisible(true);
		multiplication.setVisible(true);
		division.setVisible(true);
		equals.setVisible(true);

	}

	static void calculate() {
		// System.out.println(calcVal2);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainOp();
		
	//	calculate();


	}

}
