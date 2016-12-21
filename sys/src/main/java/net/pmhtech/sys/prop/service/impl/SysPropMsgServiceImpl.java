package net.pmhtech.sys.prop.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.prop.dao.SysPropMsgDAO;
import net.pmhtech.sys.prop.domain.SysPropMsg;
import net.pmhtech.sys.prop.service.SysPropMsgService;

@Service("sysPropMsgService")
public class SysPropMsgServiceImpl implements SysPropMsgService{

	@Resource(name="sysPropMsgDAO")
	private SysPropMsgDAO sysPropMsgDAO;
	
	@Override
	public int createSysPropMsg(Map<String, ?> paramMap) throws Exception {
		SysPropMsg sysPropMsg = new SysPropMsg();
		BeanUtils.copyProperties(sysPropMsg, paramMap);
		return sysPropMsgDAO.insert(sysPropMsg);
	}

	@Override
	public int moidfySysPropMsg(Map<String, ?> paramMap) throws Exception {
		SysPropMsg sysPropMsg = new SysPropMsg();
		BeanUtils.copyProperties(sysPropMsg, paramMap);
		return sysPropMsgDAO.update(sysPropMsg);
	}

	@Override
	public int removeSysPropMsg(Map<String, ?> paramMap) throws Exception {
		return sysPropMsgDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysPropMsgDAO.selectList(paramMap);
	}

}
