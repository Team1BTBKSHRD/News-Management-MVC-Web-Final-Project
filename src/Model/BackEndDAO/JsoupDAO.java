package Model.BackEndDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import Model.DTO.jobDTO;
import Model.DTO.scholarshipDTO;
import Utilities.Convertor;
import Utilities.DatabaseConnection;

public class JsoupDAO {
	private Connection con;

	public JsoupDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean insertJob(ArrayList<jobDTO> alistjdto) {
		java.sql.PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement("insert into tbmyjob(title,company,close_date,category,link) values(?,?,?,?,?)");
			for (jobDTO jobDTO : alistjdto) {
				pstm.setString(1, jobDTO.getTitle());
				pstm.setString(2, jobDTO.getCompany());
				pstm.setString(3, jobDTO.getCloseDate());
				pstm.setString(4, jobDTO.getCategory());
				pstm.setString(5, jobDTO.getLink());
				pstm.executeUpdate();
			}
			return true;
		} catch (Exception e) {

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public ResultSet retrievJobs() {
		try {
			Statement stm = con.createStatement();
			return stm.executeQuery("select * from tbmyjob");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	public boolean insertScholarship(ArrayList<scholarshipDTO> asdto) {
		java.sql.PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement("insert into tbscholarship(title,description,posted,deadline,link) values(?,?,?,?,?)");
			for (scholarshipDTO scholarshipDTO : asdto) {
				pstm.setString(1, scholarshipDTO.getTitle());
				pstm.setString(2, scholarshipDTO.getDescription());
				pstm.setString(3, scholarshipDTO.getPosted());
				pstm.setString(4, scholarshipDTO.getDeadline());
				pstm.setString(5, scholarshipDTO.getLink());
				pstm.executeUpdate();
			}
			return true;
		} catch (Exception e) {

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	public ResultSet retrievScholarship() {
		try {
			Statement stm = con.createStatement();
			return stm.executeQuery("select * from tbscholarship");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
	/*public static void main(String[] args) throws Exception {
		System.out.println(Convertor.convertResultSetIntoJSON(new JsoupDAO().retrievJobs()).toString());
	}*/
}
