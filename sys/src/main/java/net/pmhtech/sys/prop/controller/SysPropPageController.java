package net.pmhtech.sys.prop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.pmhtech.sys.menu.service.SysMenuCodeService;
import net.pmhtech.sys.menu.service.SysMenuService;
import net.pmhtech.sys.prop.service.SysPropPageService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "리소스관리(페이지) ", description = "SysPropPageController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/prop/pages", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysPropPageController {
	
	@Resource(name="sysPropPageService")
	private SysPropPageService sysPropPageService;
   	
	@ApiOperation(value = "페이지리소스 조회", notes = "페이지리소스 조회")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}",method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
    		@ApiParam(value="메뉴 ShortName", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		
        List<Map<String,?>> sysPropPages = sysPropPageService.selectList(paramMap);
     
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysPropPages", sysPropPages);

        return returnMap;
    }
	
	
	
	@ApiOperation(value = "페이지 리소스(추가/수정)", notes = "페이지 리소스(추가/수정)")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}",method = RequestMethod.POST)
	public Map<String,?> createSysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
    		@ApiParam(value="메뉴 ShortName", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM,
    		@ApiParam(value="sysPropPage", name="sysPropPage", required=true) @RequestParam("sysPropPage") String sysPropPage
	   		) throws Exception {
	       
			
			Map<String,Object > paramMap = new HashMap<String,Object>();
			
			int count = sysPropPageService.createSysPropPage(paramMap); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	/*
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}",method = RequestMethod.PUT)
	public Map<String,?> modifySysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
    		@ApiParam(value="시스템코드", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM,
    		@ApiParam(value="시스템코드", name="sysPropPage", required=true) @RequestParam("sysPropPage") String sysPropPage
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		int count = sysPropPageService.modifySysPropPage(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}",method = RequestMethod.DELETE)
	public Map<String,?> removeSysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
    		@ApiParam(value="시스템코드", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("SHORT_NM", SHORT_NM);
		int count = sysPropPageService.removeSysPropPage(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
	*/
}
