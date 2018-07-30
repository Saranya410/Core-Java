import java.io.*;
import java.sql.*;
public class exercisetransaction {

	public static void main(String[] args) throws IOException 
	
{
		
	
		// TODO Auto-generated method stub
		InputStreamReader isr=new 	InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(isr);
		System.out.println("Enter your name:");
		String name=b.readLine();
		System.out.println("Enter your date:");
		String curr_date=b.readLine();
		System.out.println("Enter your no. of steps");
        int steps=Integer.parseInt(b.readLine());
	
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		//Statement stmt=con.createStatement();
		con.setAutoCommit(false);
	    PreparedStatement ps1=con.prepareStatement("insert into dailysteps1 values(?,?,?)");
		ps1.setString(1,name);
		ps1.setDate(2,Date.valueOf(curr_date)); 
		ps1.setInt(3, steps);
		int ra1=ps1.executeUpdate();
		System.out.println("what is ra1 "+ra1);
	
		PreparedStatement ps2=con.prepareStatement("update totalsteps1 set steps=steps+? where name=?");
		
		ps2.setInt(1,steps);
		ps2.setString(2,name);
		
		int ra2=ps2.executeUpdate();
		System.out.println("What is ra2 "+ra2);
	    System.out.println(ra1);
		System.out.println(ra2);
		if (ra1>0 && ra2>0) 
			
		{
			System.out.println("success");
			con.commit();
		}
		else
		{
			System.out.println("not inserted");
			con.rollback();
		}
		ps2.close();
		ps1.close();
		con.close();
		
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
