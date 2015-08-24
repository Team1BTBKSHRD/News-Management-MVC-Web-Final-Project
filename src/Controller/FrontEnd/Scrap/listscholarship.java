package Controller.FrontEnd.Scrap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.Scrap.JsoupDAO;
import Utilities.Convertor;

public class listscholarship implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("listscholarship");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		JsoupDAO dao = new JsoupDAO();
		String obj = Convertor.convertResultSetIntoJSON(dao.retrievScholarship()).toString();
		dao.close();
		//System.out.println(obj);
		response.getWriter().write(obj);
	}

}
