package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import ModelDAO.NewsDAO;
import ModelDAO.UserInfoDAO;
import Utilities.Convertor;

public class countNews implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String countList=new Convertor().convertResultSetIntoJSON(new NewsDAO().countOfRecords()).toString();
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(countList);
	}

}
