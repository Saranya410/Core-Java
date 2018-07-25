import java.util.*;
public class albinarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(4); 
		al.add(34); 
		al.add(344); 
		al.add(34444); 
		
		System.out.println(al);
        System.out.println(" "+Collections.binarySearch(al,34));
		Collections.fill(al,4);
		System.out.println("Modify"+al);
		
	}

}
