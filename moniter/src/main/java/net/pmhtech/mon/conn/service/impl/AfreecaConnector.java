package net.pmhtech.mon.conn.service.impl;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import net.pmhtech.mon.conn.service.AbstractConnector;
import net.pmhtech.mon.domain.LogMst;
import net.pmhtech.util.JsonConvertor;

@Service("afreecaConnector")
public class AfreecaConnector implements AbstractConnector{

	@Override
	public URL getURL(String keyword) throws Exception {

		String callback="callBackFunc"; //JsonP callback 
		String m ="liveSearch"; //검색카테고리 (실시간);
		String v="1.0"; // 아프리카 API 버
		String szType="json"; //결과값 데이터 타입
		String szOrder = ""; //정렬순서
		String nPageNo = "1"; //결과값 페이지 인덱
		String nListCnt ="200"; //페이징사이즈
		String szKeyword= keyword; //검색어
		String onlyParent = "1"; //무슨뜻인지모름
		
		
		
		StringBuilder urlBuilder = new StringBuilder("http://sch.afreecatv.com/api.php");
		urlBuilder.append("?" + URLEncoder.encode("callback","UTF-8") + "="+URLEncoder.encode(callback,"UTF-8"));
		urlBuilder.append("&" + URLEncoder.encode("m","UTF-8") + "="+URLEncoder.encode(m,"UTF-8"));
		urlBuilder.append("&" + URLEncoder.encode("v","UTF-8") + "="+URLEncoder.encode(v,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szType","UTF-8") + "="+URLEncoder.encode(szType,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szOrder","UTF-8") + "="+URLEncoder.encode(szOrder,"UTF-8"));
		urlBuilder.append("&" + URLEncoder.encode("nPageNo","UTF-8") + "="+URLEncoder.encode(nPageNo,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("nListCnt","UTF-8") + "="+URLEncoder.encode(nListCnt,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("szKeyword","UTF-8") + "="+URLEncoder.encode(szKeyword,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + URLEncoder.encode("onlyParent","UTF-8") + "="+URLEncoder.encode(onlyParent,"UTF-8")); //JSONP callback
		urlBuilder.append("&" + "_="+"1499437202662"); //JSONP callback
		
		
		//http://sch.afreecatv.com/api.php?callback=callBackFunc&m=liveSearch&v=1.0&szType=json&szOrder=&nPageNo=1&nListCnt=50&szKeyword=%EC%8A%A4%ED%83%80&onlyParent=1&_=1499437202662
	
		System.out.println(urlBuilder.toString());
		URL url = new URL(urlBuilder.toString());
		
		return url;
	}

	@Override
	public List<LogMst> getRawDatas(String keyword) throws Exception{
	
		URL url = this.getURL(keyword);
		BufferedReader rd  = null;
		HttpURLConnection conn =null;
		StringBuilder sb = new StringBuilder();
		List<LogMst> returnList= new ArrayList<LogMst>();
		
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
	       JSONObject jsonObj = new JSONObject(jsonStr);

	       
	       
	       // 본방송 리스트
	       JSONArray realBroads = jsonObj.getJSONArray("REAL_BROAD");
	       
	       
	       
	       SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	       Calendar cal = Calendar.getInstance();
	       String logTime = formatter.format(cal.getTime());
	       for(int i=0;i<realBroads.length();i++){
	    	   
	    	  JSONObject temp = (JSONObject) realBroads.get(i);
	    	  LogMst tempLogMst = new LogMst();
	    	  
	    	  tempLogMst.setPGM_ID("1");
	    	  tempLogMst.setPLF_GBN("1");
	    	  tempLogMst.setLOG_TIME(logTime);
	    	  tempLogMst.setTITLE(temp.get("broad_title").toString());
	    	  tempLogMst.setPLF_USER_ID(temp.get("user_id").toString());
	    	  tempLogMst.setVIEW_CNT(temp.get("total_view_cnt").toString());
	    	  tempLogMst.setSNAPSHOT(temp.get("sn_url").toString());
	    	  returnList.add(tempLogMst);
	       }
	   

	       
	       //중계방 또는 도방
	      
	        
		}finally{
			rd.close();
	        conn.disconnect();	
		}
        
		return returnList;
	}

	@Override
	public Map<String, ?> getLiveDatas(String keyword) throws Exception {

		List<LogMst> rawDataList = this.getRawDatas(keyword);
		
		return null;
	}
	
	

}
