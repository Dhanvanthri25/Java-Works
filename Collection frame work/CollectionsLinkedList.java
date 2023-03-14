import java.util.*;
public class CollectionsLinkedList
{
public static void main(String args[])
{

LinkedList<String> linkList = new LinkedList<>();  //main syntex for linked list
linkList.add("Apple");
linkList.add("Orange");

linkList.add(0,"Mango");

System.out.println("LinkedList elements: ");

Iterator<String> it = linkList.iterator();


while(it.hasNext()){
System.out.println(it.next());
}
}
}