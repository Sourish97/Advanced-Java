package Mypass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoPass
 */
@WebServlet("/MyLoPass")
public class MyLoPass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoPass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		RequestDispatcher disp = request.getRequestDispatcher("/html/Login.html");
		String s= "cris";
		if(pass.equals(s))
		{
			writer.println("<html>");
			writer.println("<h1>Hello to "+name+"</h1>");
			writer.println("</html>");
		}
		else
		{
			disp.include(request, response);
			writer.println("Incorrect Username/Password");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
