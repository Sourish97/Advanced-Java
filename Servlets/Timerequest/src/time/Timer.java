package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Timer
 */
@WebServlet("/Timer")
public class Timer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static Calendar c;
       static int i=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Timer() {
        super();
        c=Calendar.getInstance();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter p=response.getWriter();
		if(i==0)
		{
			p.println("1st Reqeust");
			c=Calendar.getInstance();
			i++;
		}
		else{
			Calendar c2=Calendar.getInstance();
			double d=(c2.getTimeInMillis()-c.getTimeInMillis())/1000.0;
			p.println(d);
			c=c2;
		}
		p.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
