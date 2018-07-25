import java.util.*;
public class linledlist 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add("saran");
		ll.add("padhu");
		ll.add("madhu");  
		ll.add("priyanka");
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	ListIterator lt=ll.listIterator();
	while(it.hasNext())
	{
		System.out.println("Forward"+lt.next());
		
	}
	while(lt.hasPrevious())
	{
		System.out.println("Reverse"+lt.previous());
	}
		
	}

}
