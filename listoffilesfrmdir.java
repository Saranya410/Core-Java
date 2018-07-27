import java.io.*;
public class listoffilesfrmdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Program Files");
		String[] files=f.list();
		for(int i=0;i<files.length;i++)
		{
			System.out.println("ALL FILES : "+files[i]);
		}
		
	}

}
