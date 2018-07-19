
public class employee1 {
	private int empid;
	private String empbname;
	private double sal;
	private static String CompanyName="Deloitte";
	
 public static String getCompanyName() {
	 return CompanyName;
 }
 
 
	
	public employee1(int empid, String empbname, double sal) {
		this.empid = empid;
		this.empbname = empbname;
		this.sal = sal;
	}



	public employee1() {
		super();
		
		this.empid =28;
		this.empbname = "yyy";
		this.sal = 4500.0;
		System.out.println("default const");
		
	}



	public double calbonus()
	{
		double bonus=0.0;
		if(this.sal<=5000)
			bonus=this.sal*0.2;
		else
			bonus=this.sal*0.1;
		return bonus;
	}

}
