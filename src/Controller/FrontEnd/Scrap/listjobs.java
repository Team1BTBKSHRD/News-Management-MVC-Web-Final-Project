package Controller.FrontEnd.Scrap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.Scrap.JsoupDAO;
import Utilities.Convertor;

public class listjobs implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("listjobs");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String obj=Convertor.convertResultSetIntoJSON(new JsoupDAO().retrievJobs()).toString();
		response.getWriter().write(obj);
	}
	/*public static void main(String[] args) throws Exception {
		System.out.println(Convertor.convertResultSetIntoJSON(new JsoupDAO().retrievJobs()).toString());
	}*/
}
