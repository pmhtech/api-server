package net.pmhtech.user.domain;

import java.io.Serializable;

public class UserMst implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1591969161250821079L;
	private String COMPANY;			//회사코드	Primary Key
	private String USER_ID;			//사용자ID	Primary Key
	private String AUTH_CD;			//사용자권한 [COM_000002]
	private String BIRTH_DT;		//생년월일	
	private String PASSWORD;		//비밀번호	
	private String KOR_LAST_NM;		//한글성명(성)	
	private String KOR_FIRST_NM;	//한글성명(이름)	
	private String LOCALE_CD;		//다국어설정	
	private String EMAIL;			//이메일	
	private String MOBILE;			//핸드폰	
	private String ENG_FIRST_NM;	//영문(이름)	
	private String ENG_LAST_NM;		//영문(성)	
	private String SALT;			//Salt키	
	private String STATUS;			//상태코드[RHR_000001]	
	private String CREATER;			//생성자	
	private String CREATE_DT;		//생성시각	
	private String CHANGER;			//변경자	
	private String CHANGE_DT;		//변경시각	
	private String CHANGE_IP;		//변경IP	
	
	public String getAUTH_CD() {
		return AUTH_CD;
	}
	public void setAUTH_CD(String aUTH_CD) {
		AUTH_CD = aUTH_CD;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getBIRTH_DT() {
		return BIRTH_DT;
	}
	public void setBIRTH_DT(String bIRTH_DT) {
		BIRTH_DT = bIRTH_DT;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getKOR_LAST_NM() {
		return KOR_LAST_NM;
	}
	public void setKOR_LAST_NM(String kOR_LAST_NM) {
		KOR_LAST_NM = kOR_LAST_NM;
	}
	public String getKOR_FIRST_NM() {
		return KOR_FIRST_NM;
	}
	public void setKOR_FIRST_NM(String kOR_FIRST_NM) {
		KOR_FIRST_NM = kOR_FIRST_NM;
	}
	public String getLOCALE_CD() {
		return LOCALE_CD;
	}
	public void setLOCALE_CD(String lOCALE_CD) {
		LOCALE_CD = lOCALE_CD;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}
	public String getENG_FIRST_NM() {
		return ENG_FIRST_NM;
	}
	public void setENG_FIRST_NM(String eNG_FIRST_NM) {
		ENG_FIRST_NM = eNG_FIRST_NM;
	}
	public String getENG_LAST_NM() {
		return ENG_LAST_NM;
	}
	public void setENG_LAST_NM(String eNG_LAST_NM) {
		ENG_LAST_NM = eNG_LAST_NM;
	}
	public String getSALT() {
		return SALT;
	}
	public void setSALT(String sALT) {
		SALT = sALT;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
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
