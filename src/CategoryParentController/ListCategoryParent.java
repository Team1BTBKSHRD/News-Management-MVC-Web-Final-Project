package CategoryParentController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryParentDAO;
import Utilities.Convertor;

public class ListCategoryParent implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* categoryList stores records of news as JSON data */
		String categoryParentList = Convertor.convertResultSetIntoJSON(new CategoryParentDAO().retrieveRS()).toString(); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(categoryParentList);
	
	}

}
