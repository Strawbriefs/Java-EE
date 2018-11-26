

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginProcess
 */
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		if(uid.equals("admin"))
		{
			response.sendRedirect("AdminPage");
		}
		else if(uid.equals("student"))
		{
			response.sendRedirect("StudentPage");
		}	else
		{
			RequestDispatcher object=request.getRequestDispatcher("Login.html");	
			object.include(request, response);
			out.println("<font color='red'>Invalid UID or PWD..</font>");
		}
		}
	}


