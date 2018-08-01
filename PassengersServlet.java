package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassengersServlet
 */
@WebServlet("/PassengersServlet")
public class PassengersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String dest=request.getParameter("dest");
		DBHelper dbh=new DBHelper();
	   ArrayList passengersList=dbh.getAllPassengers(dest);
	   String str="<table border=1>" +
	              "<tr>" +
			   "<th>FirstName</th>" +
			   "<th>              LastName</th>" +
			   "<th>Source</th>" +
			   "<th>Destination</th>" +
			   "<th>Gender</th>" +
			   "</tr>";
			   //"</table>";
	   pw.println(str);
	              
	   for(int i=0;i<passengersList.size();i++)
	   {
		   PassengerValueObj pvo=(PassengerValueObj)passengersList.get(i);
		   String str2="<tr>" +
		   "<td>" +pvo.getFname() + "</td>" +
		   "<td>" +pvo.getLname() + "</td>"+
		   "<td>" +pvo.getSource() + "</td>" +
		   "<td>" +pvo.getDestination() + "</td>" +
		   "<td>" +pvo.getGender() + "</td>" +
		   "</tr>";
		   pw.println(str2);
		   
		   
		   
	   }
	                                
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
