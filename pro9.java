import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab9")
public class Lab9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab9() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String un = request.getParameter("un");
		Cookie ck = new Cookie("vish",un);
		ck.setMaxAge(0);
		response.addCookie(ck);

		if(ck != null) {
			pw.println("Welcome Back "+ck.getValue());
			
		}
		else {
			pw.println("Welcome "+ck.getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}