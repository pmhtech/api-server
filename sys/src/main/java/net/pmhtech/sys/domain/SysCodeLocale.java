package net.pmhtech.sys.domain;

import java.io.Serializable;

public class SysCodeLocale implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1817980316266201873L;
	
	private String COMPANY;	// 회사코드
	private String PRE_CD;	// 기준코드
	private String LOCALE_CD;	// 국가코드
	private String CODE;	// 코드
	private String CODE_NM;	// 코드명
	private String REF1;	// 참조1
	private String REF2;	// 참조2
	private String REF3;	// 참조3
	private String REF4;	// 참조4
	private String REF5;	// 참조5
	private String MEMO;	// 메모
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CHANGER;	// 변경자
	private String CHANGE_DT;	// 변경시각
	private String CHANGE_IP;	// 변경IP
	
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getPRE_CD() {
		return PRE_CD;
	}
	public void setPRE_CD(String pRE_CD) {
		PRE_CD = pRE_CD;
	}
	public String getLOCALE_CD() {
		return LOCALE_CD;
	}
	public void setLOCALE_CD(String lOCALE_CD) {
		LOCALE_CD = lOCALE_CD;
	}
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getCODE_NM() {
		return CODE_NM;
	}
	public void setCODE_NM(String cODE_NM) {
		CODE_NM = cODE_NM;
	}
	public String getREF1() {
		return REF1;
	}
	public void setREF1(String rEF1) {
		REF1 = rEF1;
	}
	public String getREF2() {
		return REF2;
	}
	public void setREF2(String rEF2) {
		REF2 = rEF2;
	}
	public String getREF3() {
		return REF3;
	}
	public void setREF3(String rEF3) {
		REF3 = rEF3;
	}
	public String getREF4() {
		return REF4;
	}
	public void setREF4(String rEF4) {
		REF4 = rEF4;
	}
	public String getREF5() {
		return REF5;
	}
	public void setREF5(String rEF5) {
		REF5 = rEF5;
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
