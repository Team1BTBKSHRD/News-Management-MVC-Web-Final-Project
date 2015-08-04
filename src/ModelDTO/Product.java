package ModelDTO;

import java.io.Serializable;

public class Product implements Serializable{
	private int pro_id;
	private String cat_code;
	private String user_info_code;
	private String pro_title;
	private String pro_desc;
	private String pro_path;
	private String pro_img;
	private String pro_price;
	private String pro_promotion;
	private String pro_date;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
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
	public String getPro_title() {
		return pro_title;
	}
	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}
	public String getPro_desc() {
		return pro_desc;
	}
	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}
	public String getPro_path() {
		return pro_path;
	}
	public void setPro_path(String pro_path) {
		this.pro_path = pro_path;
	}
	public String getPro_img() {
		return pro_img;
	}
	public void setPro_img(String pro_img) {
		this.pro_img = pro_img;
	}
	public String getPro_price() {
		return pro_price;
	}
	public void setPro_price(String pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_promotion() {
		return pro_promotion;
	}
	public void setPro_promotion(String pro_promotion) {
		this.pro_promotion = pro_promotion;
	}
	public String getPro_date() {
		return pro_date;
	}
	public void setPro_date(String pro_date) {
		this.pro_date = pro_date;
	}
}
