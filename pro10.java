import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab10")
public class Lab10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab10() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession hs = request.getSession();
		hs.setAttribute("Vishal", "session11");
		
		if (hs != null) {
			pw.println("Welcome back");
		}
		else {
			pw.println("Welcome");
		}	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}