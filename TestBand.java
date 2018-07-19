
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1=new Band();
		String[] singers1= {"S1","S2","S3"};
		String[] guitarists1= {"GU1","GU2","GU3"};
		b1.setBandDetails("Hero", singers1, guitarists1);
		b1.printBandDetails();
		Band b2=new Band();
		String[] singers2= {"S11","S22","S33","S44"};
		String[] guitarists2= {"GU11","GU22","GU33","GU44"};
		b2.setBandDetails("Anti-Hero",singers2,guitarists2);
		b2.printBandDetails();

	}

}
