package Controller.FrontEnd.Search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.BackEndDAO.CategoryDAO;
import Model.BackEndDAO.UserInfoDAO;
import Utilities.Convertor;

public class categorylistwithcode implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String obj=Convertor.convertResultSetIntoJSON(new CategoryDAO().listCatcodeCatName()).toString();
		response.getWriter().write(obj);		
		System.out.println(obj);

	}

}
