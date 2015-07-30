/**
 * 
 */
package ModelDTO;

import java.io.Serializable;

/**
 * @author Pisal
 *
 */
public class categoryparent implements Serializable {
private int parent_id;
private String parent_desc;
public int getParent_id() {
	return parent_id;
}
public void setParent_id(int parent_id) {
	this.parent_id = parent_id;
}
public String getParent_desc() {
	return parent_desc;
}
public void setParent_desc(String parent_desc) {
	this.parent_desc = parent_desc;
}

}
