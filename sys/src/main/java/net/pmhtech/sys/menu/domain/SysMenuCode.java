package net.pmhtech.sys.menu.domain;

import java.io.Serializable;

public class SysMenuCode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3972064358195090136L;
	private String MENU_ID;		//메뉴ID	Primary Key
	private String PRE_CD;		//상위메뉴ID	
	private String CREATER;		//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//변경IP	
	
	
	public String getMENU_ID() {
		return MENU_ID;
	}
	public void setMENU_ID(String mENU_ID) {
		MENU_ID = mENU_ID;
	}
	public String getPRE_CD() {
		return PRE_CD;
	}
	public void setPRE_CD(String pRE_CD) {
		PRE_CD = pRE_CD;
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
