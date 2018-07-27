import java.io.*;
public class fileorfolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Nexwave\\Downloads\\newfile");
		if(f.isDirectory())
		System.out.println("It is a fo;lder");
			else
			System.out.println("It is a file");
		
	}
}

