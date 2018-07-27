import java.sql.*;
public class readofdatafrmdb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block                                                                                                                                                                                                               
			System.out.println("Unable to find driver");
			System.out.println(e1.getMessage());
		}
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String username="scott";
String password="tiger";
Connection con=null;
try {
	 con=DriverManager.getConnection(url,username,password);
	System.out.println("connected successfully");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.out.println("could not conect");
	System.out.println(e.getMessage());

	}
Statement stmt=con.createStatement();
ResultSet r=stmt.executeQuery("SELECT * FROM  EMP141");
while(r.next())
{
	String empid=r.getString(1);
	String empname=r.getString(2);
	System.out.println(empid+" "+empname);
}
r.close();
stmt.close();
con.close();
}
}