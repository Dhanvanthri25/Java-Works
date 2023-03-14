import java.util.*;    //Exception used as ifelse action

class MyException extends Exception{
String str1;
MyException(String str2)
{
str1=str2;
}
public String toString(){
return ("MyException Occurred: "+str1);
}
}



class ExpExample1{
public static void main(String args[])
{
try    //try replaced by if
{
	System.out.println("Start of try block");
	throw new MyException("Error Message");
}

	catch(MyException exp)   // catch replaced by else
{
	System.out.println("Catch Block");
	System.out.println(exp);
}
}
}
