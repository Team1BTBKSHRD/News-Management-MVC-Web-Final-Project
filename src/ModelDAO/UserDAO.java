package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.User;
import Utilities.DatabaseConnection;

/**
 * Class UserDAO
 * Use For interact between Java and DBMS(tbuser). 
 */
public class UserDAO {
	Connection con; /* Connection object */
	PreparedStatement pstm; /* Prepared Statement object */
	
	/**
	 * Default Constructor
	 * Initialize object con by using class DatabaseConnection.
	 * */
	public UserDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * Method insert()
	 * Use for insert data into tbuser
	 * @param user is an DTO object of class User 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean insert(User user) throws SQLException{
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("INSERT INTO tbuser(user_name, user_pass, user_type) VALUES(?, ?, ?);");
			/* Initialize parameters for pstm object */
			pstm.setString(1, user.getUser_name());
			pstm.setString(2, user.getUser_pass());
			pstm.setString(3, user.getUser_type());
			System.out.println(pstm.toString());
			return pstm.executeUpdate()>0?true:false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if insert unsuccessful */
	}
	
	/**
	 * Method delete()
	 * Use for delete a record from tbuser
	 * @param userId is ID of User 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean delete(int userId) throws SQLException{
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("DELETE FROM tbuser WHERE user_id = ?;");
			/* Initialize parameter for pstm object */
			pstm.setInt(1, userId);
			return pstm.executeUpdate()>0?true:false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if insert unsuccessful */
	}
	
	/**
	 * Method update()
	 * Use for update data into tbuser
	 * @param user is an DTO object of class User 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean update(User user) throws SQLException{
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("UPDATE tbuser SET user_name=?, user_pass=?, user_type=? WHERE user_id=?;");
			/* Initialize parameters for pstm object */
			pstm.setString(1, user.getUser_name());
			pstm.setString(2, user.getUser_pass());
			pstm.setString(3, user.getUser_type());
			pstm.setInt(4, user.getUser_id());			
			
	
			return pstm.executeUpdate()>0?true:false; /* return true for success and false if fail */
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		finally{
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if update unsuccessful */
	}
	
	/**
	 * Method retrieve()
	 * Use for retrieve all data from tbuser
	 * @throws SQLException
	 * @return ArrayList<CategoryParent>
	 * */
	public ArrayList<User> retrieve() throws SQLException{
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		ArrayList<User> users = null; /* users stores data of rs */
		try {
			stm = con.createStatement(); /* Statement for Query Data from DBMS */
			rs = stm.executeQuery("SELECT * FROM tbuser;"); /* rs stores all records of query */
			users = new ArrayList<>();
			while(rs.next()){ /* Add every record into users */
				users.add(new User(rs.getInt("user_id"), 
								rs.getString("user_name"), 
								rs.getString("user_pass"), 
								rs.getString("user_type")));
			}
			
			return users; /* return user object */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			/* Close stm, rs and con */
			stm.close();
			rs.close();
			con.close();
		}
		return null; /* Return null if error */
	}
	
}//End of class;















