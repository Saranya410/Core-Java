import java.util.ArrayList;

public class Commonelmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(15);
		list1.add(35);
		list1.add(40);
		list1.add(50);
		list1.add(25);
		ArrayList list2=new ArrayList();
		list2.add(5);
		list2.add(15);
		list2.add(25);
		list2.add(35);
		list2.add(45);
		list1.retainAll(list2);
		System.out.println(list1);
		

	}

}
