package Model.BackEndDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.DTO.News;
import Utilities.Convertor;
import Utilities.DatabaseConnection;
import Utilities.DateConverter;
import Utilities.Logger;
import Utilities.postgresAccount;

/**
 * Class NewsDAO Use For interact between Java and DBMS(tbnews).
 */
public class NewsDAO {
	Connection con; /* Connection object */
	PreparedStatement pstm; /* Prepared Statement object */

	/**
	 * Default Constructor Initialize object con by using class
	 * DatabaseConnection.
	 */
	public NewsDAO() {
		try {
			con = DatabaseConnection.getConnection();
			/*
			 * When index.jsp started, published_date will auto converted :
			 * pisal
			 */
			System.out.println("Date Time has bean converted : " + new DateConverter().convertStringToSqlDate());
			/* When index.jsp started, */
			int pcon = new postgresAccount().countUserPostgres();
			if (pcon > 80) {
				System.err.println("Connection is over connection : " + pcon);
				System.err.println(new postgresAccount().destroyConnection()+" Connection has been destroy");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method insert() Use for insert data into tbnews
	 * 
	 * @param news
	 *            is an DTO object of class News
	 * @throws SQLException
	 * @return true for success and false for fail
	 */
	public boolean insert(News news) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement(
					"INSERT INTO tbnews(cat_code, user_info_code, news_title, news_desc, news_path, news_img, news_date) VALUES(?, ?, ?, ?, ?, ?, ?);");
			/* Initialize parameters for pstm object */
			pstm.setString(1, news.getCat_code());
			pstm.setString(2, news.getUser_info_code());
			pstm.setString(3, news.getNews_title());
			pstm.setString(4, news.getNews_desc());
			pstm.setString(5, news.getNews_path());
			pstm.setString(6, news.getNews_img());
			pstm.setString(7, news.getNews_date());

			return pstm.executeUpdate() > 0 ? true
					: false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if insert unsuccessful */
	}

	/**
	 * Method delete() Use for delete a record from tbnews
	 * 
	 * @param newsId
	 *            is ID of News
	 * @throws SQLException
	 * @return true for success and false for fail
	 */
	public boolean delete(int newsId) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("DELETE FROM tbnews WHERE news_id = ?;");
			/* Initialize parameter for pstm object */
			pstm.setInt(1, newsId);

			return pstm.executeUpdate() > 0 ? true
					: false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if insert unsuccessful */
	}

	/**
	 * Method update() Use for update data into tbnews
	 * 
	 * @param news
	 *            is an DTO object of class News
	 * @throws SQLException
	 * @return true for success and false for fail
	 */
	public boolean update(News news) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement(
					"UPDATE tbnews SET cat_code=?, user_info_code=?, news_title=?, news_desc=?, news_path=?, news_img=?, news_date=? WHERE news_id=?;");
			/* Initialize parameters for pstm object */
			pstm.setString(1, news.getCat_code());
			pstm.setString(2, news.getUser_info_code());
			pstm.setString(3, news.getNews_title());
			pstm.setString(4, news.getNews_desc());
			pstm.setString(5, news.getNews_path());
			pstm.setString(6, news.getNews_img());
			pstm.setString(7, news.getNews_date());
			pstm.setInt(8, news.getNews_id());

			return pstm.executeUpdate() > 0 ? true
					: false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close pstm and con */
			pstm.close();
			con.close();
		}
		return false; /* return false if update unsuccessful */
	}

	/**
	 * Method retrieve() Use for retrieve all data from tbnews
	 * 
	 * @throws SQLException
	 * @return ArrayList<News>
	 */
	public ArrayList<News> retrieve() throws SQLException {
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		ArrayList<News> news = null; /* news stores data of rs */
		try {
			stm = con
					.createStatement(); /* Statement for Query Data from DBMS */
			rs = stm.executeQuery("SELECT * FROM tbnews"); /*
															 * rs stores all
															 * records of query
															 */
			news = new ArrayList<>(); /* news stores data of rs */
			while (rs.next()) { /* Add every record into news */
				news.add(new News(rs.getInt("news_id"), rs.getString("cat_code"), rs.getString("user_info_code"),
						rs.getString("news_title"), rs.getString("news_desc"), rs.getString("news_path"),
						rs.getString("news_img"), rs.getString("news_date")));
			}

			return news; /* return news object */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close stm, rs and con */
			stm.close();
			// rs.close();
			con.close();
		}
		return null; /* Return null if error */
	}

	/**
	 * Method retrieveRS() Use for retrieve all data from tbnews
	 * 
	 * @throws SQLException
	 * @return ResultSet
	 */
	public ResultSet retrieveRS() throws SQLException {
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		try {
			stm = con
					.createStatement(); /* Statement for Query Data from DBMS */
			rs = stm.executeQuery("SELECT * FROM tbnews"); /*
															 * rs stores all
															 * records of query
															 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * finally{ Close stm, rs and con stm.close(); rs.close(); con.close();
		 * }
		 */
		return null; /* Return null if error */
	}

	public ResultSet retrieveRS(String user_info_code) {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null; /* Statement for Query Data from DBMS */
		try {
			pstm = con.prepareStatement("SELECT * FROM tbnews where user_info_code=?");
			pstm.setString(1, user_info_code);
			ResultSet rs = pstm.executeQuery();
			/*
			 * int i=0; while(rs.next()){ i++; } System.out.println(i);
			 * rs.next(); System.out.println(rs.getString(1));
			 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet showartilcebyname(String full_name) {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null; /* Statement for Query Data from DBMS */
		try {
			pstm = con.prepareStatement("SELECT * FROM b_vw_news_scrape where full_name = ? ");
			pstm.setString(1, full_name);
			ResultSet rs = pstm.executeQuery();
			/*
			 * int i=0; while(rs.next()){ i++; } System.out.println(i);
			 * rs.next(); System.out.println(rs.getString(1));
			 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/* return number of users, categories, news */
	public ResultSet countOfRecords() throws SQLException {
		CallableStatement clstm = con.prepareCall("{call vw_count_news_cat_user}");
		ResultSet rs = clstm.executeQuery();
		return rs;
	}

	public ResultSet articlepost(String data) throws SQLException {
		// TODO Auto-generated method stub
		// CallableStatement clstm=con.prepareCall("{call
		// count_user_role_news(?)}");
		PreparedStatement clstm = con
				.prepareStatement("SELECT user_type,count FROM vw_user_role_count WHERE full_name=?");
		clstm.setString(1, data);
		ResultSet rs = clstm.executeQuery();
		return rs;
	}

	public ResultSet listRecentNews(int data) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement clstm = con.prepareCall("{call news_slider(?)}");
		clstm.setInt(1, data);
		ResultSet rs = clstm.executeQuery();
		rs.next();
		return rs;
	}

	// counting each article view
	public void countView(int newid, int count) throws SQLException {
		// TODO Auto-generated method stub
		CallableStatement clstm = con.prepareCall("{call add_counter(?, ?)}");
		clstm.setInt(1, newid);
		clstm.setInt(2, count);
		ResultSet rs = clstm.executeQuery();
	}

	/* EEEEEE **/
	public ResultSet listAllNews() throws SQLException {
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		try {
			stm = con.createStatement(); /*
											 * Statement for Query Data from DBMS
											 */
			rs = stm.executeQuery("select * from vw_show_all where news_status='true'"); /*
										 * rs stores all records of query
										 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * finally{ Close stm, rs and con stm.close(); rs.close(); con.close();
		 * }
		 */
		return null; /* Return null if error */
	}

	public ResultSet listAllNews(String parameter) {
		System.out.println(parameter);
		CallableStatement clstm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		try {
			clstm = con.prepareCall(
					"{call show_news_userinfo(?)}"); /*
														 * Statement for Query Data
														 * from DBMS
														 */
			clstm.setString(1, parameter);
			rs = clstm.executeQuery(); /*
										 * rs stores all records of query
										 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * finally{ Close stm, rs and con stm.close(); rs.close(); con.close();
		 * }
		 */
		return null; /* Return null if error */

	}

	public boolean updateNewstatus(int news_id, boolean news_status) throws SQLException {
		pstm = con.prepareStatement("update tbnews SET news_status = ? where news_id = ? ");

		pstm.setBoolean(1, news_status);
		pstm.setInt(2, news_id);
		System.out.println(news_id + " " + news_status);
		if (pstm.executeUpdate() > 0) {
			return true;
		}
		return false;
		// TODO Auto-generated method stub
		
	}
	/*
	 * public static void main(String[] args) throws Exception {
	 * System.out.println(Convertor.convertResultSetIntoJSON(new
	 * NewsDAO().articlepost("dap-news")).toString()); }
	 */

	public boolean insert(News news, String content,boolean draft,boolean news_status) throws SQLException {
		try {
			
			CallableStatement cstm = con.prepareCall("{call add_news_content(?, ?, ?, ?, ?, ?, ?, ? , ?,?)}");
			//pstm = con.prepareStatement("INSERT INTO tbnews(cat_code, user_info_code, news_title, news_desc, news_path, news_img, news_date) VALUES(?, ?, ?, ?, ?, ?, ?);");
			/* Initialize parameters for pstm object */
			cstm.setString(1, news.getCat_code());
			cstm.setString(2, news.getUser_info_code());
			cstm.setString(3, news.getNews_title());
			cstm.setString(4, news.getNews_desc());
			cstm.setString(5, news.getNews_path());
			cstm.setString(6, news.getNews_img());
			cstm.setString(7, news.getNews_date());
			cstm.setBoolean(8, draft);
			cstm.setBoolean(9, news_status);
			cstm.setString(10, content);
			System.out.println(cstm.toString());
			return cstm.executeUpdate() > 0 ? true
					: false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close pstm and con */
			//pstm.close();
			con.close();
		}
		return false; /* return false if insert unsuccessful */
	}
	/*public static void main(String[] args) throws SQLException, Exception {
		System.out.println(Convertor.convertResultSetIntoJSON(new NewsDAO().listAllNews()));
	}*/

	
	
	/*sarin list_news_draft*/
	public ResultSet list_News_draft(String full_name) {

		PreparedStatement pstm = null; /* Statement for Query Data from DBMS */
		try {
			pstm = con.prepareStatement("select * from b_vw_draft_news where full_name = ? and news_draft_status='true'");
			pstm.setString(1, full_name);
			ResultSet rs = pstm.executeQuery();
			/*
			 * int i=0; while(rs.next()){ i++; } System.out.println(i);
			 * rs.next(); System.out.println(rs.getString(1));
			 */
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
		
	}



	public boolean update_article(News news, String newsConDetail,boolean draft_status) throws SQLException {
	
		
		//1181,'B020501','Test','testupdate','http://www.facebook.com','Jellyfish.jpg','8/30/15 8:27 AM','testupdatecontent','f'
try {
			
			CallableStatement cstm = con.prepareCall("{call s_update_news_content( ? , ? , ? , ? , ? , ? , ? , ? , ? )}");
			//pstm = con.prepareStatement("INSERT INTO tbnews(cat_code, user_info_code, news_title, news_desc, news_path, news_img, news_date) VALUES(?, ?, ?, ?, ?, ?, ?);");
			cstm.setInt(1, news.getNews_id());
			cstm.setString(2, news.getCat_code());
			cstm.setString(3, news.getNews_title());
			cstm.setString(4, news.getNews_desc());
			cstm.setString(5, news.getNews_path());
			cstm.setString(6, news.getNews_img());
			cstm.setString(7, news.getNews_date());
			cstm.setString(8, newsConDetail);
			cstm.setBoolean(9, draft_status);
			
			System.out.println(cstm.toString());
			return cstm.executeUpdate() > 0 ? true
					: false; /* return true for success and false if fail */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close pstm and con */
			//pstm.close();
			con.close();
		}
		return false; 
	}
	/* Pisal */
	// Filter number of news in each category by sponsor
		public ResultSet filterbyTime(String sponsor, int i) {
			PreparedStatement pstm1=null;
			try {
				switch (i) {
				case 1: // Filter number of news in each category by sponsor
					pstm1 = con
							.prepareCall("{call s_admin_statistic_count_daily(?)}");
					break;
				case 2:
					pstm1 = con
							.prepareCall("{call s_admin_statistic_count_weekly(?)}");
					break;
				case 3:
					pstm1 = con
							.prepareCall("{call s_admin_statistic_count_monthly(?)}");
					break;
				case 4:
					pstm1 = con
							.prepareCall("{call s_admin_statistic_count_yearly(?)}");
					break;

				default:
					break;
				}
				pstm1.setString(1, sponsor);
				return pstm1.executeQuery();
			} catch (Exception e) {
				Logger.writeLogException(e, "filterbyTime", "NewsDAO");
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					Logger.writeLogException(e, "filterbyTime Connection",
							"NewsDAO");
				}
			}
			return null;
		}

		public ResultSet filterbyView(String sponsor) {
			try {
				pstm = con.prepareCall("{call s_admin_count_click(?)}");
				pstm.setString(1, sponsor);
				return pstm.executeQuery();
			} catch (Exception e) {
				Logger.writeLogException(e, "filterbyView", "NewsDAO");
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					Logger.writeLogException(e, "filterbyView Connection",
							"NewsDAO");
				}
			}
			return null;
		}
		/*
		 * @param : sponsor
		 * return number of count view, like, dislike for editor statistic chart
		 * */
		public ResultSet filterbyViewAccount(String sponsor) {
			try {
				pstm = con.prepareCall("{call s_admin_count_click(?)}");
				pstm.setString(1, sponsor);
				return pstm.executeQuery();
			} catch (Exception e) {
				Logger.writeLogException(e, "filterbyViewAccount", "NewsDAO");
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					Logger.writeLogException(e, "filterbyViewAccount Connection",
							"NewsDAO");
				}
			}
			return null;
		}
		public static void main(String[] args) throws Exception {
			try {
				PreparedStatement clstm=DatabaseConnection.getConnection().prepareCall("{call s_admin_statistic_count_weekly(?)}");
				clstm.setString(1, "sabay");
				ResultSet rs=clstm.executeQuery();
				while(rs.next()){
				System.out.println(rs.getString(1));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}// End of class;
