package CategoryController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import Utilities.Convertor;

public class ListCategory implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		/* categoryList stores records of news as JSON data */
		String categoryList = new Gson().toJson(Convertor.convertResultSetIntoJSON(new CategoryDAO().retrieveRS())); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(categoryList);
		return null;
	}

}
