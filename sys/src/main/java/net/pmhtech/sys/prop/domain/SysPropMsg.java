package net.pmhtech.sys.prop.domain;

import java.io.Serializable;

public class SysPropMsg implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7462728739793962618L;
	
	private String MSG_TYPE;	//메시지타입	Primary Key
	private String MSG_ID;	//메시지 아이디	Primary Key
	private String LOCALE_CD;	//다국어코드	
	private String MSG_TITLE;	//메시지 제목 	
	private String MSG_CONTENT;	//메시지 내용	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CHANGER;	//변경자	
	private String CHANGE_DT;	//변경시각	
	private String CHANGE_IP;	//변경IP	
	
	public String getMSG_TYPE() {
		return MSG_TYPE;
	}
	public void setMSG_TYPE(String mSG_TYPE) {
		MSG_TYPE = mSG_TYPE;
	}
	public String getMSG_ID() {
		return MSG_ID;
	}
	public void setMSG_ID(String mSG_ID) {
		MSG_ID = mSG_ID;
	}
	public String getLOCALE_CD() {
		return LOCALE_CD;
	}
	public void setLOCALE_CD(String lOCALE_CD) {
		LOCALE_CD = lOCALE_CD;
	}
	public String getMSG_TITLE() {
		return MSG_TITLE;
	}
	public void setMSG_TITLE(String mSG_TITLE) {
		MSG_TITLE = mSG_TITLE;
	}
	public String getMSG_CONTENT() {
		return MSG_CONTENT;
	}
	public void setMSG_CONTENT(String mSG_CONTENT) {
		MSG_CONTENT = mSG_CONTENT;
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
