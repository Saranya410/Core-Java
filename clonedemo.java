class places implements Cloneable
{
	String country;
	long popu;
	public places(String country, long popu) {
		super();
		this.country = country;
		this.popu = popu;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class clonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		places p1=new places("India",54356);
		System.out.println(p1.country);
		System.out.println(p1.popu);
		places p2=null;
        try {
			p2=(places)p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("CLoning not possible");
			e.printStackTrace();
		}
        p1.country="USA";
        System.out.println(p1.country);
        System.out.println(p2.country);

	}

}
