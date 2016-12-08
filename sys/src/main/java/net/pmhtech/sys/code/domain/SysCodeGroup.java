package net.pmhtech.sys.code.domain;

import java.io.Serializable;

public class SysCodeGroup implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282658213379478605L;
	
	
	private String PRE_CD;	// 기준코드
	private String REF1_CONFIG;	// 참조1 설정
	private String REF2_CONFIG;	// 참조2 설정
	private String REF3_CONFIG;	// 참조3 설정
	private String REF4_CONFIG;	// 참조4 설정
	private String REF5_CONFIG;	// 참조5 설정
	private String USE_YN;	// 사용유무
	private String COM_YN;	// 공통코드 유무
	private String MEMO;	// 메모
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CHANGER;	// 변경자
	private String CHANGE_DT;	// 변경시각
	private String CHANGE_IP;	// 변경IP
	
	
	public String getPRE_CD() {
		return PRE_CD;
	}
	public void setPRE_CD(String pRE_CD) {
		PRE_CD = pRE_CD;
	}
	public String getREF1_CONFIG() {
		return REF1_CONFIG;
	}
	public void setREF1_CONFIG(String rEF1_CONFIG) {
		REF1_CONFIG = rEF1_CONFIG;
	}
	public String getREF2_CONFIG() {
		return REF2_CONFIG;
	}
	public void setREF2_CONFIG(String rEF2_CONFIG) {
		REF2_CONFIG = rEF2_CONFIG;
	}
	public String getREF3_CONFIG() {
		return REF3_CONFIG;
	}
	public void setREF3_CONFIG(String rEF3_CONFIG) {
		REF3_CONFIG = rEF3_CONFIG;
	}
	public String getREF4_CONFIG() {
		return REF4_CONFIG;
	}
	public void setREF4_CONFIG(String rEF4_CONFIG) {
		REF4_CONFIG = rEF4_CONFIG;
	}
	public String getREF5_CONFIG() {
		return REF5_CONFIG;
	}
	public void setREF5_CONFIG(String rEF5_CONFIG) {
		REF5_CONFIG = rEF5_CONFIG;
	}
	public String getUSE_YN() {
		return USE_YN;
	}
	public void setUSE_YN(String uSE_YN) {
		USE_YN = uSE_YN;
	}
	public String getCOM_YN() {
		return COM_YN;
	}
	public void setCOM_YN(String cOM_YN) {
		COM_YN = cOM_YN;
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
