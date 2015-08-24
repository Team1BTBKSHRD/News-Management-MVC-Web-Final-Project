package Controller.FrontEnd.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.NewsDAO;

public class countView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(request.getParameter("newid"));
		new NewsDAO().countView(Integer.parseInt(request.getParameter("newid")),1);
	}

}
