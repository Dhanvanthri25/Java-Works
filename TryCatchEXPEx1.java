public class TryCatchEXPEx1{
public static void main(String args[])
{
	System.out.println("11");
	System.out.println("Beforedivide");
	try
{
	int x = 1/0;
	System.out.println("Afterdivide");
}


catch(ArithmeticException ae)
{
	System.out.println("A number cannot be divided by zero");
}

finally
{
	System.out.println("Final Statement");
}
}
}


 
	