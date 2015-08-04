/**
 * 
 */
package ModelDTO;

import java.io.Serializable;

/**
 * @author Pisal
 *
 */
public class User implements Serializable {
	private int User_id;
	private String User_name;
	private String User_pass;
	private String User_type;
public User(){}
	public User(int User_id, String User_name, String User_pass,
			String User_type) {
		super();
		this.User_id = User_id;
		this.User_name = User_name;
		this.User_pass = User_pass;
		this.User_type = User_type;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int User_id) {
		this.User_id = User_id;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String User_name) {
		this.User_name = User_name;
	}

	public String getUser_pass() {
		return User_pass;
	}

	public void setUser_pass(String User_pass) {
		this.User_pass = User_pass;
	}

	public String getUser_type() {
		return User_type;
	}

	public void setUser_type(String User_type) {
		this.User_type = User_type;
	}
}
