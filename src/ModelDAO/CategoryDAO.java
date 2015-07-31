package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ModelDTO.Category;
import Utilities.DatabaseConnection;

/**
 * Class CategoryDAO
 * Use For interact between Java and DBMS(tbcategory). 
 */
public class CategoryDAO {
	Connection con; /* Connection object */
	PreparedStatement pstm; /* Prepared Statement object */

	/**
	 * Default Constructor
	 * Initialize object con by using class DatabaseConnection.
	 * */
	public CategoryDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method insert()
	 * Use for insert data into tbcategory
	 * @param category is an DTO object of class Category 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean insert(Category category) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("INSERT INTO tbcategory(cat_code, parent_id, cat_name, cat_desc) VALUES(?, ?, ?, ?);");
			
			/* Initialize parameters for pstm object */
			pstm.setString(1, category.getCat_code());
			pstm.setInt(2, category.getParent_id());
			pstm.setString(3, category.getCat_name());
			pstm.setString(4, category.getCat_desc());

			return pstm.executeUpdate() > 0 ? true : false; /* return true for success and false if fail */
			
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
	 * Method delete()
	 * Use for delete a record from tbcategory
	 * @param categoryId is ID of category 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean delete(int categoryId) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("DELETE FROM tbcategory WHERE cat_id = ?;");
			/* Initialize parameter for pstm object */
			pstm.setInt(1, categoryId);

			return pstm.executeUpdate() > 0 ? true : false; /* return true for success and false if fail */
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
	 * Method update()
	 * Use for update data into tbcategory
	 * @param category is an DTO object of class Category 
	 * @throws SQLException
	 * @return true for success and false for fail 
	 * */
	public boolean update(Category category) throws SQLException {
		try {
			/* Set PreparedStatement */
			pstm = con.prepareStatement("UPDATE tbcategory SET cat_code=?, parent_id=?, cat_name=?, cat_desc=? WHERE cat_id=?;");
			
			/* Initialize parameters for pstm object */
			pstm.setString(1, category.getCat_code());
			pstm.setInt(2, category.getParent_id());
			pstm.setString(3, category.getCat_name());
			pstm.setString(4, category.getCat_desc());
			pstm.setInt(5, category.getCat_id());
			System.out.println(pstm.toString());
			return pstm.executeUpdate() > 0 ? true : false; /* return true for success and false if fail */
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
	 * Method retrieve()
	 * Use for retrieve all data from tbcategory
	 * @throws SQLException
	 * @return ArrayList<Category>
	 * */
	public ArrayList<Category> retrieve() throws SQLException {
		Statement stm = null; /* Statement for Query Data from DBMS */
		ResultSet rs = null; /* rs stores all records of query */
		ArrayList<Category> categories = null; /* categories stores data of rs */
		try {
			stm = con.createStatement(); /* Initialize stm */
			rs = stm.executeQuery("SELECT * FROM tbcategory"); /* Execute query and assigns to rs */
			categories = new ArrayList<>(); /* Initialize categories */
			while (rs.next()) { /* Add every record into categories */
				categories.add(new Category(rs.getInt("cat_id"), 
											rs.getString("cat_code"),
											rs.getInt("parent_id"), 
											rs.getString("cat_name"), 
											rs.getString("cat_desc")));
			}
			
			return categories; /* return categories object */
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* Close stm, rs and con */
			stm.close();
			rs.close();
			con.close();
		}
		return null; /* Return null if error */
	}
	
}//End of class;











