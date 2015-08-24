package Model.FrontEndDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Utilities.DatabaseConnection;

public class UserInfoDAO {
	Connection con; /* Connection object */
	PreparedStatement pstm; /* Prepared Statement object */

	/**
	 * Default Constructor Initialize object con by using class
	 * DatabaseConnection.
	 */
	public UserInfoDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet listuserCodeName() throws SQLException {
		Statement stm = con.createStatement();
		return stm
				.executeQuery("select user_info_code, full_name from tbuserinfo");
	}
}
