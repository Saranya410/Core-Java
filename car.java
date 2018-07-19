
public class car {
String carname;
double milage;
double price;
boolean luxurytype;

public void setcardetails(String carname,double milage,double price,boolean luxuryType) 
{
	this.carname=carname;
	this.milage=milage;
	this.price=price;
	this.luxurytype=true;
}  
public void printcardetails()
{
	System.out.println(carname);
	System.out.println(milage);
	System.out.println(price);
	System.out.println(luxurytype);
 
}
}