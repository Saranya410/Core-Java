
public class Band {

	String bandName;
	String singers[];
	String guitarists[];

public void setBandDetails(String bandName,String[] singers, String[] guitarists)
{
	this.bandName=bandName;
	this.singers=singers;
	this.guitarists=guitarists;
}
public void printBandDetails()
{
	System.out.println(bandName);
	for(int i=0;i<singers.length;i++)
	{
		System.out.println(singers[i]);
	}
	for(int i=0;i<guitarists.length;i++)
	{
		System.out.println(guitarists[i]);
	}

}
}
/*public int countMembers()
{
	return 2+singers.length+guitarists.length;
}
b1.countMembers();
b2.countMembers(;)
}*/
