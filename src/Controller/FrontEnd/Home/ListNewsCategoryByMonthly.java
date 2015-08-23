package Controller.FrontEnd.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.NewsDAO;
import Utilities.Convertor;

public class ListNewsCategoryByMonthly implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String categoryCode = request.getParameter("c_code");
		int limit = Integer.parseInt(request.getParameter("limit"));
		String newsList=Convertor.convertResultSetIntoJSON(new NewsDAO().listNewsCategoryByMonthly(categoryCode, limit, 0)).toString();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(newsList);
		
	}

}
