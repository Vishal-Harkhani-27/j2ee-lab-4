import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab4")
public class Lab4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab4() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println(request.getHeader("user-agent")); 
		String h = request.getHeader("user-agent");
		if (h.contains("MSIE")) {
			pw.println("Browser Use Is Internet Explorer");
		}
		else {
			response.sendRedirect("https://www.google.com/");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}