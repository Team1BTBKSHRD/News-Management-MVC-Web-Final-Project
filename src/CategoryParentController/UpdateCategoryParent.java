package CategoryParentController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryParentDAO;
import ModelDTO.CategoryParent;

public class UpdateCategoryParent implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int parentId = 0;
		String parentDesc = "";
		
		CategoryParentDAO dao = new CategoryParentDAO(); /* Instantiate DAO object */

		if(dao.update(new CategoryParent(parentId, parentDesc))){
			response.getWriter().write("Category Parent Update"); /* Add Successful */
		}
		else{
			response.getWriter().write("Category Parent Updated Unsuccessfuly"); /* Add Unsuccessful */
		}
		
		return null;
	}
}
