package net.pmhtech.broadcast.log.domain;

import java.io.Serializable;

public class LogMst implements Serializable {
	private String PGM_ID;	// 프로그램 IDPRI
	private String LOG_TIME;	// 로그시각
	private String PLF_GBN;	// 플랫폼 구분PRI
	private String PLF_USER_ID;	// 플랫폼 사용자ID
	private String TITLE; //방송제목
	private String SNAPSHOT;	// 스냅샷경로
	private String VIEW_CNT;	// 시청자수
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성IP
	
	
	
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getPGM_ID() {
		return PGM_ID;
	}
	public void setPGM_ID(String pGM_ID) {
		PGM_ID = pGM_ID;
	}
	public String getLOG_TIME() {
		return LOG_TIME;
	}
	public void setLOG_TIME(String lOG_TIME) {
		LOG_TIME = lOG_TIME;
	}
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
	public String getSNAPSHOT() {
		return SNAPSHOT;
	}
	public void setSNAPSHOT(String sNAPSHOT) {
		SNAPSHOT = sNAPSHOT;
	}
	public String getVIEW_CNT() {
		return VIEW_CNT;
	}
	public void setVIEW_CNT(String vIEW_CNT) {
		VIEW_CNT = vIEW_CNT;
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
