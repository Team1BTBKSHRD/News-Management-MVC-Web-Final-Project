package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import ModelDTO.news;
import Utilities.DatabaseConnection;

public class NewsDAO {
	Connection con;
	PreparedStatement pstm;
	public NewsDAO(){
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean insert(news n) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbnews(cat_code,user_info_code,news_title,news_desc,news_path,news_img,news_date) VALUES(?,?,?,?,?,?,?)");
			pstm.setString(1, n.getCat_code());
			pstm.setString(2, n.getUser_info_code());
			pstm.setString(3, n.getNews_title());
			pstm.setString(4, n.getNews_desc());
			pstm.setString(5, n.getNews_path());
			pstm.setString(6, n.getNews_img());
			pstm.setString(7, n.getNews_date());
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

	public boolean delete(int nid) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbnews WHERE news_id = ?;");
			pstm.setInt(1, nid);
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
	public boolean update(news n) throws SQLException{
		try {
			pstm = con.prepareStatement("UPDATE tbnews SET cat_code=?, SET user_info_code=?, SET news_title=?,SET news_desc=?,SET news_path=?,SET news_img=?,SET news_date=? WHERE news_id=?;");
			pstm.setString(1, n.getCat_code());
			pstm.setString(2, n.getUser_info_code());
			pstm.setString(3, n.getNews_title());
			pstm.setString(4, n.getNews_desc());
			pstm.setString(5, n.getNews_path());
			pstm.setString(6, n.getNews_img());
			pstm.setString(7, n.getNews_date());
			pstm.setInt(8, n.getNews_id());
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
	public ArrayList<news> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbnews");
			ArrayList<news> ns = new ArrayList<>();
			while(rs.next()){
				ns.add(new news(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			stm.close();
			rs.close();
			return ns;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
}
