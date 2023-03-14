import java.util.*;
class CollectionsVectorList
{
public static void main(String args[])
{
Vector<String> v = new Vector<>();   //main syntax for collectionVectors
v.add("Cricket");
v.add("Hockey");
v.add(0,"Basketball");
v.remove("football");
System.out.println("Vector Elements: ");
Iterator<String> it = v.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}




                                                                                                                  