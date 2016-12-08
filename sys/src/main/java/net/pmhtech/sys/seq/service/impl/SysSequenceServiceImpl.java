package net.pmhtech.sys.seq.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.file.domain.SysFile;
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
		String tablePK = sysSequenceDAO.selectMaxSequence(paramMap);
		return tablePK;
	}
}
