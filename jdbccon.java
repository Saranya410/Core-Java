import java.sql.*;
public class jdbccon {

	public static void main(String[] args) {
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
try {
	Connection con=DriverManager.getConnection(url,username,password);
	System.out.println("connected successfully");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.out.println("could not conect");
	System.out.println(e.getMessage());
	
}
	}

}
																																