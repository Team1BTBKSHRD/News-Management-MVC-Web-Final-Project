package Controller.Filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.BackEndDAO.UserDAO;

//@WebServlet("/Login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType;
		try {
			userType = new UserDAO().userLogin(userName, password);
			if(userType != null){
				HttpSession session = request.getSession();
				session.setAttribute("admin", userName);
				session.setAttribute("userType", userType);
				response.sendRedirect("/articleManagement/Admin/index.jsp");
			}
			
			else{
				//request.getRequestDispatcher("/Login/page_login.jsp").forward(request, response);
				response.sendRedirect("/articleManagement/Login/page_login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//End of class;













