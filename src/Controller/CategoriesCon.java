package Controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
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
		category cate = null;
		switch (request.getParameter("action").toLowerCase()) {
		case "list":
			try {
				response.setContentType("application/json");
				response.setCharacterEncoding("UTF-8");
				String article = new Gson()
						.toJson(new Convertor().convertResultSetIntoJSON(new CategoryDAO().retrive()));

				response.getWriter().write(article);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				log.writeLogException(new ArithmeticException(), "list", "CategoriesCon");
			}
			break;
		case "add":
			cate = new category();
			cate.setCat_id(Integer.parseInt(request.getParameter("cat_id")));
			log.writeLogAdd(Integer.parseInt(request.getParameter("cat_id")));
			cate.setCat_code(request.getParameter("cat_code"));
			cate.setCat_name(request.getParameter("cat_name"));
			cate.setCat_desc(request.getParameter("cat_desc"));

			try {
				if(new CategoryDAO().insert(cate)){
					response.getWriter().write("success");
				}else{
					response.getWriter().write("faild");
				}
			} catch (SQLException |IOException e) {
				// TODO Auto-generated catch block
				log.writeLogException(e, "add", "CategoriesCon");
			}
			break;
		case "remove":
			try {
				int id = Integer.parseInt(request.getParameter("cat_id"));
				new CategoryDAO().delete(id);
				log.writeLogDelete(id);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				log.writeLogException(e, "remove", "CategoriesCon");
			} catch (SQLException e) {
				// TODO Auto-generated catch block

				log.writeLogException(e, "remove", "CategoriesCon");
			}
			break;
		case "edit":
			try {
				cate = new category();
				int id = Integer.parseInt(request.getParameter("cat_id"));
				String name=request.getParameter("cat_name");
				String desc=request.getParameter("cat_desc");
				log.writeLogUpdate(id, name+":"+desc);
				cate.setCat_id(id);
				cate.setCat_name(name);
				cate.setCat_desc(desc);
				new CategoryDAO().update(cate);
			} catch (Exception e) {
				// TODO: handle exception
				log.writeLogException(e, "edit", "CategoriesCon");
			}
			break;
		}
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
