import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/Lab5")
public class Lab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab5() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String s1 = "Hello Guys";
		if (s1.length() == 5) {
			pw.println("String Is Equal To 5");
		}
		else{
			response.sendError(404, "String Is  Greathe Than 5");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}