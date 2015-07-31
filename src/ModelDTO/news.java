/**
 * 
 */
package ModelDTO;

import java.io.Serializable;

/**
 * @author Pisal
 * 
 */
public class News implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int news_id;
	private String cat_code;
	private String user_info_code;
	private String news_title;
	private String news_desc;
	private String news_path;
	private String news_img;
	private String news_date;

	public News() {
	}

	public News(int news_id, String cat_code, String user_info_code,
			String news_title, String news_desc, String news_path,
			String news_img, String news_date) {
		super();
		this.news_id = news_id;
		this.cat_code = cat_code;
		this.user_info_code = user_info_code;
		this.news_title = news_title;
		this.news_desc = news_desc;
		this.news_path = news_path;
		this.news_img = news_img;
		this.news_date = news_date;
	}

	public int getNews_id() {
		return news_id;
	}

	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}

	public String getCat_code() {
		return cat_code;
	}

	public void setCat_code(String cat_code) {
		this.cat_code = cat_code;
	}

	public String getUser_info_code() {
		return user_info_code;
	}

	public void setUser_info_code(String user_info_code) {
		this.user_info_code = user_info_code;
	}

	public String getNews_title() {
		return news_title;
	}

	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}

	public String getNews_desc() {
		return news_desc;
	}

	public void setNews_desc(String news_desc) {
		this.news_desc = news_desc;
	}

	public String getNews_path() {
		return news_path;
	}

	public void setNews_path(String news_path) {
		this.news_path = news_path;
	}

	public String getNews_img() {
		return news_img;
	}

	public void setNews_img(String news_img) {
		this.news_img = news_img;
	}

	public String getNews_date() {
		return news_date;
	}

	public void setNews_date(String news_date) {
		this.news_date = news_date;
	}
}
