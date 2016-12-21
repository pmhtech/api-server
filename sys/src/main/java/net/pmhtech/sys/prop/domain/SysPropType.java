package net.pmhtech.sys.prop.domain;

import java.io.Serializable;

public class SysPropType implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2389190803777076195L;
	
	private String COMP_XTYPE;	//Component XType	Primary Key
	private String XTYPE_NM;	//XType 설명	
	private String CHANGE_FUNC;	//Label 변경함수	
	private String DEFAULT_PROP;	//필드 기본속성값	
	private String CREATER;	//생성자	
	private String CREATE_DT;	//생성시각	
	private String CHANGER;	//변경자	
	private String CHANGE_DT;	//변경시각	
	private String CHANGE_IP;	//변경IP
	
	public String getCOMP_XTYPE() {
		return COMP_XTYPE;
	}
	public void setCOMP_XTYPE(String cOMP_XTYPE) {
		COMP_XTYPE = cOMP_XTYPE;
	}
	public String getXTYPE_NM() {
		return XTYPE_NM;
	}
	public void setXTYPE_NM(String xTYPE_NM) {
		XTYPE_NM = xTYPE_NM;
	}
	public String getCHANGE_FUNC() {
		return CHANGE_FUNC;
	}
	public void setCHANGE_FUNC(String cHANGE_FUNC) {
		CHANGE_FUNC = cHANGE_FUNC;
	}
	public String getDEFAULT_PROP() {
		return DEFAULT_PROP;
	}
	public void setDEFAULT_PROP(String dEFAULT_PROP) {
		DEFAULT_PROP = dEFAULT_PROP;
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
