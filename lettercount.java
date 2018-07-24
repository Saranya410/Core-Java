
public class lettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=args[0];
int ct=0;
for(int i=0;i<s.length();i++)
{
	
	if(s.charAt(i)=='C')
	ct++;		
}
System.out.println("frqncy of c"+ct);
	}

}

