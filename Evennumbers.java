import java.util.*;
class Evennumbers{
	public static void main(String[] args){
	int x[]=new int[100];
	for(int i=0;i<100;i++)
	{
	x[i]=i+2;
	if(x[i]%2==0)
	System.out.println(x[i]);
	}
}
}