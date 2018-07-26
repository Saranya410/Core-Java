import java.util.*;
public class readonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list1=new ArrayList();
		ArrayList list1=new ArrayList();
		list1.add("aaaa");
		list1.add("bbb");
		list1.add("ccc");
		list1.add("dd");
		list1.add("eee");
		list1.add("ff");

		System.out.println("before adding" +list1);
		 List<String>unmodifiableList= Collections.unmodifiableList(list1);
		
		unmodifiableList.add("ggg");
		System.out.println(list1);

	}

}
