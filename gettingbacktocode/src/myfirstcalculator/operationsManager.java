/**
 * 
 */
package myfirstcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

/**
 * @author ecbca
 *
 */
public abstract class operationsManager extends calculatorclass {

	/**
	 * @param args
	 */

	static String calcVal3;
	static float calcVal2;
	
	static String calcVal4;
	static float calcVal5;
	
	static String calcVal6;
	static float calcVal7;
	
	static String calcVal8;
	static float calcVal9;

	static void getValue2() {
		addition.addActionListener(new ActionListener(){  

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				calcVal3 = frame.calcField.getText();
				calcVal2 = Integer.parseInt(calcVal3);
				System.out.println(calcVal2 + " " + "PLUS");
				calculatorclass.operationChosen = 1;


			}  
		});  


	}

	static void getValue3() {
		subtraction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal4 = frame.calcField.getText();
				float calcVal5 = Integer.parseInt(calcVal4);
				System.out.println(calcVal5 + " " + "MINUS");
				calculatorclass.operationChosen = 2;

			}
		});
	}

	static void getValue4() {
		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal6 = frame.calcField.getText();
				float calcVal7 = Integer.parseInt(calcVal6);
				System.out.println(calcVal7 + " " + "MULTIPLIED BY");
				calculatorclass.operationChosen = 3;
			}
		});
	}

	static void getValue5() {
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal8 = frame.calcField.getText();
				float calcVal9 = Integer.parseInt(calcVal8);
				String secondCalcVal = frame.calcField.getText();
				float finalCalc = Integer.parseInt(secondCalcVal);
				System.out.println(finalCalc + " " + "Divided By");
				calculatorclass.operationChosen = 4;

			}



		});
	}


	static void submit() {
		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(operationChosen == 1) {
					String finalValue = frame.calcField.getText();
					float newFinal = Integer.parseInt(finalValue);
					System.out.println(calcVal2 + newFinal);
					frame.calcField.setText(""+ (calcVal2 + newFinal)); //why does this happen?
					
				} else if(operationChosen == 2) {
					String finalValue = frame.calcField.getText();
					float newFinal = Integer.parseInt(finalValue);
					System.out.println(newFinal);
					System.out.println(calcVal5);
					frame.calcField.setText("" + (calcVal5-newFinal));
;
				} else if(operationChosen == 3) {
					String finalValue = frame.calcField.getText();
					float newFinal = Integer.parseInt(finalValue);
					System.out.println(calcVal7 + finalValue);
					frame.calcField.setText("" + (calcVal7*newFinal));
					
				}
			}
		});
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		frame.main(args);


	}

}


