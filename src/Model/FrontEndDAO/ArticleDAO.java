package Model.FrontEndDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utilities.DatabaseConnection;

public class ArticleDAO {
	Connection con; /* Connection object */

	public ArticleDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Boolean checkArticle(int news_id) throws SQLException,
			ClassNotFoundException {
		try {
			PreparedStatement clstm = con
					.prepareCall("Select news_id from tbnewsdetail where news_id = ?");
			clstm.setInt(1, news_id);
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

	public ResultSet getArticle(int news_id) throws SQLException,
			ClassNotFoundException {
		try {
			PreparedStatement clstm = con
					.prepareCall("select * from s_vw_news_content_ui where news_id = ?");
			clstm.setInt(1, news_id);
			ResultSet rs=clstm.executeQuery();
			rs.next();
			return rs;
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			con.close();
		}
		return null;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		//System.out.println(21212);
	 System.out.println(new ArticleDAO().getArticle(724));
	//	System.out.println(new ArticleDAO().checkArticle(724));
	}
}// End of class;

