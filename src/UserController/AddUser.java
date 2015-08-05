package UserController;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import Controller.Logger;
import ModelDAO.UserDAO;
import ModelDTO.User;
import Utilities.Convertor;

public class AddUser implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		User userdto=new User();
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_pass");
		String usertype = request.getParameter("user_type");
		/*String name = "Acer123";
		String password = "121212";
		String usertype = "admin";*/
		userdto.setUser_name(name);
		userdto.setUser_pass(password);
		userdto.setUser_type(usertype);
		if(new UserDAO().insert(userdto)){
			response.getWriter().write("User have been inserted.");
			System.out.println("Yes");
		}else{
			response.getWriter().write("inserted Fail");
		}
		return null;
	}
}
