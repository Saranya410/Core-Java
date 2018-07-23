 abstract class person1
{
	public abstract boolean whatdoyoudo();
	public  boolean doyouspeak()
	{
		System.out.println("all speak");
	
	return true;
	}
}
 class trainer1 extends person1
{
	@Override

	public  boolean whatdoyoudo()
	{
	System.out.println("deliver lecture");
	return true;
	}
}
 class doctor extends person1
{
	@Override
	
	public  boolean whatdoyoudo()
	{
	System.out.println("cures");
	return true;
	}
}
 class pilot extends person1
{
	@Override
	public  boolean whatdoyoudo()
	{
	System.out.println("rides");
	return true;
	}
}




public class abstractsample {

	public static void main(String args[])
	{
	
		trainer1 t1=new trainer1();
		t1.doyouspeak();
		t1.whatdoyoudo();
		doctor d=new doctor();
		d.doyouspeak();
		d.whatdoyoudo();
		pilot p=new pilot();
		p.doyouspeak();
		p.whatdoyoudo();
		
		}
}
