package net.pmhtech.sys.seq.domain;

import java.io.Serializable;

public class SysSequence implements Serializable{

	private static final long serialVersionUID = 8267293634086533581L;

	private String COMPANY;	//회사코드	Primary Key
	private String YEAR;	//회계년도	
	private int SEQ;	//일련번호	Primary Key
	private String TABLE_NAME;	//테이블명	Primary Key
	private String TABLE_PK;	//테이블PK	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CREATE_IP;	//생성 IP	
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getTABLE_NAME() {
		return TABLE_NAME;
	}
	public void setTABLE_NAME(String tABLE_NAME) {
		TABLE_NAME = tABLE_NAME;
	}
	public String getTABLE_PK() {
		return TABLE_PK;
	}
	public void setTABLE_PK(String tABLE_PK) {
		TABLE_PK = tABLE_PK;
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
