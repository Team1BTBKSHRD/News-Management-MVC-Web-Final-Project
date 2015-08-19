package Controller.FrontEnd.News;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.BackEnd.Action;
import Model.BackEndDAO.NewsDAO;
import Model.DTO.News;

/**
 * Class AddNews
 * Use for Add news data from user request to DBMS
 * Implement Interface Action 
 */
public class AddNews implements Action{

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		/* Get data from client request */
		String catCode = request.getParameter("cat_name");
		String userInfoCode = request.getParameter("user_info_code");
		String newsTittle = request.getParameter("news_title");
		String newsDesc = request.getParameter("news_desc");
		String newsPath = request.getParameter("news_path");
		String newsImg = request.getParameter("news_img");
		
		String newsDate = new SimpleDateFormat().format(new Date());
		
		String newsConDetail = request.getParameter("news_con_detail");
		/* Add News Controller */
		NewsDAO dao = new NewsDAO();
		if(dao.insert(new News(0, catCode, userInfoCode,newsTittle, newsDesc, newsPath, newsImg, newsDate), newsConDetail)){
			response.getWriter().write("News Added");  //Add Successful 
		}
		else{
			response.getWriter().write("New Add Unsuccessfuly");  //Add Unsuccessful 
		}
		
		
	}

}//End of class;
