
public class Netsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal=15000.00;
		double tax=sal*(10.0/100);
		double alwnc=sal*15/100;
		double netsal=(sal+alwnc)-tax;
		System.out.println("Net salary:"+netsal);
		System.out.println("Tax:"+tax);
		System.out.println("allowance:"+alwnc);
	

	}

}
