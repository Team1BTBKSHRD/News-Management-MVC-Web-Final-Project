package Controller.sub;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Logger;
import ModelDAO.CategoryDAO;
import ModelDAO.UserDAO;
import ModelDTO.User;
import Utilities.Convertor;

/**
 * Servlet implementation class UserCon
 */
@WebServlet("/UserCon")
public class UserCon extends HttpServlet {
	private User userdto = null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserCon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("static-access")
	public void process(HttpServletRequest request, HttpServletResponse response) {
		switch (request.getParameter("action").toLowerCase()) {
		case "add":
			userdto = new User();
			int id = Integer.parseInt(request.getParameter("user_id"));
			String name = request.getParameter("user_name");
			String password = request.getParameter("user_pass");
			String usertype = request.getParameter("user_type");
			userdto.setUser_id(id);
			userdto.setUser_name(name);
			userdto.setUser_pass(password);
			userdto.setUser_type(usertype);
			try {
				new UserDAO().insert(userdto);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Logger.getLogger().writeLogException(e, "add", "User Controller");
			}
			break;
		case "remove":

			int rid = Integer.parseInt(request.getParameter("user_id"));
			try {
				new UserDAO().delete(rid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Logger.getLogger().writeLogException(e, "remove", "User Controller");
			}
			break;
		case "edit":
			userdto = new User();
			int eid = Integer.parseInt(request.getParameter("user_id"));
			String ename = request.getParameter("user_name");
			String epassword = request.getParameter("user_pass");
			String eusertype = request.getParameter("user_type");
			userdto.setUser_id(eid);
			userdto.setUser_name(ename);
			userdto.setUser_pass(epassword);
			userdto.setUser_type(eusertype);
			try {
				new UserDAO().update(userdto);
			} catch (Exception e) {
				// TODO: handle exception
				Logger.getLogger().writeLogException(e, "edit", "User Controller");
			}
			break;
		case "list":
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			String article;
			try {
				article = new Gson().toJson(new Convertor().convertResultSetIntoJSON(new UserDAO().retrive()));
				response.getWriter().write(article);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
