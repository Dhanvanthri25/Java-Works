import java.util.*;
public class OddorEven
{
public static void main(String args[])
{
Scanner ds=new Scanner(System.in);
for(int i=0;i<=10;i++)
{
System.out.println("Enter Number");
int x=ds.nextInt();
if (x%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}}
