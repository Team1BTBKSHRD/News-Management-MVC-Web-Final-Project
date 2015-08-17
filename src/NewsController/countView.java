package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import ModelDAO.NewsDAO;
import Utilities.Convertor;

public class countView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		new NewsDAO().countView(Integer.parseInt(request.getParameter("newid")),1);
	}

}
