package net.pmhtech.sys.role.domain;

import java.io.Serializable;

public class SysRole implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7066554341055471561L;
	
	private String ROLE_ID;	//일련번호	Primary Key
	private String MENU_ID;	//권한명	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//변경IP	
	
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
