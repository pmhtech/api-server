package net.pmhtech.sys.seq.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.file.domain.SysFile;
import net.pmhtech.sys.role.domain.SysRole;
import net.pmhtech.sys.seq.dao.SysSequenceDAO;
import net.pmhtech.sys.seq.domain.SysSequence;
import net.pmhtech.sys.seq.service.SysSequenceService;


@Service("sysSequenceService")
public class SysSequenceServiceImpl implements SysSequenceService{

	
	@Resource(name="sysSequenceDAO")
	private SysSequenceDAO sysSequenceDAO;
	@Override
	public String getSequence(SysFile sysFile) throws Exception {
		
		SysSequence sysSequenceVO = new SysSequence();
		sysSequenceVO.setCOMPANY(sysFile.getCOMPANY());
		sysSequenceVO.setTABLE_NAME("SYS_FILE");
		sysSequenceVO.setCREATER(sysFile.getCREATER());
		sysSequenceVO.setCREATE_IP(sysFile.getCREATE_IP());
		sysSequenceDAO.insert(sysSequenceVO);
		
		Map<String, ?> paramMap= BeanUtils.describe(sysSequenceVO);
		String tablePK = null;//sysSequenceDAO.selectMaxSequence(paramMap);
		return tablePK;
	}
	@Override
	public String getSequence(SysRole sysRole) throws Exception {
		SysSequence sysSequenceVO = new SysSequence();
		sysSequenceVO.setCOMPANY("000000");
		sysSequenceVO.setTABLE_NAME("SYS_FILE");
		sysSequenceVO.setCREATER(sysRole.getCREATER());
		sysSequenceVO.setCREATE_IP(sysRole.getCREATE_IP());
		
		String tablePK = sysSequenceDAO.insert(sysSequenceVO)+"";
		System.out.println(tablePK);
		
		int i=0;
		
		if(i==0){
			throw new Exception(tablePK);
		}
		
		return tablePK;
		
		
	}
}
