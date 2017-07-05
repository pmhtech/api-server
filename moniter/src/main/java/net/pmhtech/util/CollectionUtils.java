package net.pmhtech.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionUtils {

	public static List<Map<String,?>> getMatchedKey(List<Map<String,?>> paramList, String key,String value){
	
		List<Map<String,?>> findList = new ArrayList<Map<String,?>>();
		
		Iterator<Map<String,?>> iter = paramList.iterator();
		
		while(iter.hasNext()){
			Map<String,?> hashMap = iter.next();
			if(hashMap.get(key).equals(value)){
				findList.add(hashMap);
			}
		}
		return findList;
		
	}
}
