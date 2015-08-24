package Controller.FrontEnd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Home.*;
import Controller.FrontEnd.News.*;
import Controller.FrontEnd.Scrap.listexchange;
import Controller.FrontEnd.Scrap.listjobs;
import Controller.FrontEnd.Scrap.listscholarship;
import Controller.FrontEnd.Search.categorylistwithcode;
import Controller.FrontEnd.Search.listResult;
import Controller.FrontEnd.Search.sourcelistwithcode;

/**
 * Servlet implementation class JsonController
 */
public class JsonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JsonController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("###########################Json Controller");
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;

		System.out.println(RequestURI);
		/*
		 * System.out.println(contextPath); System.out.println("--" + command);
		 */

		switch (command) {
		case "/listResult.json":
			action = new listResult();
			break;
		/* page_scholarship_list.jsp */

		case "/scholarlist.json":
			action = new listscholarship();
			break;
		/* panel list exchange */
		case "/listexchange.json":
			action = new listexchange();
			break;
		/* page_list_job.jsp */
		case "/joblist.json":
			action = new listjobs();
			break;
		/*
		 * case "/listallnews.json": action = new ListAllNews(); break;
		 */
		case "/recentnews.json":
			action = new ListRecentNews();
			break;
		case "/countview.json":
			action = new countView();
			break;
		/* sourcelistwithcode.json */
		case "/sourcelistwithcode.json":
			action = new sourcelistwithcode();
			break;
		/* categorylistwithcode */
		case "/categorylistwithcode.json":
			action = new categorylistwithcode();
			break;
		case "/listnewscategorybydaily.json":
			action = new ListNewsCategoryByDaily();
			break;
		case "/listnewscategorybyweekly.json":
			action = new ListNewsCategoryByWeekly();
			break;
		case "/listnewscategorybymonthly.json":
			action = new ListNewsCategoryByMonthly();
			break;

		/*-------------Bo Add New Case---------------*/
		case "/getrecommendnews.json":
			action = new RecommendNews();
			break;
		case "/getpopularnews.json":
			action = new PopularNews();
			break;

		/*--------------End of New Case--------------*/
		/*-------------------New Case Add----------------------*/
		case "/countNewsByCatCodeDaily.json":
			action = new CountNewsByCatCodeDaily();
			break;
		case "/countNewsByCatCodeWeekly.json":
			action = new CountNewsByCatCodeWeekly();
			break;
		case "/countNewsByCatCodeMonthly.json":
			action = new CountNewsByCatCodeMonthly();
			break;
		/*-----------------End of New Case--------------------*/
		default:
			forward = new ActionForward();
			forward.setPath("404.jsp");
			forward.setRedirect(true);
			break;
		}
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
		try {
			action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
