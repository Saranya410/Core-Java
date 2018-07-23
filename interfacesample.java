 interface TVRemote1
{
	public void switchoff();
	public void switchon();
}
class sony1 implements TVRemote1
{

public void switchon()
{
	System.out.println("TV switch on");
}
public void switchoff() 
{
	System.out.println("TV switch off");
}
}

public interface interfacesample 
{
	public static void main(String args[])
	{
		sony1 s=new sony1();
		s.switchoff();
		s.switchon();
	}

}