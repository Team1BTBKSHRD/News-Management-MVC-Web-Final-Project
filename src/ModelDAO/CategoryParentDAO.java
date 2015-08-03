package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.CategoryParent;
import Utilities.DatabaseConnection;

public class CategoryParentDAO {
	Connection con;
	PreparedStatement pstm;
	public CategoryParentDAO(){
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean insert(CategoryParent cp) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbcategoryparent(parent_desc) VALUES(?)");
			pstm.setString(1, cp.getParent_desc());
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

	public boolean delete(int parentId) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbcategoryparent WHERE parent_id = ?;");
			pstm.setInt(1, parentId);
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
	public boolean update(CategoryParent cp) throws SQLException{
		try {
			pstm = con.prepareStatement("UPDATE tbcategoryparent SET parent_desc=? WHERE parent_id=?;");
			pstm.setString(1, cp.getParent_desc());
			pstm.setInt(2, cp.getParent_id());
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
	public ArrayList<CategoryParent> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbcategoryparent");
			ArrayList<CategoryParent> cps = new ArrayList<>();
			while(rs.next()){
				cps.add(new CategoryParent(rs.getInt("parent_id"), rs.getString("parent_desc")));
			}
			stm.close();
			rs.close();
			return cps;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
}
