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
		//System.out.println(12111);
		/* newsList stores records of news as JSON data */
		String user_info_code=new UserInfoDAO().returnUserInfoCode(request.getParameter("full_name")) ;
		//System.out.println(user_info_code);
		//String newsList =new Convertor.convertResultSetIntoJSON(new NewsDAO().retrieveRS(user_info_code)).toString();
		String newsList=new Convertor().convertResultSetIntoJSON(new NewsDAO().retrieveRS(user_info_code)).toString();
		System.out.println(newsList);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(newsList);
		
	}

}//End of class;









