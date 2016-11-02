package net.pmhtech.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvertor {
	
	public static Map<String,Object> convertJsonToMap(String jsonString) throws Exception{
		Map<String,Object> result =   new ObjectMapper().readValue(jsonString, new TypeReference<HashMap<String,String>>(){});
		return result;
	}
	
	public static List<Map<String,Object>> convertJsonToList(String jsonString) throws Exception{
		List<Map<String,Object>> result = new ObjectMapper().readValue(jsonString, new TypeReference<ArrayList<HashMap<String,String>>>(){});
		return result;
	}
}