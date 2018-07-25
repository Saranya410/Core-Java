import java.util.*;                                                                                              
import java.util.Iterator;

public class hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap hm=new LinkedHashMap();
hm.put("3","saran");
hm.put("1","subhi");
hm.put("2;","anu");
System.out.println(hm);
System.out.println(hm.get("2"));
Set keys=hm.keySet();
Iterator it=keys.iterator();
while(it.hasNext())
{
	String key=(String)it.next();
	System.out.println(hm.get(key));
}
}

}
