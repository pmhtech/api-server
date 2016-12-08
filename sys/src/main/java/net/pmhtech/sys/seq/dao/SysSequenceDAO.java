package net.pmhtech.sys.seq.dao;

import java.util.Map;

import net.pmhtech.sys.seq.domain.SysSequence;


public interface SysSequenceDAO {
	
	public int insert(SysSequence sysSequence) throws Exception;
	public String selectMaxSequence(Map<String,?> paramMap) throws Exception;

}
