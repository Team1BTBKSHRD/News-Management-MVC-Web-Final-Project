package Controller.FrontEnd.News;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.BackEnd.Action;
import Model.BackEndDAO.NewsDAO;
import Utilities.Convertor;

public class ListNewsByCategoryCode implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String categoryCode = request.getParameter("c");
		String newsList = Convertor.convertResultSetIntoJSON(new NewsDAO().listNewsByCategoryCode(categoryCode)).toString();
		System.out.println(newsList);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(newsList);
	}

}
