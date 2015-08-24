package Controller.FrontEnd.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.NewsDAO;
import Utilities.Convertor;

public class ListNewsCategoryByWeekly implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String categoryCode = request.getParameter("c_code");
		int limit = Integer.parseInt(request.getParameter("limit"));
		NewsDAO dao = new NewsDAO();
		String newsList=Convertor.convertResultSetIntoJSON(dao.listNewsCategoryByWeekly(categoryCode, limit, 0)).toString();
		dao.close();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(newsList);
		
	}

}
