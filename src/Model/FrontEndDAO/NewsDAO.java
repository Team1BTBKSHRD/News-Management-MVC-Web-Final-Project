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
	public ResultSet listNewsCategoryByDaily(String categoryCode, int limit, int offset) throws SQLException, ClassNotFoundException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_daily(?, ?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
			clstm.setInt(3, offset);
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet listNewsCategoryByWeekly(String categoryCode, int limit, int offset) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_weekly(?, ?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
			clstm.setInt(3, offset);
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet listNewsCategoryByMonthly(String categoryCode, int limit, int offset) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_show_news_category_by_monthly(?, ?, ?)}");
			clstm.setString(1, categoryCode);
			clstm.setInt(2, limit);
			clstm.setInt(3, offset);
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet searchNewsFilterTime(String newsTitle, String categoryCode, String userInfoCode, String timeFilter, int limit, int offset) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call e_search_news_filter_time(?, ?, ?, ?, ?, ?)}");
			clstm.setString(1, newsTitle);
			clstm.setString(2, categoryCode);
			clstm.setString(3, userInfoCode);
			clstm.setString(4, timeFilter);
			clstm.setInt(5, limit);
			clstm.setInt(6, offset);
			System.out.println(clstm.toString());
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	public ResultSet getPopularNews() throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_vw_news_popular}");
		
			System.out.println(clstm.toString());
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	public ResultSet getRecommendNews() throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{call s_vw_news_recommend}");
		
			System.out.println(clstm.toString());
			ResultSet rs = clstm.executeQuery();
			//rs.next();
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	public ResultSet countNewsByCatCodeDaily(String categoryCode) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{CALL s_count_news_by_catcode_daily(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet countNewsByCatCodeMonthly(String categoryCode) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{CALL s_count_news_by_catcode_monthly(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public ResultSet countNewsByCatCodeWeekly(String categoryCode) throws SQLException {
		try{
			CallableStatement clstm = con.prepareCall("{CALL s_count_news_by_catcode_weekly(?)}");
			clstm.setString(1, categoryCode);
			ResultSet rs = clstm.executeQuery();
			
			return rs;
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
	public void close() throws SQLException{
		con.close();
	}
	
	//add methods from backendDAO
	public ResultSet listRecentNews(int data) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement clstm = con.prepareCall("{call news_slider(?)}");
		clstm.setInt(1, data);
		ResultSet rs = clstm.executeQuery();
		//rs.next();
		return rs;
	}
	public void countView(int newid, int count) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement clstm = con.prepareCall("{call add_counter(?, ?)}");
		clstm.setInt(1, newid);
		clstm.setInt(2, count);
		clstm.executeQuery();
	}
}// End of class;










