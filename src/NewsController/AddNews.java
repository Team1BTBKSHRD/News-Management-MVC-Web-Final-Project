package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.NewsDAO;
import ModelDTO.News;

/**
 * Class AddNews
 * Use for Add news data from user request to DBMS
 * Implement Interface Action 
 */
public class AddNews implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int newsId = 1000;
		String catCode = "";
		String userInfoCode = "";
		String newsTittle = "";
		String newsDesc = "";
		String newsPath = "";
		String newsImg = "";
		String newsDate = "";
		NewsDAO dao = new NewsDAO(); /* Instantiate DAO object */

		if(dao.insert(new News(newsId, catCode, userInfoCode, 
				newsTittle, newsDesc, newsPath, newsImg, newsDate))){
			response.getWriter().write("News Added"); /* Add Successful */
		}
		else{
			response.getWriter().write("New Add Unsuccessfuly"); /* Add Unsuccessful */
		}
		
		return null;
	}

}//End of class;
