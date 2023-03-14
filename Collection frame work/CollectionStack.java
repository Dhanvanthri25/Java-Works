import java.util.*;
public class CollectionStack
{
public static void main(String args[])
{
Stack<String> stack = new Stack<>();


stack.push("Ajai");
stack.push("Siva");
stack.push("Anand");
stack.pop();
stack.push("Santhosh");
stack.push("Naveen");
stack.pop();

System.out.println("Stack elements: ");
for(String str: stack){
System.out.println(str);
}
}
}



