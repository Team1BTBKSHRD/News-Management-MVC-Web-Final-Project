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
	public ResultSet listNewsCategoryByDaily(String categoryCode, int limit) throws SQLException, ClassNotFoundException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_daily(?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
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
	
	public ResultSet listNewsCategoryByWeekly(String categoryCode, int limit) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_weekly(?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
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
	
	public ResultSet listNewsCategoryByMonthly(String categoryCode, int limit) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_monthly(?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
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
	
	public ResultSet searchNewsFilterTime(String newsTitle, String categoryCode, String fullName, String timeFilter) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_search_news_filter_time(?, ?, ?, ?)}");
			clstm.setString(1, newsTitle);
			clstm.setString(2, categoryCode);
			clstm.setString(3, fullName);
			clstm.setString(4, timeFilter);
			System.out.println(clstm.toString());
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
	
}// End of class;










