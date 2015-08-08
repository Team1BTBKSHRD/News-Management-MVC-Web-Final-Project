package Filter;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
public class Login extends HttpServlet {

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
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("Login Process." + "User Name:"+userName + "Pas:"+ password);
		if(userName.equals("admin") && password.equals("123")){
			System.out.println("Admin");
			HttpSession session = request.getSession();
			session.setAttribute("admin", "Sambo");
			System.out.println("Session = "+session.getAttribute("admin"));
			response.sendRedirect("/articleManagement/Admin/index.jsp");
		}
		else if(userName.equals("editor") && password.equals("123")){
			System.out.println("Editor");
			HttpSession session = request.getSession();
			session.setAttribute("editor", userName);
			//response.sendRedirect("/editor/editor.html");
		}
		else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}//End of class;













