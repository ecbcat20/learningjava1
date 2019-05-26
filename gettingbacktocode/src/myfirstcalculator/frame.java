/**
 * 
 */
package myfirstcalculator;

import java.awt.GridLayout;

/**
 * @author evanb
 *
 */
import javax.swing.*;

public class frame {

	/**
	 * @param args
	 */
	
	public static JFrame frame = new JFrame("My Calculator");
	public static JPanel panel = new JPanel();
	public static JTextField calcField = new JTextField("10");
	
	
	public static void screensetup () {
		//run once
		
		frame.setSize(100,500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setSize(500,500);
		panel.setLayout(new GridLayout(6,1));
		panel.add(calcField);
		calculatorclass.mainOp();
		frame.add(panel);
		panel.setVisible(true);
		frame.setVisible(true);
		
		
	}
	
	public static void calculator() {
		
		try {
		int numToCalc = Integer.parseInt(null);
		System.out.println(numToCalc);
		}
		
		catch (NumberFormatException e) {
			System.err.println("Unable to Format" + e);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		screensetup();
		calculator();
		operationsManager.getValue2();
		operationsManager.getValue3();
		operationsManager.getValue4();
		operationsManager.getValue5();
		

	}

}
