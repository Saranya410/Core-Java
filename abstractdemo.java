abstract class person

{
	public boolean doeshebreathe()
	{
		System.out.println("all breathe");
		return true;
	}

public boolean doeshesleep()
{
	System.out.println("all sleeps");
	return true;
}
public abstract boolean doeshedrivecar();
}
abstract class employee6 extends person
{
	public abstract boolean doeshedrivecar();
}
class driver1 extends employee6
{

	@Override
	public boolean doeshedrivecar()
	{
		System.out.println("every driver has a car");
		return true;
}
}
public class abstractdemo {
 public static void main(String[] args)
 {
	 driver1 d=new driver1();
	 System.out.println("breathing? "+d.doeshebreathe());
	 System.out.println("Sleeping?"+d.doeshesleep());
	 System.out.println("driving?"+d.doeshedrivecar());
 }
}
