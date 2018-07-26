import java.util.*;
public class ListCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list1=new ArrayList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.add(50);
list1.add(25);
ArrayList list2=new ArrayList();
list2.add(5);
list2.add(15);
list2.add(25);
list2.add(35);
list2.add(45);
Collections.copy(list1, list2);
System.out.println(list1);

	}
}
