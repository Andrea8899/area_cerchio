package area_cerchio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAreaCerchio
 */
@WebServlet("/ServletAreaCerchio")
public class ServletAreaCerchio extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletAreaCerchio() {
        super(); }
    public void init(ServletConfig config) throws ServletException { 
    	super.init(config); 
    	String initial = config.getInitParameter("initial"); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("area") );
		out.println(request);
		System.out.println(request);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
