
public class Mobile {
	String brandname;
	double price;
	String color;
	int resolution;
	public void makeAcall()
	{
	
	}
	public void ReceiveAcall()
	{
	
	}
	public void SendAtext()
	{
	
	}
	public void ReceiveAtext()
	{
	
	}


	public void SwitchOn()
	{
	
	}

	public void SwitchOff()
	{
	
	}
	public double discount()
	{
		double discount=0.1;
		if(this.brandname.equals("samsung"))
		 discount=this.price*0.1;
		else if(this.brandname.equals("MI")) 
			 discount=this.price*0.5;
		return discount;
		
}

	
}
