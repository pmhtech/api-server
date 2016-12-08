package net.pmhtech.sys.seq.domain;

import java.io.Serializable;

public class SysSequence implements Serializable{

	private static final long serialVersionUID = 8267293634086533581L;

	private String COMPANY;	// 회사코드
	private String TABLE_PK;	// 테이블 PK
	private String SEQUENCE;	// 테이블 SEQ
	private String TABLE_NAME;	// 테이블명
	private String PK1;	// PK1
	private String PK2;	// PK2
	private String PK3;	// PK3
	private String PK4;	// PK4
	private String PK5;	// PK5
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성IP
	
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getTABLE_PK() {
		return TABLE_PK;
	}
	public void setTABLE_PK(String tABLE_PK) {
		TABLE_PK = tABLE_PK;
	}
	public String getSEQUENCE() {
		return SEQUENCE;
	}
	public void setSEQUENCE(String sEQUENCE) {
		SEQUENCE = sEQUENCE;
	}
	public String getTABLE_NAME() {
		return TABLE_NAME;
	}
	public void setTABLE_NAME(String tABLE_NAME) {
		TABLE_NAME = tABLE_NAME;
	}
	public String getPK1() {
		return PK1;
	}
	public void setPK1(String pK1) {
		PK1 = pK1;
	}
	public String getPK2() {
		return PK2;
	}
	public void setPK2(String pK2) {
		PK2 = pK2;
	}
	public String getPK3() {
		return PK3;
	}
	public void setPK3(String pK3) {
		PK3 = pK3;
	}
	public String getPK4() {
		return PK4;
	}
	public void setPK4(String pK4) {
		PK4 = pK4;
	}
	public String getPK5() {
		return PK5;
	}
	public void setPK5(String pK5) {
		PK5 = pK5;
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
