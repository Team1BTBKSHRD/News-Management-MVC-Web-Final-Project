package Controller.Filter;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import Controller.BackEnd.Action;
import Model.BackEndDAO.UserDAO;
import Model.BackEndDAO.UserInfoDAO;
import Utilities.Convertor;

public class MyLogin implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType = null;
		try {
			userType = new UserDAO().userLogin(userName, password);
			if(userType != null){
				HttpSession session = request.getSession();
				session.setAttribute("admin", userName);
				session.setAttribute("userType", userType);
				System.out.println("Send Redirect!");
//				response.sendRedirect("/articleManagement/Admin/index.jsp");
				String userinfo=Convertor.convertResultSetIntoJSON(new UserInfoDAO().returnUserInformation(userName)).toString();
				session.setAttribute("userinfo", userinfo);
				response.getWriter().write("Success");
			}
			
			else{
				//request.getRequestDispatcher("/Login/page_login.jsp").forward(request, response);
				response.sendRedirect("/articleManagement/Login/page_login.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
		System.out.println("UserType: " + userType);
	}

}// End of class;
