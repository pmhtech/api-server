package net.pmhtech.sys.role.domain;

import java.io.Serializable;

public class SysRoleAuth implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -745629944156731969L;
	private String USER_AUTH;	//사용자권한	Primary Key
	private String ROLE_ID;		//권한ID	
	private String CREATER;		//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//변경IP	
	public String getUSER_AUTH() {
		return USER_AUTH;
	}
	public void setUSER_AUTH(String uSER_AUTH) {
		USER_AUTH = uSER_AUTH;
	}
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
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
