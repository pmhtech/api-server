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

@Api(value = "페이지 리소스관리 ", description = "SysPropPageController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/prop/pages", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysPropPageController {
	
	@Resource(name="sysPropPageService")
	private SysPropPageService sysPropPageService;
   	
	@ApiOperation(value = "메뉴목록 조회", notes = "메뉴목록 조회")
	@RequestMapping(value="",method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @RequestParam("SYSTEM") String SYSTEM
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		
        List<Map<String,?>> sysPropPages = sysPropPageService.selectList(paramMap);
     
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysPropPages", sysPropPages);

        return returnMap;
    }
	
	
	
	@ApiOperation(value = "메뉴추가", notes = "메뉴추가")
	@RequestMapping(value="/{MSG_TYPE}",method = RequestMethod.POST)
	public Map<String,?> createSysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="메시지 타입", name="MSG_TYPE", required=true) @PathVariable("MSG_TYPE") String MSG_TYPE
	   		) throws Exception {
	       
			
			Map<String,Object > paramMap = new HashMap<String,Object>();
			paramMap.put("MSG_TYPE", MSG_TYPE);
			int count = sysPropPageService.createSysPropPage(paramMap); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{MSG_TYPE}/{MSG_ID}",method = RequestMethod.PUT)
	public Map<String,?> modifySysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="메시지 타입", name="MSG_TYPE", required=true) @PathVariable("MSG_TYPE") String MSG_TYPE,
	   		@ApiParam(value="메시지 ID", name="MSG_ID", required=true) @PathVariable("MSG_ID") String MSG_ID
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("MSG_TYPE", MSG_TYPE);
		paramMap.put("MSG_ID", MSG_ID);
		int count = sysPropPageService.modifySysPropPage(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{MSG_TYPE}/{MSG_ID}",method = RequestMethod.DELETE)
	public Map<String,?> removeSysPropPage(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="메시지 타입", name="MSG_TYPE", required=true) @PathVariable("MSG_TYPE") String MSG_TYPE,
	   		@ApiParam(value="메시지 ID", name="MSG_ID", required=true) @PathVariable("MSG_ID") String MSG_ID
	   		) throws Exception {
	       
			
		Map<String,Object > paramMap = new HashMap<String,Object>();	
		paramMap.put("MSG_TYPE", MSG_TYPE);
		paramMap.put("MSG_ID", MSG_ID);
		int count = sysPropPageService.removeSysPropPage(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
}
