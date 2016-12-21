package net.pmhtech.sys.prop.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.prop.dao.SysPropTypeDAO;
import net.pmhtech.sys.prop.domain.SysPropType;
import net.pmhtech.sys.prop.service.SysPropTypeService;

@Service("sysPropTypeService")
public class SysPropTypeServiceImpl implements SysPropTypeService{

	@Resource(name="sysPropTypeDAO")
	private SysPropTypeDAO sysPropTypeDAO;
	
	@Override
	public int createSysPropType(Map<String, ?> paramMap) throws Exception {
		
		SysPropType sysPropType = new SysPropType();
		BeanUtils.copyProperties(sysPropType, paramMap);
		return sysPropTypeDAO.update(sysPropType);
	}

	@Override
	public int modifySysPropType(Map<String, ?> paramMap) throws Exception {
		SysPropType sysPropType = new SysPropType();
		BeanUtils.copyProperties(sysPropType, paramMap);
		return sysPropTypeDAO.update(sysPropType);
	}

	@Override
	public int removeSysPropType(Map<String, ?> paramMap) throws Exception {
		return sysPropTypeDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysPropTypeDAO.selectList(paramMap);
	}

}
