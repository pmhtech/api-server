package net.pmhtech.sys.prop.domain;

import java.io.Serializable;

public class SysPropPage implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3684217255775181708L;
	private String SYSTEM;	//시스템코드	Primary Key
	private String SHORT_NM;	//메뉴ID	Primary Key
	private String LOCALE_CD;	//메뉴ID	Primary Key
	private int SEQ;	//SEQ	Primary Key
	private String MASTER_DOM;	//DomQuery	
	private String DETAIL_DOM;	//DomQuery	
	private String DOM_QRY;	//DomQuery	
	private String DOM_LABEL;	//Property Type	
	private String DOM_TYPE;	//Property Type	
	private String DOM_PROPS;	//Property Value	
	private int SORT;	//	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//변경IP	
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
	public String getMASTER_DOM() {
		return MASTER_DOM;
	}
	public void setMASTER_DOM(String mASTER_DOM) {
		MASTER_DOM = mASTER_DOM;
	}
	public String getDETAIL_DOM() {
		return DETAIL_DOM;
	}
	public void setDETAIL_DOM(String dETAIL_DOM) {
		DETAIL_DOM = dETAIL_DOM;
	}
	public String getDOM_QRY() {
		return DOM_QRY;
	}
	public void setDOM_QRY(String dOM_QRY) {
		DOM_QRY = dOM_QRY;
	}
	public String getDOM_LABEL() {
		return DOM_LABEL;
	}
	public void setDOM_LABEL(String dOM_LABEL) {
		DOM_LABEL = dOM_LABEL;
	}
	public String getDOM_TYPE() {
		return DOM_TYPE;
	}
	public void setDOM_TYPE(String dOM_TYPE) {
		DOM_TYPE = dOM_TYPE;
	}
	public String getDOM_PROPS() {
		return DOM_PROPS;
	}
	public void setDOM_PROPS(String dOM_PROPS) {
		DOM_PROPS = dOM_PROPS;
	}
	public int getSORT() {
		return SORT;
	}
	public void setSORT(int sORT) {
		SORT = sORT;
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
