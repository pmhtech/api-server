package net.pmhtech.sys.code.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import net.pmhtech.sys.code.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.code.service.SysCodeLocaleService;

@Service("sysCodeLocaleService")
public class SysCodeLocaleServiceImpl implements SysCodeLocaleService{

	@Resource(name = "sysCodeLocaleDAO")
	private SysCodeLocaleDAO sysCodeLocaleDAO;

	@Override
	public Map<String,?> selectSysCodeMap(Map<String, ?> paramMap) throws Exception {
		
		
		List<Map<String,?>> sysCodeList =sysCodeLocaleDAO.selectSysCodeMap(paramMap);
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
