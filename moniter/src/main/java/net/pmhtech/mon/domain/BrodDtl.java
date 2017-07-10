package net.pmhtech.mon.domain;

import java.io.Serializable;

public class BrodDtl implements Serializable{
	private String PLF_GBN;	// 플랫폼구분PRI
	private String PLF_USER_ID;	// 플랫폼 IDPRI
	private String PLF_NICK;	// 플렛폼 닉네임
	private String SORT;	// 정렬순서
	private String USE_YN;	// 사용구분
	private String COMMNET;	// 코멘트
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성자 IP
	
	public String getPLF_GBN() {
		return PLF_GBN;
	}
	public void setPLF_GBN(String pLF_GBN) {
		PLF_GBN = pLF_GBN;
	}
	public String getPLF_USER_ID() {
		return PLF_USER_ID;
	}
	public void setPLF_USER_ID(String pLF_USER_ID) {
		PLF_USER_ID = pLF_USER_ID;
	}
	public String getPLF_NICK() {
		return PLF_NICK;
	}
	public void setPLF_NICK(String pLF_NICK) {
		PLF_NICK = pLF_NICK;
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
