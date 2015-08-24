package Controller.FrontEnd.Search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FrontEndDAO.UserInfoDAO;
import Utilities.Convertor;
import Controller.FrontEnd.Action;

public class sourcelistwithcode implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		UserInfoDAO dao = new UserInfoDAO();
		String obj=Convertor.convertResultSetIntoJSON(dao.listuserCodeName()).toString();
		dao.close();
		response.getWriter().write(obj);		
		System.out.println("sourcelistwithcode");			
	}

}
