
import java.util.*;
import java.util.ArrayList;

public class alcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(4); 
	    ArrayList dest=new ArrayList();
		dest.add(4);
		dest.add(5);
		dest.add(6);
		dest.add(1319);
		Collections.copy(dest,al);
		System.out.println(dest);
		
	}

}
