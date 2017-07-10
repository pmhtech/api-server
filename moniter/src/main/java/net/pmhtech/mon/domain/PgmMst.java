package net.pmhtech.mon.domain;

import java.io.Serializable;

public class PgmMst implements Serializable{
	private String PGM_ID;	// 프로그램 IDPRI
	private String PGM_NM;	// 프로그램명
	private String LOG_START_DT;	// 로그시작시각
	private String LOG_END_DT;	// 로그종료시각
	private String STATUS;	// 현재상태
	private String SORT;	// 정렬순서
	private String USE_YN;	// 사용시각
	private String COMMNET;	// 코멘트
	private String CREATER;	// 생성자
	private String CREATE_DT;	// 생성시각
	private String CREATE_IP;	// 생성IP
}
