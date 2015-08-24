package Controller.FrontEnd.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.NewsDAO;

public class countView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		NewsDAO dao = new NewsDAO();
		dao.countView(Integer.parseInt(request.getParameter("newid")),1);
		dao.close();
	}

}
