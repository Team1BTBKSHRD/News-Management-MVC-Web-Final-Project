/**
 * 
 */
package UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import ModelDAO.UserDAO;
import Utilities.Convertor;

/**
 * @author Pisal
 *
 */
public class ListUser implements Action {

	/* (non-Javadoc)
	 * @see Controller.Action#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public  void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/* categoryList stores records of news as JSON data */
	    String userList = Convertor.convertResultSetIntoJSON(new UserDAO().retrieveRS()).toString(); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(userList);
		System.out.println(userList);
	}

}
