package net.pmhtech.sys.prop.domain;

import java.io.Serializable;

public class SysPropPage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5947301345531871118L;
	
	private String SYSTEM;	//시스템코드	Primary Key
	private String SHORT_NM;	//메뉴ID	Primary Key
	private String LOCALE_CD;	//메뉴ID	Primary Key
	private int SEQ;	//SEQ	Primary Key
	private String DOM_QRY;	//DomQuery	
	private String COMP_XTYPE;	//Property Type	
	private String PROP_TYPE;	//Property Type	
	private String PROP_VALUEE;	//Property Value	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CHANGER;	//변경자	
	private String CHANGE_DT;	//변경시각	
	private String CHANGE_IP;	//변경IP	
	
	public String getSYSTEM() {
		return SYSTEM;
	}
	public void setSYSTEM(String sYSTEM) {
		SYSTEM = sYSTEM;
	}
	public String getSHORT_NM() {
		return SHORT_NM;
	}
	public void setSHORT_NM(String sHORT_NM) {
		SHORT_NM = sHORT_NM;
	}
	public String getLOCALE_CD() {
		return LOCALE_CD;
	}
	public void setLOCALE_CD(String lOCALE_CD) {
		LOCALE_CD = lOCALE_CD;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getDOM_QRY() {
		return DOM_QRY;
	}
	public void setDOM_QRY(String dOM_QRY) {
		DOM_QRY = dOM_QRY;
	}
	public String getCOMP_XTYPE() {
		return COMP_XTYPE;
	}
	public void setCOMP_XTYPE(String cOMP_XTYPE) {
		COMP_XTYPE = cOMP_XTYPE;
	}
	public String getPROP_TYPE() {
		return PROP_TYPE;
	}
	public void setPROP_TYPE(String pROP_TYPE) {
		PROP_TYPE = pROP_TYPE;
	}
	public String getPROP_VALUEE() {
		return PROP_VALUEE;
	}
	public void setPROP_VALUEE(String pROP_VALUEE) {
		PROP_VALUEE = pROP_VALUEE;
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
