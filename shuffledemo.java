import java.util.ArrayList;
import java.util.Collections;

public class shuffledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);  
		System.out.println("before shuffle"+al);
		Collections.shuffle(al);//shuffle
		System.out.println("after shuffle"+al);
		System.out.println("max value "+Collections.max(al));//max value
		System.out.println("min value"+Collections.min(al));//min value
		Collections.replaceAll(al,2,10);//replaceall
		System.out.println("Replaced value"+al);
		Collections.reverse(al);//reverse
		System.out.println("Reverse"+al);
		Collections.rotate(al, 2);//rotate
	System.out.println("rotate"+al);
	Collections.swap(al, 0, 1);//swap
	System.out.println("Swap"+al);
	}

}
