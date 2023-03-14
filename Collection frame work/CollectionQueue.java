import java.util.*;
import java.util.Queue;
public class CollectionQueue
{
	public static void main(String args[])
	{
		Queue<Integer> set1 = new LinkedList<>(); // Queue uses LinkedList replaced as queue
		set1.add(1);
		set1.add(2);
		set1.add(7);
		set1.add(5);
		set1.add(6);
		
		Iterator <Integer> set2 = set1.iterator();
		while(set2.hasNext())
		{
		System.out.println(set2.next());
		}
}
}