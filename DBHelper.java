package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBHelper {
 public ArrayList getAllPassengers(String dest)
{
	 ArrayList al=new ArrayList();
	 try
	 {
		 
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	 PreparedStatement ps=con.prepareStatement("SELECT * FROM PASSENGERS WHERE DESTINATION=?");
	 ps.setString(1,dest);
	 ResultSet rs=ps.executeQuery();

	 while(rs.next())
	 {
		 String fn=rs.getString(1);
		 String ln=rs.getString(2);
		 String s=rs.getString(3);
		 String d=rs.getString(4);
		 String g=rs.getString(5);
		 PassengerValueObj pvo=new PassengerValueObj();	
		 pvo.setFname(fn);
		 pvo.setLname(ln);
		 pvo.setSource(s);
		 pvo.setDestination(d);
	     pvo.setGender(g);
	     al.add(pvo);
		 
	 }
	 rs.close();
	 ps.close();
	 con.close();
 }
 catch(ClassNotFoundException ce)
	 {
	 
	 System.out.println("Class not found");
	 }
	 catch(SQLException se)
	 {
		 System.out.println("SQL Exception");
	 }
	return al;
 }
}
