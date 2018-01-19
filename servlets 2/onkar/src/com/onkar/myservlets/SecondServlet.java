package com.onkar.myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onkar.dao.ConnectionDB;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	ConnectionDB connection;
	
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(){
    	connection = new ConnectionDB();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String age = request.getParameter("userage");
		//String user= request.getParameter("name"); //Using URL rewriting
		String user=(String)request.getSession().getAttribute("usersession");//Using Sessions
		
		connection.insert(user, Integer.parseInt(age.trim()));
		//Using Cookies
		/*Cookie a[] = request.getCookies();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].getName().equals("user"))
				user=a[i].getValue();
		}
		*/
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Mr/Ms "+user+" is "+age+" inserted</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
