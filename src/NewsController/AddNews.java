package NewsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import ModelDAO.NewsDAO;
import ModelDAO.UserInfoDAO;
import ModelDTO.News;

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
		int newsId = 0;
		String catCode = new CategoryDAO().returnCateCode(request.getParameter("cat_name"));
		String userInfoCode = new UserInfoDAO().returnUserInfoCode(request.getParameter("user_info_code")) ;
		String newsTittle = request.getParameter("news_title");
		String newsDesc = request.getParameter("news_desc");
		String newsPath = request.getParameter("news_path");
		String newsImg = request.getParameter("news_img");
		String newsDate = request.getParameter("news_date");
		NewsDAO dao = new NewsDAO();  //Instantiate DAO object 
		System.out.println(userInfoCode+"--"+catCode);
		if(dao.insert(new News(newsId, catCode, userInfoCode,newsTittle, newsDesc, newsPath, "", ""))){
			response.getWriter().write("News Added");  //Add Successful 
		}
		else{
			response.getWriter().write("New Add Unsuccessfuly");  //Add Unsuccessful 
		}
		
		
	}

}//End of class;
