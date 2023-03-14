import java.util.*;

class Manager
{
void assigning()
{
	int emps;
	String Projname;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Employees:");
	emps=sc.nextInt();
	System.out.println("Enter Project Name");
	Projname=sc.next();
if(emps<=100)
{
	System.out.println("you cant add anymore Employee");
	System.out.println(Projname);
}
}
void salary()
{
	int sal=50000;
	System.out.println(sal);
}
}
class TL extends Manager
{
void work()
{
	String workname;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the workname:");
	workname=sc.next();
	System.out.println(workname);
}
}
class Employee extends TL
{
void emp()
{
	String name="dharnesh";
	System.out.println(name);
}
}
public class MainInheritanceOOP
{
public static void main(String args[])
{
	Employee obj= new Employee();
	obj.assigning();
	obj.work();
	obj.salary();
	obj.emp();
}
}







































