import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double number1 , number2;
	System.out.println("Enter Your First Number: ");
	number1 = scan.nextDouble();
	System.out.println("Enter Your Second Number: ");
	number2 = scan.nextDouble();

	System.out.println("Select The Calculation You Want To Do: ");
    String choice = scan.next();
    
    switch (choice) {
    case "+":
    	System.out.println("Addition:" + (number1 + number2));
    	break;
    case "-":
    	System.out.println("Subtraction: " + (number1 - number2));
        break;
    case "*":
    	System.out.println("Multiplication: " + (number1 * number2));
    	break;
    case "/":
    	System.out.println("Division: " + (number1 / number2));
    	break;
    default: 
    	System.out.println("Error!");
    }
  }
}
