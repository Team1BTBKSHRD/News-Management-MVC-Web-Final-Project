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
import Utilities.Logger;

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
			break;
		case "/Admin/usertypelist.news":
			action = new ListUser();

			break;

		// access to userinfo url
		case "/Admin/userinfolist.news":
			action = new ListUserInfo();

			break;

		// access to category url
		case "/Admin/pg_cate_tblistcategory.news":

			action = new ListCategory();

			break;

		/* End Case : Category Insert */
		case "/Admin/categoryDropList.news":

			action = new dropListCategory();

			break;

		case "/Admin/sourceDropList.news":
			action = new dropListSource();

			break;

		/* for update userinfo sarin */
		case "/Admin/udateUserInfo.news":
			action = new EditUserInfo();

			break;

		/* for update full Atricle sarin */
		case "/Admin/update_article.news":
			action = new update_full_article();

			break;

		/* for update category Status sarin */
		case "/Admin/updateCategoryStatus.news":
			action = new updateCategoryStatus();

			break;

		/* for update status sarin */
		case "/Admin/updateStatus.news":
			action = new updateStatus();

			break;

		/* sarin edit user status */
		case "/Admin/editUserstatus.news":
			action = new EditStatus();

			break;

		case "/Admin/listarticle.news":

			action = new ListNews();

			break;

		/* sarin list_draft_news.news query from b_vw_draft_news */
		case "/Admin/list_draft_news.news":

			action = new ListNewsDraft();

			break;
		/* sarin listuserinfo */
		case "/Admin/listUserInfo.news":

			action = new ListUserInfoByName();

			break;

		case "/Admin/counts.news":
			action = new countNews();

			break;
		case "/Admin/selectTypeArticles.news":
			action = new typeofarticlespost();

			break;
		case "/Login/Login.news":

			action = new MyLogin();

			break;

		/* Add Article */
		case "/Admin/addarticle.news":
			action = new AddNews();

			break;

		/* File Upload */
		case "/Admin/UploadServlet.news":
			action = new FileUpload();
			System.out.println("-------Upload Photo------");

			break;

		/* Statistic News */
		case "/Admin/filterstatistic.news":
			action = new filterstatistic();

			break;
		/* Statistic Number of view,like,dislike */
		case "/Admin/filterstatisticView.news":
			action = new filterstatisticView();

			break;

		/* Statistic Number of view by Account */
		case "/Admin/filterstatisticViewByAccount.news":
			action = new filterstatisticviewByAccount();

			break;
		default:
			forward = new ActionForward();
			forward.setPath("404.jsp");
			forward.setRedirect(true);
			break;
		}// End of switch;

		try {
			action.execute(request, response);
		} catch (Exception e) {
			Logger.writeLogException(e, request.getContextPath(), response.getContentType());
		}
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
