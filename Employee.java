package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		int sal=Integer.parseInt(request.getParameter("sal"));
	String grade=request.getParameter("grade");
	double tax=(25*sal)/100;
	double netsal=0.0;
	double  bonus=0.0;
	if(sal>=100000 && grade.equals("A"))
{
	 bonus=(5*10)/100.0;
	pw.println("The Bonus is"+bonus);
	 netsal=sal+bonus-tax;
	pw.println("NetSalary :"+netsal);
}
else if(sal>=50000 && sal<=100000 && grade.equals("B"))
{
	 bonus=(7*10)/100.0;
	pw.println("The Bonus is"+bonus);
	 netsal=sal+bonus-tax;
	pw.println("NetSalary :"+netsal);
}                                                      
else if(sal<=50000 && grade.equals("C"))
{
	 bonus=(20*10)/100.0;
	pw.println("The Bonus is"+bonus);
	 netsal=sal+bonus-tax;
	pw.println("NetSalary :"+netsal);
}
	

			
	pw.println("Tax : "+tax);
	String s1="<table border=1>"
	+"<tr><th>Name</th>"
	+"<th>Salary</th>"
	+"<th>Grade</th>"
	+"<th>Bonus</th>"
	+"<th>Tax</th>"
	+"<th>NetSalary</th></tr>"
	+"</table";
	
	String s2="<tr>" +
	"<td>"+name+"</td>" +
	"<td>"+sal+"</td>" +
	"<td>"+grade+"</td>" +
	"<td>"+bonus+"</td>" +
	"<td>"+tax+"</td>" +
	"<td>"+netsal+"</td>" +
	"</tr>";
	pw.println(s1+s2);
	
			
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
