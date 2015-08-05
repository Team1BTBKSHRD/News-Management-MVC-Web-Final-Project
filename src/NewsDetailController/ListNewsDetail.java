package NewsDetailController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModelDAO.NewsDetailDAO;
import Utilities.Convertor;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;

public class ListNewsDetail implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		/* newsList stores records of news as JSON data */
		String newsList = new Gson().toJson(Convertor.convertResultSetIntoJSON(new NewsDetailDAO().retrieveRS())); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		/* Response JSON data to client */
		response.getWriter().write(newsList);
		return null;
	}
}