package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.userinfo;

import Utilities.DatabaseConnection;

public class UserInfoDAO {
	Connection con=null;
	PreparedStatement pstm;
	public UserInfoDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean insert(userinfo ui) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbuserinfo(user_id,user_info_code,full_name,com_name,addr,email,website,phone,logo) VALUES(?,?,?,?,?,?,?,?,?)");
			pstm.setInt(1, ui.getUser_id());
			pstm.setString(2, ui.getUser_info_code());
			pstm.setString(3, ui.getFull_name());
			pstm.setString(4, ui.getCom_name());
			pstm.setString(5, ui.getAddr());
			pstm.setString(6, ui.getEmail());
			pstm.setString(7, ui.getWebsite());
			pstm.setString(8, ui.getPhone());
			pstm.setString(9, ui.getLogo());
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
	public boolean delete(int ui) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbuserinfo WHERE user_info_id = ?;");
			pstm.setInt(1, ui);
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
	public ArrayList<userinfo> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbuserinfo");
			ArrayList<userinfo> uis = new ArrayList<>();
			while(rs.next()){
				uis.add(new userinfo(rs.getInt(0),rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
			}
			stm.close();
			rs.close();
			return uis;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
}
