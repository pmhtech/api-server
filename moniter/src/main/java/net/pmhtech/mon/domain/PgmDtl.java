package net.pmhtech.mon.domain;

import java.io.Serializable;

public class PgmDtl implements Serializable{
	private String PGM_ID;	// 프로그램IDPRI
	private String PLF_GBN;	// 플랫폼PRI
	private String COMMNET;	// 코멘트
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성IP
}
