import java.io.*;
import java.sql.*;
public class exceriseofpreparestmt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	InputStreamReader isr=new 	InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(isr);
	System.out.println("Enter your name1:");
	String name1=b.readLine();
	System.out.println("Enter your name2:");
	String name2=b.readLine();
//	System.out.println("Enter your name3:");
//	String name3=b.readLine();
//	System.out.println("Enter your name4:");
//	String name4=b.readLine();
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	//Statement stmt=con.createStatement();
	String sql="delete emp141 where trim(empname)=? or trim(empname)=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1,name1);
	ps.setString(2, name2);
	ps.addBatch();
//	ps.setString(4,name3); 
//	ps.setString(5, name4);
//	ps.addBatch();
	//ps.executeBatch();
	
	int[] ra=ps.executeBatch();
	if (ra.length>0) {
		System.out.println("success");
	System.out.println("DELETED"+ra);   
	}
	else
		System.out.println("not inserted");
	}
	catch(ClassNotFoundException ce)
	{
		System.out.println("Driver class not found"+ce.getMessage());
	}
	catch(SQLException se)
	{
		System.out.println("SQL Exception"+se.getMessage());

}
	}

}
