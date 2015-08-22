package Controller.FrontEnd.News;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.BackEndDAO.NewsDAO;

public class countView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(request.getParameter("newid"));
		new NewsDAO().countView(Integer.parseInt(request.getParameter("newid")),1);
	}

}
