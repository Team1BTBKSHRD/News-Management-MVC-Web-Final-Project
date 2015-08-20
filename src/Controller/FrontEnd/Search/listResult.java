package Controller.FrontEnd.Search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.NewsDAO;
import Utilities.Convertor;

public class listResult implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("listResult");
		String title = request.getParameter("title");
		String timeCode = request.getParameter("timeCode");
		String categoryCode = request.getParameter("categoryCode");
		String newsCode = request.getParameter("newsCode");
		int page = Integer.parseInt(request.getParameter("pageCode"));
		
		System.out.println(page);
		
		String droplistsource = Convertor.convertResultSetIntoJSON(new NewsDAO().searchNewsFilterTime(title,timeCode,categoryCode,newsCode, 15, page)).toString(); 
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(droplistsource);		
	}
}
