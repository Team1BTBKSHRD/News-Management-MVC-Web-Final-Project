package CategoryController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryDAO;
import ModelDTO.Category;

public class UpdateCategory implements Action {
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

		if(dao.update(new Category(catId, catCode, parentId, catName, catDesc))){
			response.getWriter().write("Category Updated"); /* Update Successful */
		}
		else{
			response.getWriter().write("Category Update Unsuccessfuly"); /* Update Unsuccessful */
		}
		
		return null;
	}
}
