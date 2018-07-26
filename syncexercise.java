class restaurant
{
	public synchronized void takelunch(String name)
	{
	
		System.out.println("Person can take lunch is :  ");
		System.out.println(name);
		
	}
}
class lunchthread extends Thread
{
	String name;
	restaurant r;
	public lunchthread(String name,restaurant r)
	{
		this.name=name;
		this.r=r;
	}
	public void run()
	{
		r.takelunch(this.name);
		
	}
}
public class syncexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
restaurant r1=new restaurant();
lunchthread lt1=new lunchthread("ABC",r1);
lunchthread lt2=new lunchthread("BBB",r1);
lt1.start();
lt2.start();

	}

}
