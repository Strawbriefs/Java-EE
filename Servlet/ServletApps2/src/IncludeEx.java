

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeEx
 */
@WebServlet("/IncludeEx")
public class IncludeEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor='linen'>");
		out.println("<h3><center>Welcome to My Login Page</center></h3>");
		//requestdispatcher object is used to dispatch the request from current servlet application other files.
		RequestDispatcher object=request.getRequestDispatcher("Login.html");
		//it includes the external file into current servlet page
		object.include(request, response);
		out.println("</h4?<font color='red'>Thank you for visit my site..</font></h4>");
	
	}

}
