package net.pmhtech.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JsonObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {
	
	@RequestMapping(value="/errorStatus")
	@ResponseBody
	public Map<String,?> errorStatus(HttpServletResponse res) {
		
		
		Map<String, Object>returnMap = new HashMap<String,Object>(); 
		
		returnMap.put("code","DD");
	
		return returnMap;
	}
}
