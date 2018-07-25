import java.util.*;
class phone
{
	String name;
	int price;
	public phone(String name,int price) {
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
	}  
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub 
		phone p=(phone)obj;
		if(this.name.equals(p.name) && this.price==p.price)
		return true;
		else
			return false;
	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.price*5;
	}
	
	
}
public class setuserdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p1=new phone("xxx",123);
		phone p2=new phone("xxx",123);
		phone p3=new phone("xxx",1234);
		HashSet hs=new HashSet();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		System.out.println(hs);
	}

}
