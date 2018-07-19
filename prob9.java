
public class prob9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m1sale=15000;
		int m1item=100;
		int m2item=115;
		double m2sale=m2item*75;
		if(m1sale>m2sale)
		{
			System.out.println("m1 is higher");
		}
		else
		{
			System.out.println("m2 is higher");
		}
		
		System.out.println("m2sale"+m2sale);
		double remaining=(m1sale-m2sale)/75;
		System.out.println("required"+remaining);
		

	}
    
}
