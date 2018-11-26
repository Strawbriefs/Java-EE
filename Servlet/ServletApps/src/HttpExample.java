

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpExample
 */
@WebServlet("/HttpExample")
public class HttpExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter obj=response.getWriter();
		obj.println("<body bgcolor='lightgreen'>");
		obj.println("<h3><center><u>Welcome to ASR</u></center></h3>");
		obj.println("<h5><font color='red'>Welcome to Web Portal</font></h5>");
		obj.println(request.getContextPath());
		obj.println(request.getRemoteAddr());
		obj.println(request.getServerPort());
		
	}

}
