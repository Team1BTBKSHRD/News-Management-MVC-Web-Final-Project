package ModelDTO;

import java.io.Serializable;

public class Article implements Serializable {
	private int art_id;
	private String cat_code;
	private String user_info_code;
	private String art_title;
	private String art_path;
	private String art_desc;
	private String art_img;
	private String art_date;
	public int getArt_id() {
		return art_id;
	}
	public void setArt_id(int art_id) {
		this.art_id = art_id;
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
	public String getArt_title() {
		return art_title;
	}
	public void setArt_title(String art_title) {
		this.art_title = art_title;
	}
	public String getArt_path() {
		return art_path;
	}
	public void setArt_path(String art_path) {
		this.art_path = art_path;
	}
	public String getArt_desc() {
		return art_desc;
	}
	public void setArt_desc(String art_desc) {
		this.art_desc = art_desc;
	}
	public String getArt_img() {
		return art_img;
	}
	public void setArt_img(String art_img) {
		this.art_img = art_img;
	}
	public String getArt_date() {
		return art_date;
	}
	public void setArt_date(String art_date) {
		this.art_date = art_date;
	}

}
