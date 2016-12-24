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
import net.pmhtech.util.JsonConvertor;

@Api(value = "XType 관리", description = "SysPropTypeController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/prop/types", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysPropTypeController {
	
	@Resource(name="sysPropTypeService")
	private SysPropTypeService sysPropTypeService;
   	
	@ApiOperation(value = "메뉴목록 조회", notes = "메뉴목록 조회")
	@RequestMapping(value="",method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		
        List<Map<String,?>> sysPropTypes = sysPropTypeService.selectList(paramMap);
     
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysPropTypes", sysPropTypes);

        return returnMap;
    }
	
	
	
	@ApiOperation(value = "메뉴추가", notes = "메뉴추가")
	@RequestMapping(value="/{XTYPE_NM}",method = RequestMethod.POST)
	public Map<String,?> createSysPropType(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="XType 명", name="XTYPE_NM", required=true) @PathVariable("XTYPE_NM") String XTYPE_NM,
			@ApiParam(value="XType 명", name="sysPropType", required=true) @RequestParam("sysPropType") String sysPropType
	   		) throws Exception {
	       
			
			Map<String,? > sysPropTypeMap = JsonConvertor.convertJsonToMap(sysPropType);
			int count = sysPropTypeService.createSysPropType(sysPropTypeMap); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{XTYPE_NM}",method = RequestMethod.PUT)
	public Map<String,?> modifySysPropType(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="XType 명", name="XTYPE_NM", required=true) @PathVariable("XTYPE_NM") String XTYPE_NM,
			@ApiParam(value="XType 명", name="sysPropType", required=true) @RequestParam("sysPropType") String sysPropType
	   		) throws Exception {
	       
			
		Map<String,? > sysPropTypeMap = JsonConvertor.convertJsonToMap(sysPropType);
		int count = sysPropTypeService.modifySysPropType(sysPropTypeMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       return returnMap;
	}
}
