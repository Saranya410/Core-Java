class numthread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
			System.out.println(i);
			
	}
}
class alphathread extends Thread
{
public void run()
{
	for(char c='a';c<='e';c++)
		System.out.println(c);
}
	
}
public class mthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		numthread mt=new numthread();
		mt.setName("numthrd");
		mt.start();
		
		alphathread  at=new alphathread();
		at.start();

	}

}
