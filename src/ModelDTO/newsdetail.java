/**
 * 
 */
package ModelDTO;

/**
 * @author Pisal
 *
 */
public class newsdetail {
private int news_detail_id;
private int news_id;
public int getNews_detail_id() {
	return news_detail_id;
}
public void setNews_detail_id(int news_detail_id) {
	this.news_detail_id = news_detail_id;
}
public int getNews_id() {
	return news_id;
}
public void setNews_id(int news_id) {
	this.news_id = news_id;
}
public String getNew_content() {
	return new_content;
}
public void setNew_content(String new_content) {
	this.new_content = new_content;
}
private String new_content;
}
