package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

		//System.out.println(RequestURI);
		String contextPath = request.getContextPath();
		//System.out.println(contextPath);
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;

		System.out.println(command);
		switch (command) {
		/* access to user url */
		case "/useradd.news":
			action = new AddUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/userlist.news":
			action = new ListUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/useredit.news":
			action = new EditUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/userremove.news":
			action = new RemoveUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/userfind.news":
			action = new FindUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		// access to userinfo url
		case "/userinfolist.news":
			action = new ListUserInfo();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/userinfoedit.news":
			action = new EditUserInfo();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		// access to category url 
		case "/listcategory.news":
			//System.err.println("List category");
			action = new ListCategory();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/addcategory.news":
			action = new AddCategory();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/categoryDropList.news":
			System.err.println(12112);
			action = new dropListCategory();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/sourceDropList.news":
			System.err.println("source drop list");
			action = new dropListSource();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		// Article Control news
		case "/newsarticleadd.news":

			action = new AddNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/listarticle.news":

			action = new ListNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/counts.news":
			action = new countNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/*
		 * case "/admin": System.out.println("admin"); break;
		 */
		default:

			forward = new ActionForward();
			forward.setPath("404.jsp");
			forward.setRedirect(true);

			break;
		}// End of switch;
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}

		}
	}
}
