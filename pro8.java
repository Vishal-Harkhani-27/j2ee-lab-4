import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab8")
public class Lab8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab8() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		Cookie ck = new Cookie("Vishal", "firstcookie");
		ck.setMaxAge(39000);
		if(ck == null) {
			response.addCookie(ck);
		}
		else {
			pw.println(ck.getName());
			pw.println(ck.getValue());
			pw.println("Have Cookie");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}