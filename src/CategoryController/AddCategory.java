package CategoryController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import ModelDTO.Category;

public class AddCategory implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int catId = 0;
		String catCode = "";
		int parentId = 0;
		String catName = "";
		String catDesc = "";
		CategoryDAO dao = new CategoryDAO(); /* Instantiate DAO object */

		if(dao.insert(new Category(catId, catCode, parentId, catName, catDesc))){
			response.getWriter().write("Category Added"); /* Add Successful */
		}
		else{
			response.getWriter().write("Category Add Unsuccessfuly"); /* Add Unsuccessful */
		}
		
		return null;
	}

}
