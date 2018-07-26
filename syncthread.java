class greeting
{
	public synchronized void sayhi(String name)
	{
		System.out.println("!");
	System.out.println(name);
	}
}
class greetingthread extends Thread
{
	String name;
	greeting g;
	greetingthread(String name,greeting g)
	{
		this.name=name;
		this.g=g;
	}
	public void run()
	{
		g.sayhi(this.name);
		
	}
}
public class syncthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting g1=new greeting();
	greetingthread gt1=new greetingthread("Stylish Tamzilachi Padhu",g1);
	greetingthread gt2=new greetingthread("abc",g1);
	gt1.start();
	gt2.start();
	

	}

}
