
public class testmobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m=new Mobile();
m.brandname="MI";
m.color="Ash";
m.price=10000;
m.resolution=12;
System.out.println(m.brandname);
System.out.println(m.color);
double x=m.discount();
System.out.println("discount"+x);
	}

}
