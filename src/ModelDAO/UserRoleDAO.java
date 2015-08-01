package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.UserRole;
import Utilities.DatabaseConnection;

public class UserRoleDAO {
	Connection con;
	PreparedStatement pstm;
	
	public UserRoleDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean insert(UserRole userRole) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbuserrole(user_type, user_desc) VALUES(?, ?);");
			pstm.setString(1, userRole.getUser_type());
			pstm.setString(2, userRole.getUser_desc());
			return pstm.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pstm.close();
			con.close();
		}
		return false;
	}
	
	public boolean delete(int userRoleId) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbuserrole WHERE user_role_id = ?;");
			pstm.setInt(1, userRoleId);
			return pstm.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pstm.close();
			con.close();
		}
		return false;
	}
	
	public boolean update(UserRole userRole) throws SQLException{
		try {
			pstm = con.prepareStatement("UPDATE tbuserrole SET user_type=?, user_desc=? WHERE user_role_id=?;");
			
			pstm.setString(1, userRole.getUser_type());
			pstm.setString(2, userRole.getUser_desc());
			pstm.setInt(3, userRole.getUser_role_id());
			
		
			return pstm.executeUpdate()>0?true:false;
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		finally{
			pstm.close();
			con.close();
		}
		return false;
	}
	public ArrayList<UserRole> retrive() throws SQLException{
		Statement stm = null;
		ResultSet rs = null;
		ArrayList<UserRole> userRoles = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery("SELECT * FROM tbuserrole");
			userRoles = new ArrayList<>();
			while(rs.next()){
				userRoles.add(new UserRole(rs.getInt("user_role_id"),
										   rs.getString("user_type"),
										   rs.getString("user_desc")));
			}
			
			return userRoles;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			stm.close();
			rs.close();
			con.close();
		}
		return null;
	}
	
}//End of class;












