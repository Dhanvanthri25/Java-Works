import java.util.*;
public class CollectionHashSet
{
	public static void main(String args[])
	{
		HashSet<Integer> set1 = new HashSet<>();
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