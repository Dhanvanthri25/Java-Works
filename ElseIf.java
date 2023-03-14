import java.util.*;
public class ElseIf
{
public static void main(String args[])
{
Scanner ds=new Scanner(System.in);
System.out.println("Enter your name");
String x=ds.next();
if(x.equals("dharnesh"))
{
System.out.println("RSP12001");
}
if(x.equals("siva"))
{
System.out.println("RSP12002");
}
else if(x.equals("manoj"))
{
System.out.println("playboy");
}
else
{
System.out.println("Enter your valid name");
}
}
}

