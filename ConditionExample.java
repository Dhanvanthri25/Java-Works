import java.util.*;

public class ConditionExample{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter The Value Of a");
int a=obj.nextInt();
System.out.println("Enter The Value Of b");
int b=obj.nextInt();

if(a>=35 & b<=80)
{
System.out.println("pass" + "first Grade");
}
else
{
System.out.println("fail");
}
}
}  