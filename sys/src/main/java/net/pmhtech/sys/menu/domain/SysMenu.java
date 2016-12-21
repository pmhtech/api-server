package net.pmhtech.sys.menu.domain;

import java.io.Serializable;

public class SysMenu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -455779432102828280L;
	private String COMPANY;		//회사코드	
	private String SYSTEM;		//시스템코드	Primary Key
	private String MENU_ID;		//메뉴ID	Primary Key
	private String PRE_MENU_ID;	//상위메뉴ID	
	private String MENU_NM;		//메뉴명	
	private int MENU_LVL;		//메뉴레벨	
	private String SHORT_NM;	//메뉴단축명	
	private String CLASS_NM;	//클래스명	
	private String WIDGET_NM;	//위젯명	
	private String MENU_AUTH;	//메뉴권한	
	private int SORT;			//정렬순서	
	private String USE_YN;		//사용유무	
	private String MEMO;		//메모	
	private String CREATER;		//생성자	
	private String CREATE_DT;	//생성시각	
	private String CHANGER;		//변경자	
	private String CHANGE_DT;	//변경시각	
	private String CHANGE_IP;	//변경IP	
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getSYSTEM() {
		return SYSTEM;
	}
	public void setSYSTEM(String sYSTEM) {
		SYSTEM = sYSTEM;
	}
	public String getMENU_ID() {
		return MENU_ID;
	}
	public void setMENU_ID(String mENU_ID) {
		MENU_ID = mENU_ID;
	}
	public String getPRE_MENU_ID() {
		return PRE_MENU_ID;
	}
	public void setPRE_MENU_ID(String pRE_MENU_ID) {
		PRE_MENU_ID = pRE_MENU_ID;
	}
	public String getMENU_NM() {
		return MENU_NM;
	}
	public void setMENU_NM(String mENU_NM) {
		MENU_NM = mENU_NM;
	}
	public int getMENU_LVL() {
		return MENU_LVL;
	}
	public void setMENU_LVL(int mENU_LVL) {
		MENU_LVL = mENU_LVL;
	}
	public String getSHORT_NM() {
		return SHORT_NM;
	}
	public void setSHORT_NM(String sHORT_NM) {
		SHORT_NM = sHORT_NM;
	}
	public String getCLASS_NM() {
		return CLASS_NM;
	}
	public void setCLASS_NM(String cLASS_NM) {
		CLASS_NM = cLASS_NM;
	}
	public String getWIDGET_NM() {
		return WIDGET_NM;
	}
	public void setWIDGET_NM(String wIDGET_NM) {
		WIDGET_NM = wIDGET_NM;
	}
	public String getMENU_AUTH() {
		return MENU_AUTH;
	}
	public void setMENU_AUTH(String mENU_AUTH) {
		MENU_AUTH = mENU_AUTH;
	}
	public int getSORT() {
		return SORT;
	}
	public void setSORT(int sORT) {
		SORT = sORT;
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
