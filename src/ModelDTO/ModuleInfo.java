package ModelDTO;

import java.io.Serializable;

public class ModuleInfo implements Serializable{
	private int module_id;
	private String modult_cat_name;
	private String modult_name;
	private String module_type;
	private String module_code;
	public int getModule_id() {
		return module_id;
	}
	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}
	public String getModult_cat_name() {
		return modult_cat_name;
	}
	public void setModult_cat_name(String modult_cat_name) {
		this.modult_cat_name = modult_cat_name;
	}
	public String getModult_name() {
		return modult_name;
	}
	public void setModult_name(String modult_name) {
		this.modult_name = modult_name;
	}
	public String getModule_type() {
		return module_type;
	}
	public void setModule_type(String module_type) {
		this.module_type = module_type;
	}
	public String getModule_code() {
		return module_code;
	}
	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}
}
