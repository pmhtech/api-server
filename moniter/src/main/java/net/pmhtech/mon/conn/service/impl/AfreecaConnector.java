package net.pmhtech.mon.conn.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import net.pmhtech.mon.conn.service.AbstractConnector;
import net.pmhtech.util.JsonConvertor;

@Service("afreecaConnector")
public class AfreecaConnector implements AbstractConnector{

	@Override
	public URL getURL(String keyword) throws Exception {

		String callback="callbackFunc"; //JsonP callback 
		String m ="liveSearch"; //검색카테고리 (실시간);
		String v="1.0"; // 아프리카 API 버
		String szType="json"; //결과값 데이터 타입
		String szOrder = ""; //정렬순서
		String nPageNo = "1"; //결과값 페이지 인덱
		String nListCnt ="50"; //페이징사이즈
		String szKeyword= keyword; //검색어
		String onlyParent = "1"; //무슨뜻인지모름
		
		
		
		StringBuilder urlBuilder = new StringBuilder("http://sch.afreecatv.com/api.php");
		urlBuilder.append("?" + URLEncoder.encode("callback","UTF-8") + "="+callback);
		urlBuilder.append("&" + URLEncoder.encode("m","UTF-8") + "="+m);
		urlBuilder.append("&" + URLEncoder.encode("v","UTF-8") + "="+szType); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szType","UTF-8") + "="+v); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szOrder","UTF-8") + "="+szOrder);
		urlBuilder.append("&" + URLEncoder.encode("nPageNo","UTF-8") + "="+nPageNo); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("nListCnt","UTF-8") + "="+nListCnt); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szKeyword","UTF-8") + "="+szKeyword); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("onlyParent","UTF-8") + "="+onlyParent); //JSONP callback
		
	
		URL url = new URL(urlBuilder.toString());
		
		return url;
	}

	@Override
	public List<Map<String, Object>> getRawDatas(String keyword) throws Exception{
	
		URL url = this.getURL(keyword);
		BufferedReader rd  = null;
		HttpURLConnection conn =null;
		StringBuilder sb = new StringBuilder();
		List<Map<String, Object>> returnList= new ArrayList<Map<String,Object>>();
		
		try{
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json;charset=UTF-8"); 
	        
	        System.out.println("Response code: " + conn.getResponseCode());
	        rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	        
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
	        }
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        
	       String jsonStr = sb.substring(13,sb.length()-1);
	       JSONObject jsonObj = (JSONObject) new JSONParser().parse(jsonStr);
	      // var realbroad =jsonObj.get("REAL_BROAD");
	       returnList = JsonConvertor.convertJsonToList(jsonObj.get("REAL_BROAD").toString());

	      
	        
		}finally{
			rd.close();
	        conn.disconnect();	
		}
        
		return returnList;
	}

	@Override
	public Map<String, ?> getLiveDatas(String keyword) throws Exception {

		List<Map<String,Object>> rawDataList = this.getRawDatas(keyword);
		
		return null;
	}
	
	

}
