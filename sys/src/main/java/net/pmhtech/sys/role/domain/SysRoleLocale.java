package net.pmhtech.sys.role.domain;

import java.io.Serializable;

public class SysRoleLocale implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3875580186518789350L;
	private String ROLE_ID;	//메모	Primary Key
	private String ROLE_NM;	//권한명	
	private String LOCALE_CD;	//다국어코드	
	private String USE_YN;	//사용구분	
	private String MEMO;	//메모	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CHANGER;	//변경자	
	private String CHANGE_DT;	//변경시각	
	private String CHANGE_IP;	//변경IP
	
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getROLE_NM() {
		return ROLE_NM;
	}
	public void setROLE_NM(String rOLE_NM) {
		ROLE_NM = rOLE_NM;
	}
	public String getLOCALE_CD() {
		return LOCALE_CD;
	}
	public void setLOCALE_CD(String lOCALE_CD) {
		LOCALE_CD = lOCALE_CD;
	}
	public String getUSE_YN() {
		return USE_YN;
	}
	public void setUSE_YN(String uSE_YN) {
		USE_YN = uSE_YN;
	}
	public String getMEMO() {
		return MEMO;
	}
	public void setMEMO(String mEMO) {
		MEMO = mEMO;
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
	public String getCHANGER() {
		return CHANGER;
	}
	public void setCHANGER(String cHANGER) {
		CHANGER = cHANGER;
	}
	public String getCHANGE_DT() {
		return CHANGE_DT;
	}
	public void setCHANGE_DT(String cHANGE_DT) {
		CHANGE_DT = cHANGE_DT;
	}
	public String getCHANGE_IP() {
		return CHANGE_IP;
	}
	public void setCHANGE_IP(String cHANGE_IP) {
		CHANGE_IP = cHANGE_IP;
	}
	
}
