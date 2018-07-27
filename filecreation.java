import java.io.*;
public class filecreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Nexwave\\Downloads\\newfile.txt");
boolean created=f.createNewFile();
if(created==true)
	System.out.println("success");
else
	System.out.println("fail");

	}

}
