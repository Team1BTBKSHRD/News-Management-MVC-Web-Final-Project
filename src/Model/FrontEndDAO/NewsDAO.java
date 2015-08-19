package Model.FrontEndDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utilities.DatabaseConnection;

public class NewsDAO {
	Connection con; /* Connection object */
	public NewsDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet listNewsCategoryByDaily(String categoryCode) throws SQLException, ClassNotFoundException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_daily(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet listNewsCategoryByWeekly(String categoryCode) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_weekly(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet listNewsCategoryByMonthly(String categoryCode) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_monthly(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
/*	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ResultSet rs = new NewsDAO().listNewsCategoryByDaily("B010302");
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
	}*/
}// End of class;










