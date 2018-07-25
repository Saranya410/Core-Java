import java.util.*;
public class enumal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.add(1);
v.add(2);
v.add(3);
v.add(4);
ArrayList al=new ArrayList();
Enumeration e=v.elements();
al=Collections.list(e);
System.out.println(al);
	}

}
