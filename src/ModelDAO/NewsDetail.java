package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ModelDTO.NewDetail;
import Utilities.DatabaseConnection;

public class NewsDetail {
	Connection con=null;
	PreparedStatement pstm;
	public NewsDetail(){
		try {
			con=DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean insert(NewDetail nd) throws SQLException{
		try {
			pstm = con.prepareStatement("INSERT INTO tbuser(news_id,news_content) VALUES(?,?)");
			pstm.setInt(1, nd.getNews_id());
			pstm.setString(2, nd.getNew_content());
			
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
	public boolean delete(int ndid) throws SQLException{
		try {
			pstm = con.prepareStatement("DELETE FROM tbuser WHERE news_detail_id = ?;");
			pstm.setInt(1, ndid);
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
	public boolean update(NewDetail nd) throws SQLException{
		try {
			pstm = con.prepareStatement("UPDATE tbnewsdetail SET news_id=?,SET news_content=? WHERE news_detail_id=?;");
			pstm.setInt(1, nd.getNews_id());
			pstm.setString(2, nd.getNew_content());
			pstm.setInt(3, nd.getNews_detail_id());			
			
		
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
	public ArrayList<NewDetail> retrive() throws SQLException{
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM tbnewsdetail");
			ArrayList<NewDetail> nds = new ArrayList<>();
			while(rs.next()){
				nds.add(new NewDetail(rs.getInt(0),rs.getInt(1),rs.getString(2)));
			}
			stm.close();
			rs.close();
			return nds;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		return null;
	}
	
}
