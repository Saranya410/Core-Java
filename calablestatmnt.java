import java.sql.*;
public class calablestatmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		String sql="{?=call big1(?,?)}";
		CallableStatement cs=con.prepareCall(sql);
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setInt(2,425);
		cs.setInt(3, 125);
		cs.execute();
//		if(b==true)
//		{
			System.out.println("SUccess");
			System.out.println("biggest number is "+cs.getInt(1));
//		}
		cs.close();
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
