/**
 * 
 */
package UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
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
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String obj= new Gson().toJson(new Convertor().convertResultSetIntoJSON(new UserDAO().retrieveRS()));
		
		response.getWriter().write(obj);		
		return null;
	}

}
