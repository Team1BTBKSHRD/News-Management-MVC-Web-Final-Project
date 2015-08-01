package Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ModelDAO.CategoryDAO;
import ModelDTO.category;
import ModelDTO.news;
import Utilities.Convertor;

/**
 * Servlet implementation class CategoriesCon
 */
/* @WebServlet("/CategoriesCon") */
public class CategoriesCon extends HttpServlet {
	private Logger log = Logger.getLogger();
	private static final long serialVersionUID = 1L;

	/**
	 * initialize DAO objects
	 */
	/*
	 * public void init() { cateDAO = new CategoryDAO(); }
	 */
	/**
	 * @param request,
	 *            respone doGet and doPost action merge
	 */
	public void process(HttpServletRequest request, HttpServletResponse response) {
		switch (request.getParameter("test").toLowerCase()) {
		case "list":
			try {
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				String article = new Gson()
						.toJson(new Convertor().convertResultSetIntoJSON(new CategoryDAO().retrive()));

				response.getWriter().write(article);
				log.writeLogException(new ArithmeticException(), "list", "CategoriesCon");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			break;
		case "add":
			/*category cat=null;
			try {
				new CategoryDAO().insert(new catego)
			} catch (Exception e) {
				// log.writeLogException(e, "list", "CategoriesCon");
			}
			*/
			break;
		default:
			break;

		}
		// response.setcon
	}

	String getGson(ArrayList arraylist) {
		return new Gson().toJson(arraylist);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CategoriesCon() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
