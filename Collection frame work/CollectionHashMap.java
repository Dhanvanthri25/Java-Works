import java.util.*;
public class CollectionHashMap  //hashmap uses put,post
{
public static void main(String args[])
{
	HashMap<Integer,String> hmap = new HashMap<>();  //Map uses both int,string
	

	hmap.put(07,"Anand");
	hmap.put(12,"Siva");
	hmap.put(23,"Ajai");
	hmap.put(56,"Dharshan");
	hmap.put(03,"Naveen");


	Set set = hmap.entrySet();
	Iterator iterator = set.iterator();
	
	while(iterator.hasNext()) {
		Map.Entry m = (Map.Entry)iterator.next();
		System.out.print("key is:" + m.getKey() + " & Value is: ");
		System.out.println(m.getValue());
		}
}
}



	
