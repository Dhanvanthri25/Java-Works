
import java.util.*;
class Student13
{
void check()
{
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name: ");
	name=sc.next();
	    switch(name)
	       {
	   	    case "abi":
                       	    System.out.println("Name: Arun,\n Dep: SP ,\n Degree: BE ece");
		    break;
		   case "saga":
                        	   System.out.println("Name: Abishek,\n Dep: SP ,\n Degree: MCA");
		    break;
		   case "Antony":
                          	   System.out.println("Name: Shakthi Ganesh,\n Dep: SP ,\n Degree: MSc");
		    break;
		   case "divya":
                          	   System.out.println("Name: Divya,\n Dep: SP ,\n Degree: BSc");
		    break;
		   case "Sindhu":
                          	   System.out.println("Name: Sindhu,\n Dep: SP ,\n Degree: MSc");
		    break;
		   case "sownthariya":
                          	   System.out.println("Name: Sownthariya,\n Dep: SP ,\n Degree: MSc");
		    break;
		   case "meera":
                          	   System.out.println("Name: Meera,\n Dep: SP ,\n Degree: B.Tech");
		    break;
		   case "uma":
                          	   System.out.println("Name: Uma,\n Dep: SP ,\n Degree: BSc");
		    break;
		   case "dhanvanth":
                          	   System.out.println("Name: Dhanvanth,\n Dep: SP ,\n Degree: B.Sc");
		    break;
 		   case "Manoj":
                          	   System.out.println("Name: Dhanvanth,\n Dep: SP ,\n Degree: B.Sc");
		    break;
		   case "siva":
                          	   System.out.println("Name: Sivasankar,\n Dep: SP ,\n Degree: BSc");
		    break;
		   case "Arun":
		   System.out.println("Name: Antony,\n Dep: SP ,\n Degree: BSc");
		    break;
		   case "sethu":
		  System.out.println("Name: Sethu,\n Dep: SP ,\n Degree: MCA");
		   break;
		default:System.out.println(" no name here");
	}
}}

class Fullstack extends Student13
{
void course()
{
int n;
String[] course = {"1.HTML", "2.CSS", "3.BOOTSTRAP", "4.JAVA", "5.Node", "6. MYSQL"};
// course[] = {""};
//course[0] = "1.HTML";
//course[1] = "2.CSS";
//course[2] = "3.BOOTSTRAP";
//course[3] = "4.JAVA";
//course[4] = "5. MYSQL";
Scanner sc=new Scanner(System.in);
System.out.println("Select One Course: ");
for(int i=0;i<course.length;i++)
{
 System.out.println(course[i]);
}
System.out.println("Enter your choice: ");
n = sc.nextInt();

}
}

class Webdevelopment extends Fullstack
{
void salary()
{
Scanner sc=new Scanner(System.in);
int salary=35000,nod,salarypd;
System.out.println("Enter No of Days:");
nod=sc.nextInt();
if(nod>=10)
{
salarypd=(salary/26)*nod;
System.out.println("Your salary is: " + salarypd);
}
else{
System.out.println("Your not eligble for salary contact office");
}
}
}


	public class Student13
	{
	public static void main(String []args)
	{
	Webdevelopment obj=new Webdevelopment();
	obj.check();
	obj.course();
	obj.salary();
	}	
	
	}