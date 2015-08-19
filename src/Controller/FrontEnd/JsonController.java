package Controller.FrontEnd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.News.*;
import Controller.FrontEnd.Search.categorylistwithcode;
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
		System.out.println(contextPath);
		System.out.println("--" + command);

		switch (command) {
		case "/listexchange.json":
			action = new listexchange();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/joblist.json":
			action = new listjobs();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/listallnews.json":
			action = new ListAllNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/recentnews.json":
			action = new ListRecentNews();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "/countview.json":
			action = new countView();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/* sourcelistwithcode.json */
		case "/sourcelistwithcode.json":
			action = new sourcelistwithcode();
			try {
				action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		/* categorylistwithcode */

		case "/categorylistwithcode.json":
			action = new categorylistwithcode();
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
	}
}
