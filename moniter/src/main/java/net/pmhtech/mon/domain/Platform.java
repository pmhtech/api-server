package net.pmhtech.mon.domain;

import java.io.Serializable;

public class Platform implements Serializable{
	private String PLF_GBN;	// 플랫폼구분PRI
	private String PLF_NM;	// 플랫폼명
	private String SORT;	// 정렬순서
	private String USE_YN;	// 사용유무
	private String COMMNET;	// 코멘트
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 변경IP
	
	public String getPLF_GBN() {
		return PLF_GBN;
	}
	public void setPLF_GBN(String pLF_GBN) {
		PLF_GBN = pLF_GBN;
	}
	public String getPLF_NM() {
		return PLF_NM;
	}
	public void setPLF_NM(String pLF_NM) {
		PLF_NM = pLF_NM;
	}
	public String getSORT() {
		return SORT;
	}
	public void setSORT(String sORT) {
		SORT = sORT;
	}
	public String getUSE_YN() {
		return USE_YN;
	}
	public void setUSE_YN(String uSE_YN) {
		USE_YN = uSE_YN;
	}
	public String getCOMMNET() {
		return COMMNET;
	}
	public void setCOMMNET(String cOMMNET) {
		COMMNET = cOMMNET;
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
