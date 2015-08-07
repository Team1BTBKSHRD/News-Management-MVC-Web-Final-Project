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
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		/* categoryList stores records of news as JSON data */
		String categoryList = Convertor.convertResultSetIntoJSON(new CategoryDAO().retrieveRS()).toString(); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(categoryList);
		System.out.println(categoryList);
	}

}
