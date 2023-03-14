import java.util.*;

class Calculator
{	

public static void main(String args[])
{
	String operator;
	Double number1, number2, result;   //Int is replaced by Double here
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose an operator: +,-,*,or/");
	operator= sc.nextLine();

	System.out.println("Enter the first number");
	number1 = sc.nextDouble();


	System.out.println("Enter the second number");
	number2 = sc.nextDouble();

switch(operator){
	
	case "+": 
		result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + result);
	break;

	case "-":
		result = number1 - number2; 
		System.out.println(number1 + " - " + number2 + " = " + result);
	break;

	case "*":
		result = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + result);
	break;

	case "/":
		result = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + result);
	break;


	default:
		System.out.println("Invalid OPerator!");
		
} 


}
}