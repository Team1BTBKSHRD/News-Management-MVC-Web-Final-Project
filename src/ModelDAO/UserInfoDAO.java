package ModelDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.UserInfo;
import Utilities.DatabaseConnection;

/**
 * Class UserInfoDAO
 * Use For interact between Java and DBMS(tbuserinfo). 
 */
public class UserInfoDAO {
	Connection con; /* Connection object */
	PreparedStatement pstm; /* Prepared Statement object */
	
	/**
	 * Default Constructor
	 * Initialize object con by using class DatabaseConnection.
	 * */
	public UserInfoDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method insert()
	 * Use for insert data into tbuserinfo
	 * @param userInfo is an DTO object of class UserInfo 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean insert(UserInfo userInfo) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("INSERT INTO tbuserinfo(user_id, user_info_code, full_name, com_name, addr,email, website, phone, logo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);");
			/* Initialize parameters for pstm object */
			pstm.setInt(1, userInfo.getUser_id());
			pstm.setString(2, userInfo.getUser_info_code());
			pstm.setString(3, userInfo.getFull_name());
			pstm.setString(4, userInfo.getCom_name());
			pstm.setString(5, userInfo.getAddr());
			pstm.setString(6, userInfo.getEmail());
			pstm.setString(7, userInfo.getWebsite());
			pstm.setString(8, userInfo.getPhone());
			pstm.setString(9, userInfo.getLogo());
			
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
	 * Use for delete a record from tbuserinfo
	 * @param userInfoId is ID of UserInfo 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean delete(int userInfoId) throws SQLException{
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("DELETE FROM tbuserinfo WHERE user_info_id = ?;");
			/* Initialize parameter for pstm object */
			pstm.setInt(1, userInfoId);
			
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
	 * Use for update data into tbuserinfo
	 * @param userInfo is an DTO object of class UserInfo 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean update(UserInfo userInfo) throws SQLException{
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("UPDATE tbuserinfo SET user_id=?, user_info_code=?, full_name=?, com_name=?, addr=?, email=?, website=?, phone=?, logo=? WHERE user_info_id=?;");
			/* Initialize parameters for pstm object */
			pstm.setInt(1, userInfo.getUser_id());
			pstm.setString(2, userInfo.getUser_info_code());
			pstm.setString(3, userInfo.getFull_name());
			pstm.setString(4, userInfo.getCom_name());
			pstm.setString(5, userInfo.getAddr());
			pstm.setString(6, userInfo.getEmail());
			pstm.setString(7, userInfo.getWebsite());
			pstm.setString(8, userInfo.getPhone());
			pstm.setString(9, userInfo.getLogo());
			pstm.setInt(10, userInfo.getUser_info_id());
		
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
	 * Use for retrieve all data from tbuserinfo
	 * @throws SQLException
	 * @return ArrayList<News>
	 * */
	public ArrayList<UserInfo> retrive() throws SQLException{
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		ArrayList<UserInfo> userInfos = null; /* users stores data of rs */
		try {
			stm = con.createStatement(); /* Statement for Query Data from DBMS */
			rs = stm.executeQuery("SELECT * FROM tbuserinfo;"); /* rs stores all records of query */
			userInfos = new ArrayList<>();
			while(rs.next()){ /* Add every record into users */
				userInfos.add(new UserInfo(rs.getInt("user_info_id"),
										   rs.getInt("user_id"),
										   rs.getString("user_info_code"),
										   rs.getString("full_name"),
										   rs.getString("com_name"),
										   rs.getString("addr"),
										   rs.getString("email"),
										   rs.getString("website"),
										   rs.getString("phone"),
										   rs.getString("logo")));
			}
			
			return userInfos; /* return user object */
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
	/* return user info code*/
	public String returnUserInfoCode(String data) throws SQLException{
		
		CallableStatement clsm=con.prepareCall("{call user_info_code(?)}");
		clsm.setString(1, data);
		ResultSet rs=clsm.executeQuery();
		if(rs.next()){
			return rs.getString(1).toString();
		}
		return null;
	}
}//End of class;












