package net.pmhtech.sys.role.domain;

import java.io.Serializable;

public class SysRolePage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8178658534771598096L;
	
	private String SYSTEM;	//시스템구분	Primary Key
	private String ROLE_ID;	//Role ID	Primary Key
	private String MENU_ID;	//메뉴코드	Primary Key
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//변경IP
	public String getSYSTEM() {
		return SYSTEM;
	}
	public void setSYSTEM(String sYSTEM) {
		SYSTEM = sYSTEM;
	}
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getMENU_ID() {
		return MENU_ID;
	}
	public void setMENU_ID(String mENU_ID) {
		MENU_ID = mENU_ID;
	}
	public String getCREATER() {
		return CREATER;
	}
	public void setCREATER(String cREATER) {
		CREATER = cREATER;
	}
	public String getCREATE_DT() {
		return CREATE_DT;
	}
	public void setCREATE_DT(String cREATE_DT) {
		CREATE_DT = cREATE_DT;
	}
	public String getCREATE_IP() {
		return CREATE_IP;
	}
	public void setCREATE_IP(String cREATE_IP) {
		CREATE_IP = cREATE_IP;
	}
}
