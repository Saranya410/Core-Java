
public class wrapperdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="saran 410 !";
char carr[]=s.toCharArray();
for(int i=0;i<carr.length;i++)
{
	char x=carr[i];
	if(Character.isDigit(x))
		System.out.println(x+"is a digit");
	else if(Character.isLetter(x))
		System.out.println(x+"is a letter");
	else if (Character.isWhitespace(x))
		System.out.println("blankspace");
	else
		System.out.println(x+"is a spcl character");



	}

}
}