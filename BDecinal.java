import java.math.BigDecimal;
import java.util.Scanner;

public class BDecinal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//That user to enter what they want
		double firstNum = input.nextDouble();
		System.out.print("Please enter an operator:");
		char operator = input.next().charAt(0);
		double secondNum = input.nextDouble();
		System.out.println("Please enter a scale");
		int scale = input.nextInt();
		
		//calculate
		BigDecimal b1 = new BigDecimal(Double.toString(firstNum));
		BigDecimal b2 = new BigDecimal(Double.toString(secondNum));
		
		if(operator == '+'){
			double ans = b1.add(b2).doubleValue();
			System.out.println("The answer is "+ans);
		}
		else if(operator =='-'){
				double ans = b1.subtract(b2).doubleValue();
				System.out.println("The answer is "+ans);
		}
		else if(operator == '*'){
				double ans = b1.multiply(b2).doubleValue();
				System.out.println("The answer is "+ans);
		}
		else{
				BigDecimal ans = b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP);
				System.out.println("The answer is "+ans);
		}
		
	}
}
