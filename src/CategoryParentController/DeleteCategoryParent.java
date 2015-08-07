package CategoryParentController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.CategoryParentDAO;

public class DeleteCategoryParent implements Action {

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* Get data from client request */
		int categoryParentId = 0;
		if(new CategoryParentDAO().delete(categoryParentId)){
			response.getWriter().write("Category Parent Has been Deleted"); /* Delete Successful */
		}
		else{
			response.getWriter().write("Category Parent Delete Unsuccessful"); /* Delete Unsuccessful */
		}
		
	}

}
