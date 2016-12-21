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
import net.pmhtech.sys.prop.service.SysPropTypeService;

@Api(value = "메뉴관리", description = "SysMenuController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/prop/types", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysPropTypeController {
	
	@Resource(name="sysPropTypeService")
	private SysPropTypeService sysPropTypeService;
   	
	@ApiOperation(value = "메뉴목록 조회", notes = "메뉴목록 조회")
	@RequestMapping(value="",method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @RequestParam("SYSTEM") String SYSTEM
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		
        List<Map<String,?>> sysPropTypes = sysPropTypeService.selectList(paramMap);
     
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysPropTypes", sysPropTypes);

        return returnMap;
    }
	
	
	
	@ApiOperation(value = "메뉴추가", notes = "메뉴추가")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}/{LOCALE_CD}",method = RequestMethod.POST)
	public Map<String,?> createSysPropType(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
			@ApiParam(value="메뉴명", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM,
			@ApiParam(value="언어코드", name="LOCALE_CD", required=true) @PathVariable("LOCALE_CD") String LOCALE_CD
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("SHORT_NM", SHORT_NM);
		paramMap.put("LOCALE_CD", LOCALE_CD);
	
			int count = sysPropTypeService.createSysPropType(paramMap); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}/{LOCALE_CD}/{SEQ}",method = RequestMethod.PUT)
	public Map<String,?> modifySysPropType(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
			@ApiParam(value="메뉴명", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM,
			@ApiParam(value="언어코드", name="LOCALE_CD", required=true) @PathVariable("LOCALE_CD") String LOCALE_CD,
			@ApiParam(value="일련번호", name="SEQ", required=true) @PathVariable("SEQ") String SEQ
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("SHORT_NM", SHORT_NM);
		paramMap.put("LOCALE_CD", LOCALE_CD);
		paramMap.put("SEQ", SEQ);
		int count = sysPropTypeService.modifySysPropType(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{SYSTEM}/{SHORT_NM}/{LOCALE_CD}/{SEQ}",method = RequestMethod.DELETE)
	public Map<String,?> removeSysPropType(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
			@ApiParam(value="메뉴명", name="SHORT_NM", required=true) @PathVariable("SHORT_NM") String SHORT_NM,
			@ApiParam(value="언어코드", name="LOCALE_CD", required=true) @PathVariable("LOCALE_CD") String LOCALE_CD,
			@ApiParam(value="일련번호", name="SEQ", required=true) @PathVariable("SEQ") String SEQ
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("SHORT_NM", SHORT_NM);
		paramMap.put("LOCALE_CD", LOCALE_CD);
		paramMap.put("SEQ", SEQ);
		int count = sysPropTypeService.removeSysPropType(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
}
