package Controller.sub;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import Utilities.Convertor;

public class newsCategory implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		@SuppressWarnings("static-access")
		String obj = new Convertor().convertResultSetIntoJSON(new CategoryDAO().retrieveRS()).toString();
		response.getWriter().write(obj);
	
	}

}
