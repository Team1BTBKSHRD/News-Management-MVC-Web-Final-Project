package Controller.Filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.getRequestDispatcher("/Login/page_login.jsp").forward(request, response);
		response.sendRedirect("/articleManagement/Login/page_login.jsp");
		System.out.println("Login Process");
	}
}//End of class;













