import java.util.*;
public class Factorialex5
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the value.....");
	int x = sc.nextInt();
	

	long f = 1;
	for (int i=1;i<=x; i++) 
	{
	  f *=i;   // here, fact=factorial variable, * = multiplying the value using fact, i= variable .    
	}
	System.out.println("The Factorial of " + x + " is " + f); // here + denotes combining the println statement together.
}
}


	