class num1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}
class num2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=15;i<=20;i++)
			System.out.println(i);
	}
}
public class mainthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
num1 n=new num1();
num2 m=new num2();
n.setName("Mythread1");
//m.setPriority(Thread.MIN_PRIORITY);
n.start();
//m.setPriority(Thread.MAX_PRIORITY);

//System.out.println(Thread.currentThread().getName());
m.setName("Mythread2");

m.start();
	}

}
