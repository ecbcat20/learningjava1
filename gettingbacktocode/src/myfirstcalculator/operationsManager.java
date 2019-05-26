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


	static void getValue2() {
		addition.addActionListener(new ActionListener(){  

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String calcVal3 = frame.calcField.getText();
				int calcVal2 = Integer.parseInt(calcVal3);
				System.out.println(calcVal2 + " " + "PLUS");

			}  
		});  


	}

	static void getValue3() {
		subtraction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal4 = frame.calcField.getText();
				int calcVal5 = Integer.parseInt(calcVal4);
				System.out.println(calcVal5 + " " + "MINUS");
			}
		});
	}

	static void getValue4() {
		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal6 = frame.calcField.getText();
				int calcVal7 = Integer.parseInt(calcVal6);
				System.out.println(calcVal7 + " " + "MULTIPLIED BY");
			}
		});
	}

	static void getValue5() {
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String calcVal8 = frame.calcField.getText();
				int calcVal9 = Integer.parseInt(calcVal8);
				String secondCalcVal = frame.calcField.getText();
				int finalCalc = Integer.parseInt(secondCalcVal)
						System.out.println(calcVal9 + " " + "DIVIDED BY");

				void submission() {
					equals.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int finalCalc = Integer.parseInt(secondCalcVal);
							int resultOfDivide = calcVal9/finalCalc;
							System.out.println(resultOfDivide);


						}
					});
				}


			});

		}

		void submission() {
			equals.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int finalCalc = Integer.parseInt(secondCalcVal);
					int resultOfDivide = calcVal9/finalCalc;
					System.out.println(resultOfDivide);


				}
			});
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			frame.main(args);


		}

	}


