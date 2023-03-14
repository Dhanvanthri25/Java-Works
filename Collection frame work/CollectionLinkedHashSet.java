import java.util.*;
public class CollectionLinkedHashSet
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(3);
		set1.remove(2);
		
		Iterator <Integer> set2 = set1.iterator();
		while(set2.hasNext())
		{
		System.out.println(set2.next());
			
}
}
}