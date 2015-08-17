package CategoryParentController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryParentDAO;
import ModelDTO.CategoryParent;

public class AddCategoryParent implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int parentId = 0;
		String parentDesc = "";
		
		CategoryParentDAO dao = new CategoryParentDAO(); /* Instantiate DAO object */

		if(dao.insert(new CategoryParent(parentId, parentDesc))){
			response.getWriter().write("Category Parent Added"); /* Add Successful */
		}
		else{
			response.getWriter().write("Category Parent Add Unsuccessfuly"); /* Add Unsuccessful */
		}
		
		
	}

}
