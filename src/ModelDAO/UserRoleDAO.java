package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.userrole;
import Utilities.DatabaseConnection;

public class UserRoleDAO {
	Connection con=null;
	PreparedStatement pstm;
	public UserRoleDAO(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean insert(userrole ur) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbuserrole(user_type,user_desc) VALUES(?,?)");
			pstm.setString(1, ur.getUser_type());
			pstm.setString(2, ur.getUser_desc());
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
	public boolean delete(int urid) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbuserrole WHERE user_role_id = ?;");
			pstm.setInt(1, urid);
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
	public ArrayList<userrole> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbuserrole");
			ArrayList<userrole> urs = new ArrayList<>();
			while(rs.next()){
				urs.add(new userrole(rs.getInt(0),rs.getString(1),rs.getString(2)));
			}
			stm.close();
			rs.close();
			return urs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
}
