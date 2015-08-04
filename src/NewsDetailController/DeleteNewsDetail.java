package NewsDetailController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.NewsDetailDAO;

public class DeleteNewsDetail implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int newsDetailId = 0;
		if(new NewsDetailDAO().delete(newsDetailId)){
			response.getWriter().write("News Has been Deleted"); /* Delete Successful */
		}
		else{
			response.getWriter().write("Delete Unsuccessful"); /* Delete Unsuccessful */
		}
		return null;
	}
}
