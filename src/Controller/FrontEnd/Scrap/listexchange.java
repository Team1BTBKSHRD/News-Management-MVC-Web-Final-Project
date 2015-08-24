package Controller.FrontEnd.Scrap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.FrontEnd.Action;
import Model.FrontEndDAO.Scrap.JsoupDAO;
import Utilities.Convertor;

public class listexchange implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("listexchange");
	      response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
		String obj = Convertor.convertResultSetIntoJSON(new JsoupDAO().retrieveExchange()).toString();
		//System.out.println(obj);
		response.getWriter().write(obj);

	}
	/*public static void main(String[] args) throws Exception {
		System.out.println(Convertor.convertResultSetIntoJSON(new JsoupDAO().retrieveExchange()).toString());
	}*/
}
