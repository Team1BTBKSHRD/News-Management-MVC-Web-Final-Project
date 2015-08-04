package Controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.sub.newsCategory;

@WebServlet("*.news")
public class Front_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Front_Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		
		//System.out.println(RequestURI);
		String contextPath = request.getContextPath();
		//System.out.println(contextPath);
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		System.out.println(command);
			
		switch(command){
			case "/newsCategory.news":
	
				action = new newsCategory();
				try {
					forward = action.execute(request, response);
					//System.out.println(forward);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
		/*	case "/classlist.hrd":
				action = new classList();
				try {
					forward = action.execute(request, response);
					System.out.println(forward);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;*/
			/*case "/universitylist.hrd":
				action = new universityList();
				try {
					forward = action.execute(request, response);
					System.out.println(forward);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "/editobject.hrd":
				action = new EditObject();
				try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;*/
			default :
				forward = new ActionForward();
				forward.setPath("404.jsp");
				forward.setRedirect(false);
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
