package net.pmhtech.sys.prop.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.prop.dao.SysPropPageDAO;
import net.pmhtech.sys.prop.domain.SysPropPage;
import net.pmhtech.sys.prop.service.SysPropPageService;

@Service("sysPropPageService")
public class SysPropPageServiceImpl implements SysPropPageService{

	@Resource(name="sysPropPageDAO")
	private SysPropPageDAO sysPropPageDAO;
	
	@Override
	public int createSysPropPage(Map<String, ?> paramMap) throws Exception {
		SysPropPage sysPropPage = new SysPropPage();
		BeanUtils.copyProperties(sysPropPage, paramMap);
		return sysPropPageDAO.update(sysPropPage);
	}

	@Override
	public int modifySysPropPage(Map<String, ?> paramMap) throws Exception {
		SysPropPage sysPropPage = new SysPropPage();
		BeanUtils.copyProperties(sysPropPage, paramMap);
		return sysPropPageDAO.update(sysPropPage);
	}

	@Override
	public int removeSysPropPage(Map<String, ?> paramMap) throws Exception {
		return sysPropPageDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysPropPageDAO.selectList(paramMap);
	}

}
