class num01 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}
class num02 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=15;i<=20;i++)
			System.out.println(i);
	}
}
public class threadrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t1=new Thread(new num01());

Thread t2=new Thread(new num02());
//t1.setName("Mythread1");
//t1.setPriority(Thread.MIN_PRIORITY);
t1.start();
//t2.setPriority(Thread.MAX_PRIORITY);

//System.out.println(Thread.currentThread().getName());
//t1.setName("Mythread2");

t2.start();
   
	}

}
