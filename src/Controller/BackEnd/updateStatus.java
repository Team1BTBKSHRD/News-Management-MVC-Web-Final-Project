package Controller.BackEnd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BackEndDAO.NewsDAO;

public class updateStatus implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int news_id= Integer.parseInt(request.getParameter("news_id"));
		boolean news_status=Boolean.parseBoolean(request.getParameter("news_status"));
		new NewsDAO().updateNewstatus(news_id,news_status);
		/*String countList=Convertor.convertResultSetIntoJSON(new NewsDAO().articlepost(fullname)).toString();*/
		/*response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(countList);*/

	}

}
