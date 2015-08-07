/**
 * 
 */
package UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Action;
import Controller.ActionForward;
import ModelDAO.UserDAO;
import ModelDTO.User;

/**
 * @author Pisal
 *
 */
public class RemoveUser implements Action {

	/* (non-Javadoc)
	 * @see Controller.Action#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id=Integer.parseInt(request.getParameter("user_id"));
		/*String name = "Acer123";
		String password = "121212";
		String usertype = "admin";*/
		
		if(new UserDAO().delete(id)){
			response.getWriter().write("User have been deleted.");
			System.out.println("Yes");
		}else{
			response.getWriter().write("deleted Fail");
		}
	}

}
