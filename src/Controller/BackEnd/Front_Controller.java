package Controller.BackEnd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.BackEnd.Article.AddNews;
import Controller.BackEnd.Article.ListNewsDraft;
import Controller.BackEnd.Article.update_full_article;
import Controller.BackEnd.Category.*;
import Controller.BackEnd.User.*;
import Controller.BackEnd.UserInfo.*;
import Controller.Filter.*;
import Controller.FrontEnd.News.*;

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
		ActionForward forward = null;
		Action action = null;

		System.out.println("--" + command);

		switch (command) {
		// access to user url
		case "/Admin/useradd.news":
			action = new AddUser();

			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/Admin/usertypelist.news":
			action = new ListUser();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		

		// access to userinfo url
		case "/Admin/userinfolist.news":
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
		case "/Admin/pg_cate_tblistcategory.news":

			action = new ListCategory();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		
		/* End Case : Category Insert */
		case "/Admin/categoryDropList.news":

			action = new dropListCategory();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/Admin/sourceDropList.news":
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
			
		
		
			/*for update full Atricle sarin*/
		case "/Admin/update_article.news":
			action = new update_full_article();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		
			
			/*for update status sarin*/
		case "/Admin/updateStatus.news":
			action = new updateStatus();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
			/*sarin edit user status*/
		case "/Admin/editUserstatus.news":
			action = new EditStatus();
			System.out.println("edit user");
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		case "/Admin/listarticle.news":

			action = new ListNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		
		/* sarin list_draft_news.news query from b_vw_draft_news */
		case "/Admin/list_draft_news.news":

			action = new ListNewsDraft();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/Admin/counts.news":
			action = new countNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/Admin/selectTypeArticles.news":
			action = new typeofarticlespost();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/Login/Login.news":

			action = new MyLogin();

			System.out.println("He");
			try {
				System.out.println("in try");
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case "/listexchange.news":
			action = new listexchange();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/joblist.news":
			action = new listjobs();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/* list of all news */
		case "/listallnews.news":
			action = new ListAllNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/* list recent news for slider */
		case "/recentnews.news":
			action = new ListRecentNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/countview.news":
			action = new countView();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		/*
		 * case "/getUcategoryDropListserInfoName.news":
		 * //System.out.println("getUserInfoName111"); action = new
		 * returnUserInfoName(); try { action.execute(request, response); }
		 * catch (Exception e) { e.printStackTrace(); } break; case
		 * "/listpopular.news": action = new ListPopular(); try {
		 * action.execute(request, response); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		/* Add Article */
		case "/Admin/addarticle.news":
			action = new AddNews();
			
			
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		
			/* File Upload */
		case "/Admin/UploadServlet.news":
			action = new FileUpload();
			System.out.println("-------Upload Photo------");
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			/* Statistic News */
		case "/Admin/filterstatistic.news":
			action = new filterstatistic();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/* Statistic Number of view,like,dislike*/
		case "/Admin/filterstatisticView.news":
			action = new filterstatisticView();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
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
