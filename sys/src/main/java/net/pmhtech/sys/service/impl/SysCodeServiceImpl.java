package net.pmhtech.sys.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.service.SysCodeService;

@Service("sysCodeService")
public class SysCodeServiceImpl implements SysCodeService{

	@Resource(name = "sysCodeDAO")
	private SysCodeDAO sysCodeDAO;
	
	@Override
	public int insert(SysCode sysCode) throws Exception {
		return sysCodeDAO.insert(sysCode);
	}

	@Override
	public int update(SysCode sysCode) throws Exception {
		return sysCodeDAO.update(sysCode);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return sysCodeDAO.delete(paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sysCodeDAO.selectList(paramMap);
	}
	
	@Override
	public List<Map<String, ?>> selectGroupList(Map<String, ?> paramMap) throws Exception {
		return sysCodeDAO.selectGroupList(paramMap);
	}	

	@Override
	public Map<String,?> selectSysCodeGroup(Map<String, ?> paramMap) throws Exception {
		
		
		List<Map<String,?>> sysCodeList =sysCodeDAO.selectMaster(paramMap);
		List<Map<String,?>> tempList = new ArrayList<Map<String,?>>(); 
		Map<String,List<?>> sysCodeMap = new HashMap<String,List<?>>();
		
		int maxIdx = sysCodeList.size()-1;
		for( int i=0;i<=maxIdx;i++){
			
			Map<String,?> sysCode = sysCodeList.get(i);
			tempList.add(sysCode);
			
			String PRE_CD = sysCode.get("PRE_CD").toString();
			
			
			int nextIdx = maxIdx<i+1 ? -1 : i+1;
			String nextPRE_CD = i==0? PRE_CD : null;

			//nextPRE_CD를 가져온다.
			if(nextIdx!=-1){
				nextPRE_CD = sysCodeList.get(nextIdx).get("PRE_CD").toString();
			}
			
			if(nextPRE_CD==null || !PRE_CD.equals(nextPRE_CD)){
				sysCodeMap.put(PRE_CD,tempList);
				tempList= new ArrayList<Map<String,?>>();	
			}
		}
		return sysCodeMap;
	}
}
