package Controller;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CategoryController.AddCategory;
import CategoryController.ListCategory;
import CategoryController.dropListCategory;
import CategoryController.dropListSource;
import NewsController.AddNews;
import NewsController.ListNews;
import NewsController.countNews;
import NewsDetailController.AddNewsDetail;
import UserController.AddUser;
import UserController.EditUser;
import UserController.FindUser;
import UserController.ListUser;
import UserController.RemoveUser;
import UserInfoController.EditUserInfo;
import UserInfoController.ListUserInfo;

//import Model.userDAO;

@WebServlet("*.news")
public class Front_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Front_Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String RequestURI = request.getRequestURI();

		System.out.println(RequestURI);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		String command = RequestURI.substring(contextPath.length());
		Action action = null;

		System.out.println("Implementing " + command);
		switch (command) {
		/* access to user url */
		case "/useradd.news":
			action = new AddUser();
			break;
		case "/userlist.news":
			action = new ListUser();
			break;
		case "/useredit.news":
			action = new EditUser();
			break;
		case "/userremove.news":
			action = new RemoveUser();
			break;

		case "/userfind.news":
			action = new FindUser();
			break;
			
			
			
			
		/* access to userinfo url */
		case "/userinfolist.news":
			action = new ListUserInfo();
			System.out.println("liseet");
			break;
		case "/userinfoedit.news":
			action = new EditUserInfo();
			break;
	
		/* access to category url */
		case "/listcategory.news":
			action = new ListCategory();
			break;

		case "/addcategory.news":
			action = new AddCategory();
			break;
		case "/categoryDropList.news":
			action = new dropListCategory();
			break;
			
		case "/sourceDropList.news":
			action = new dropListSource();
			break;
		
			/* Article Control news*/
		case "/newsarticleadd.news":
			System.out.println("newsarticleadd****");
			action = new AddNews();
			break;
		case "/listarticle.news":
			//System.out.println("listarticle");
			action = new ListNews();
			break;
		case "/counts.news":
			action = new countNews(); 
			break;
		default:
			/*
			 * forward = new ActionForward(); forward.setPath("404.jsp");
			 * forward.setRedirect(true);
			 */
			break;
		}// End of switch;
		try {
			action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
