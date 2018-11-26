import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<body bgcolor='lightblue'>");
		out.println("<h3><center>Current Time</center></h3>");
		Date date=new Date();
		out.println(date);
		out.println("Hello World");
	}   

}

