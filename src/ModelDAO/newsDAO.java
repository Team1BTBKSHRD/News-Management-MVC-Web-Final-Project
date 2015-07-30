package ModelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import Utilities.DatabaseConnection;

public abstract class newsDAO {
	private Connection con = null;
	private Exception err;

	public String getErrorDAO() {
		return err.getMessage();
	}

	public void raiseEvent(Exception e) {
		err = e;
	}

	public newsDAO() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (Exception e) {
			raiseEvent(e);
		}

	}
	abstract boolean insert(Object object);
	abstract boolean remove(Object object);
	abstract boolean update(Object object);
	abstract ArrayList retreive(Object object, String operation);
}