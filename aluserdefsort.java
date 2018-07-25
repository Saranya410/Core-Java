import java.util.*;
class car1 implements Comparable
{

	String name;
	double price;

public car1(String name,double price) {
	super();
	this.name=name;
	this.price=price;
	// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+""+this.price;
}
public int compareTo(Object o)
{
	car1 c=(car1)o;
	int ret_val=0;
	if(this.price==c.price)
		ret_val=0;
	else if(this.price<c.price)
		ret_val=-1;
	else if(this.price>c.price)
		ret_val=1;
	return ret_val;
}
}

public class aluserdefsort {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		car1 c1=new car1("aaa",1023.45);
		car1 c2=new car1("ddd",923.45);
		al.add(c1);
		al.add(c2);
		System.out.println(al);
		Collections.sort(al);
		  System.out.println("after sort"+al);
	}

}


