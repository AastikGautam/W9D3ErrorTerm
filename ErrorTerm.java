package errorterm;

import java.util.Scanner;

/*
 * @author Aastik Gautam
 * @version 1.0    2018-03-07  
 */

public class ErrorTerm {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		
		System.out.println("Enter value 1");
		double value1 = a.nextDouble();
		
		System.out.println("Enter ErrorTerm");
		double errorterm = a.nextDouble();

		
		System.out.println("Enter value 2");
		double value2 = a.nextDouble();
				
		System.out.println("Enter ErrorTerm");
		double ErrorTerm = a.nextDouble();
	
		
		System.out.println("Write the function you want to perform either Multiply or Divide");
		
		double value_product = value1*value2;
		double value1_error_fraction = errorterm/Math.abs(value1);
		double value2_error_fraction = ErrorTerm/Math.abs(value2);
		double product_error_term = (value1_error_fraction + value2_error_fraction)*Math.abs(value_product);
		
		double value_quotient = value1/value2;
		double value1_Error_Fraction = errorterm/Math.abs(value1);
		double value2_Error_Fraction = ErrorTerm/Math.abs(value2);
		double quotient_error_term = (value1_Error_Fraction + value2_Error_Fraction)*Math.abs(value_quotient);
		
		String input = a.next();
		
		if (input.equals("multiply")) {
			System.out.println("Answer " + value_product + " ± " + product_error_term);
		}
		else if (input.equals("divide")) {
			System.out.println("Answer " + value_quotient + " ± " + quotient_error_term);
		}
		else {
			System.out.println("Enter multiply or divide");
		}
		a.close();
		
	}
}
