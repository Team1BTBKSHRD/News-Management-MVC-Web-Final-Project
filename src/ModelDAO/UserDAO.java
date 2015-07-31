package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.User;
import Utilities.DatabaseConnection;

public class UserDAO {
	Connection con=null;
	PreparedStatement pstm=null;
	
	public UserDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public boolean insert(User u) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbuser(user_name,user_pass,user_type) VALUES(?,?,?)");
			pstm.setString(1, u.getUser_name());
			pstm.setString(2, u.getUser_pass());
			pstm.setString(3, u.getUser_type());
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
	public boolean delete(int uid) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbuser WHERE user_id = ?;");
			pstm.setInt(1, uid);
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
	public boolean update(User u) throws SQLException{
		try {
			pstm = con.prepareStatement("UPDATE tbuser SET user_name=?,SET user_pass=?,SET user_type=? WHERE user_id=?;");
			
			pstm.setString(1, u.getUser_name());
			pstm.setString(2, u.getUser_pass());
			pstm.setString(3, u.getUser_type());
			pstm.setInt(4, u.getUser_id());			
			
		
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
	public ArrayList<User> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbuser");
			ArrayList<User> us = new ArrayList<>();
			while(rs.next()){
				us.add(new User(rs.getInt(0),rs.getString(1),rs.getString(2),rs.getString(3)));
			}
			stm.close();
			rs.close();
			return us;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
}
