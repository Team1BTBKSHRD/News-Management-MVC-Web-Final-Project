package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ModelDAO.NewsDAO;
import ModelDAO.UserInfoDAO;
import Utilities.Convertor;
import Controller.Action;
import Controller.ActionForward;

public class ListNews implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String code=new UserInfoDAO().returnUserInfoCode(request.getParameter("full_name"));
		String newsList=Convertor.convertResultSetIntoJSON(new NewsDAO().retrieveRS(code)).toString();
		System.out.println(newsList);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(newsList);
		
	}

}//End of class;









