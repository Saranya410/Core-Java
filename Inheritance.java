class Mobile1
{
	public void switchOff() {
		System.out.println("PrntClas");
	}
	public void makeAcall() {
		
	}
}

class SmartPhone extends Mobile1
{
	public void browse()
	{
		 System.out.println("readclass");
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone sp=new SmartPhone();
sp.switchOff();
sp.browse();
	}

}