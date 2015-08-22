package Model.FrontEndDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utilities.DatabaseConnection;

public class CategoryDAO {
	Connection con; /* Connection object */

	public CategoryDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Boolean checkCategory(String categoryCode) throws SQLException,
			ClassNotFoundException {
		try {
			PreparedStatement clstm = con
					.prepareCall("Select cat_code from tbcategory where cat_code = ?");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			if (rs.next())
				return true;
			return false;
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			con.close();
		}
		return false;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		System.out.println(new CategoryDAO().checkCategory(""));
	}
}// End of class;

