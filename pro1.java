import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab1")
public class Lab1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("un");
		String ps = request.getParameter("ps");
		
		if (un.equals(ps) && un != null && ps != null) {
			pw.println("Welcome To Our Website Mr/Miss "+un);
		}
		else {	
			response.sendError(404, "Please Enter Correct Username Or Password");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}