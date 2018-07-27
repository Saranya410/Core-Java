import java.io.*;
public class deletefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Nexwave\\Downloads\\newfile");
		if(f.exists())
		{
			System.out.println("exists");
			boolean b=f.delete();
			if(b)
				System.out.println("deleted");
			else
				System.out.println("it seems deleted by somebody");
			}
		else
		{
			System.out.println("no file");
			boolean b1=f.createNewFile();

			if(b1)
				System.out.println("succes");
			else
				System.out.println("prob cretoing file");}
	}

}
