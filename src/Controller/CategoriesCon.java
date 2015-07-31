package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModelDAO.CategoryDAO;

/**
 * Servlet implementation class CategoriesCon
 */
/*@WebServlet("/CategoriesCon")*/
public class CategoriesCon extends HttpServlet {
	private CategoryDAO cateDAO;
	private static final long serialVersionUID = 1L;

	/**
	 * initialize DAO objects
	 */
	public void init() {
		cateDAO = new CategoryDAO();
	}
	/**
	 * @param request, respone
	 * doGet and doPost action merge
	 * */
	public void process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("test"));
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoriesCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

}
