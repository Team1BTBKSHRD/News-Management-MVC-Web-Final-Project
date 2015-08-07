package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ModelDAO.NewsDAO;

import Utilities.Convertor;
import Controller.Action;
import Controller.ActionForward;

public class ListNews implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		/* newsList stores records of news as JSON data */
		String newsList = Convertor.convertResultSetIntoJSON(new NewsDAO().retrieveRS()).toString(); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(newsList);
		
	}

}//End of class;









