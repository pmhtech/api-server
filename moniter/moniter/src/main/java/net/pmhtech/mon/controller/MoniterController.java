package net.pmhtech.mon.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.pmhtech.mon.service.MoniterService;

@Controller
@RequestMapping(value="/moniter")
public class MoniterController {

	@Resource(name="moniterService")
	private MoniterService moniterService;
	

	@RequestMapping(value="/live/logging", method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> liveLogging(HttpServletRequest request, HttpServletResponse response) throws Exception{
		

		moniterService.doLogging();
		
		return null;
    } 
    
}