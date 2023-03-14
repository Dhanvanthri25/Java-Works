import java.util.*;
class Fullstack{
	int number;
	String name;
	Fullstack()
	{
		System.out.println("constructor called");
	}
}
class RS{  //This class name is used to save as RS.java
	public static void main(String args[])
	{

	Fullstack obj1=new Fullstack();
		System.out.println(obj1.name);
		System.out.println(obj1.number);
	}
}

		
	
	
	