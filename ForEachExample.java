import java.util.*;
public class ForEachExample
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Array Limit : ");
	int l = sc.nextInt();
	int a[] = new int[l];
	System.out.println("Enter Array Elements : ");
      for(int i = 0; i<l; i++){
	a[i] = sc.nextInt();
	}
	System.out.println("---------------------------------------------");
	  for(int j:a){	 
	  System.out.println(j);
	 }
      
    }
}

