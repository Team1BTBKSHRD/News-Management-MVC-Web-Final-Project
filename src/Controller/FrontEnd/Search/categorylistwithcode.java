package Controller.FrontEnd.Search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.BackEndDAO.CategoryDAO;
import Utilities.Convertor;

public class categorylistwithcode implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		CategoryDAO dao = new CategoryDAO();
		String listCatCodeCatName = Convertor.convertResultSetIntoJSON(dao.listCatcodeCatName()).toString();
		dao.close();
		response.getWriter().write(listCatCodeCatName);

	}

}
