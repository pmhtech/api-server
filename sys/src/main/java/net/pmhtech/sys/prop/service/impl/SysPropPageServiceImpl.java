package net.pmhtech.sys.prop.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
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
	public int createSysPropPage(Map<String, Object> paramMap, List<Map<String, ?>> listSysPageLocale)
			throws Exception {
		int count =0;
		
		sysPropPageDAO.delete(paramMap);
		for(Map<String,?> sysPropPageMap : listSysPageLocale){
			SysPropPage sysPropPage = new SysPropPage();
			BeanUtils.copyProperties(sysPropPage, sysPropPageMap);
			count +=sysPropPageDAO.insert(sysPropPage);
		}
		
		return count;
	}

	@Override
	public Map<String,List<?>> selectList(Map<String, ?> paramMap) throws Exception {
		
		Map<String,List<?>> resultMap = new HashMap<String,List<?>>(); 
		List<Map<String,?>> sysPropPageList = sysPropPageDAO.selectList(paramMap);
		List<Map<String,?>> tempList = new ArrayList<Map<String,?>>(); 
		
		
		int maxIdx = sysPropPageList.size()-1;
		for( int i=0;i<=maxIdx;i++){
			Map<String,?> sysCode = sysPropPageList.get(i);
			tempList.add(sysCode);
			
			String LOCALE_CD = sysCode.get("LOCALE_CD").toString();
			
			int nextIdx = maxIdx<i+1 ? -1 : i+1;
			String nextLOCALE_CD = i==0? LOCALE_CD : null;

			//nextPRE_CD를 가져온다.
			if(nextIdx!=-1){
				nextLOCALE_CD = sysPropPageList.get(nextIdx).get("LOCALE_CD").toString();
			}
			
			if(nextLOCALE_CD==null || !LOCALE_CD.equals(nextLOCALE_CD)){
				resultMap.put(LOCALE_CD,tempList);
				tempList= new ArrayList<Map<String,?>>();	
			}
			
		}
		return resultMap;
	}

}
