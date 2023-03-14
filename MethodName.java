import java.util.*;
class MethodName
{
	int method1(){
	int i=1;
	while(i<=5)
 	{
	i++;
	
      }
     return i;
	}
    
	float method2(){
	float a=100,b=22;
	float c1=a/b;
	return c1;
	}
	
	char method3(){
	char c2='d';
	return c2;
	}
	
	String method4(){
	String ch="10";
	String x="20";
	String y=x.concat(ch);
	return y;
	}
public static void main(String args[]){
	MethodName obj= new MethodName();
	System.out.println(obj.method1());
	System.out.println(obj.method2());
	System.out.println(obj.method3());
	System.out.println(obj.method4());
}
}



	
	
	