package ModelDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import ModelDTO.Category;

import Utilities.DatabaseConnection;

public class CategoryDAO {
	Connection con;
	PreparedStatement pstm;

	public CategoryDAO() {
		try {
			System.out.println(System.getProperty("user.dir"));
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insert(Category c) throws SQLException {
		try {
			pstm = con.prepareStatement("INSERT INTO tbcategory(cat_code,parent_id,cat_name,cat_desc) VALUES(?,?,?,?)");
			pstm.setString(1, c.getCat_code());
			pstm.setInt(2, c.getParent_id());
			pstm.setString(3, c.getCat_name());
			pstm.setString(4, c.getCat_desc());
			return pstm.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pstm.close();
			con.close();
		}
		return false;
	}

	public boolean delete(int cid) throws SQLException {
		try {
			pstm = con.prepareStatement("DELETE FROM tbcategory WHERE cat_id = ?;");
			pstm.setInt(1, cid);
			return pstm.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pstm.close();
			con.close();
		}
		return false;
	}

	public boolean update(Category c) throws SQLException {
		try {
			pstm = con.prepareStatement(
					"UPDATE tbcategoryparent SET cat_code=?,parent_id=?,cat_name=?,cat_desc=? WHERE cat_id=?;");
			pstm.setString(1, c.getCat_code());
			pstm.setInt(2, c.getParent_id());
			pstm.setString(3, c.getCat_name());
			pstm.setString(4, c.getCat_desc());
			pstm.setInt(5, c.getCat_id());

			return pstm.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstm.close();
			con.close();
		}
		return false;
	}

	public ResultSet retrive() {
		CallableStatement stm=null;
		ResultSet rs=null;
		try {
			stm = con.prepareCall("{call vw_category_chosen}");
			return stm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} /*finally {
			try {
				con.close();
				stm.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		return null;
	}
}
