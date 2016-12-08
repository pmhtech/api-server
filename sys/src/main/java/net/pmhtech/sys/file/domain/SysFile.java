package net.pmhtech.sys.file.domain;

import java.io.Serializable;

public class SysFile implements Serializable{
	
	private static final long serialVersionUID = -6868731187875739243L;
	
	private String COMPANY;	// 회사코드
	private int    SEQ;	// 일련번호
	private String TABLE_NAME;	// 테이블명
	private String FILE_ID1;	// 테이블 PK1
	private String FILE_ID2;	// 테이블 PK2
	private String FILE_ID3;	// 테이블 PK3
	private String FILE_ID4;	// 테이블 PK4
	private String FILE_ID5;	// 테이블 PK5
	private String TEMP_FILE_ID;	// 임시생성Key
	private String FILE_NAME;	// 업로드파일명
	private String FILE_EXT;	// 파일확장자
	private String FILE_ORI_NAME;	// 실제파일명
	private String FILE_PATH;	// 파일경로
	private long   FILE_SIZE;	// 파일크기
	private String CREATER;	// 생성자
	private String CHANGE_DT;	// 생성시각
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성 IP
	
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
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
	public String getFILE_ID1() {
		return FILE_ID1;
	}
	public void setFILE_ID1(String fILE_ID1) {
		FILE_ID1 = fILE_ID1;
	}
	public String getFILE_ID2() {
		return FILE_ID2;
	}
	public void setFILE_ID2(String fILE_ID2) {
		FILE_ID2 = fILE_ID2;
	}
	public String getFILE_ID3() {
		return FILE_ID3;
	}
	public void setFILE_ID3(String fILE_ID3) {
		FILE_ID3 = fILE_ID3;
	}
	public String getFILE_ID4() {
		return FILE_ID4;
	}
	public void setFILE_ID4(String fILE_ID4) {
		FILE_ID4 = fILE_ID4;
	}
	public String getFILE_ID5() {
		return FILE_ID5;
	}
	public void setFILE_ID5(String fILE_ID5) {
		FILE_ID5 = fILE_ID5;
	}
	public String getTEMP_FILE_ID() {
		return TEMP_FILE_ID;
	}
	public void setTEMP_FILE_ID(String tEMP_FILE_ID) {
		TEMP_FILE_ID = tEMP_FILE_ID;
	}
	public String getFILE_NAME() {
		return FILE_NAME;
	}
	public void setFILE_NAME(String fILE_NAME) {
		FILE_NAME = fILE_NAME;
	}
	public String getFILE_EXT() {
		return FILE_EXT;
	}
	public void setFILE_EXT(String fILE_EXT) {
		FILE_EXT = fILE_EXT;
	}
	public String getFILE_ORI_NAME() {
		return FILE_ORI_NAME;
	}
	public void setFILE_ORI_NAME(String fILE_ORI_NAME) {
		FILE_ORI_NAME = fILE_ORI_NAME;
	}
	public String getFILE_PATH() {
		return FILE_PATH;
	}
	public void setFILE_PATH(String fILE_PATH) {
		FILE_PATH = fILE_PATH;
	}
	public long getFILE_SIZE() {
		return FILE_SIZE;
	}
	public void setFILE_SIZE(long fILE_SIZE) {
		FILE_SIZE = fILE_SIZE;
	}
	public String getCREATER() {
		return CREATER;
	}
	public void setCREATER(String cREATER) {
		CREATER = cREATER;
	}
	public String getCHANGE_DT() {
		return CHANGE_DT;
	}
	public void setCHANGE_DT(String cHANGE_DT) {
		CHANGE_DT = cHANGE_DT;
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