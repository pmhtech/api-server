package net.pmhtech.sys.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.pmhtech.sys.code.domain.SysCode;
import net.pmhtech.sys.code.domain.SysCodeGroup;
import net.pmhtech.sys.code.service.SysCodeGroupService;
import net.pmhtech.sys.code.service.SysCodeLocaleService;
import net.pmhtech.sys.code.service.SysCodeService;
import net.pmhtech.util.JsonConvertor;




@Api(value = "기준정보관리", description="SysCodeController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/codes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysCodeController {
	
	
	@Resource(name="sysCodeService")
	private SysCodeService sysCodeService;

	@Resource(name="sysCodeGroupService")
	private SysCodeGroupService sysCodeGroupService;

	@Resource(name="sysCodeLocaleService")
	private SysCodeLocaleService sysCodeLocaleService;
	   	
	@ApiOperation(value = "기준정보목록 조회", notes = "기준정보목록 조회 ")
	@RequestMapping(value="",method = RequestMethod.GET)
    public @ResponseBody Map<String,?> selectSysCodeGroupList(
    		HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();
		Map<String,Object > paramMap = new HashMap<String,Object>();

		System.out.println(sysCodeGroupService);
        List<Map<String,?>> sysCodeGroups = sysCodeGroupService.selectList(paramMap); 
        
        returnMap.put("sysCodeGroups", sysCodeGroups);

        return returnMap;
    }
   
	@ApiOperation(value = "기준정보 조회", notes = "기준정보 조회")
	@RequestMapping(value="/{PRE_CD}",method = RequestMethod.GET)
    public @ResponseBody Map<String,?> selectSysCodeGroup(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD
    		) throws Exception {
		Map<String,Object> returnMap = new HashMap<String,Object>();
		Map<String,Object > paramMap = new HashMap<String,Object>();
	
		paramMap.put("PRE_CD", PRE_CD);

        List<Map<String,?>> sysCodeList = sysCodeService.selectList(paramMap);
        returnMap.put("sysCodes", sysCodeList);
        return returnMap;
    }
	
	@ApiOperation(value = "기준정보목록 추가", notes = "기준정보목록 추가")
	@RequestMapping(value="/{PRE_CD}",method = RequestMethod.POST)
    public ResponseEntity<?> createSysCodeGroup(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹명", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD,
    		@RequestParam("sysCodeGroup") String sysCodeGroup,
    		@RequestParam("sysCodeLocales") String sysCodeLocales
    		) throws Exception {
        Map<String,?> sysCodeGroupMap = JsonConvertor.convertJsonToMap(sysCodeGroup);
        
        
        SysCodeGroup sysCodeGroupVO = new SysCodeGroup();
        SysCode sysCodeVO = new SysCode();
        
        BeanUtils.copyProperties(sysCodeGroupVO, sysCodeGroupMap);
        BeanUtils.copyProperties(sysCodeVO, sysCodeGroupMap);
        
        
        
        List<Map<String,?>> listSysCodeLocale = JsonConvertor.convertJsonToList(sysCodeLocales);
		System.out.println(sysCodeGroupService);
		
        int result = sysCodeGroupService.createSysCodeGroup(sysCodeGroupVO,sysCodeVO,listSysCodeLocale);
        
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
        return ResponseEntity.ok(datas);
    }
	
	@ApiOperation(value = "기준정보목록 수정", notes = "기준정보목록 수정 ")
	@RequestMapping(value="/{PRE_CD}",method = RequestMethod.PUT)
    public ResponseEntity<?> modifySysCodeGroup(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹명", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD,
    		@RequestParam("sysCodeGroup") String sysCodeGroup,
    		@RequestParam("sysCodeLocales") String sysCodeLocales
    		) throws Exception {
		  Map<String,?> sysCodeGroupMap = JsonConvertor.convertJsonToMap(sysCodeGroup);
	        
	        
	        SysCodeGroup sysCodeGroupVO = new SysCodeGroup();
	        SysCode sysCodeVO = new SysCode();
	        
	        BeanUtils.copyProperties(sysCodeGroupVO, sysCodeGroupMap);
	        BeanUtils.copyProperties(sysCodeVO, sysCodeGroupMap);
	        
	        
	        
	        List<Map<String,?>> listSysCodeLocale = JsonConvertor.convertJsonToList(sysCodeLocales);
			System.out.println(sysCodeGroupService);
			
	        int result = sysCodeGroupService.modifySysCodeGroup(sysCodeGroupVO,sysCodeVO,listSysCodeLocale);
	        
	        
	        Map<String, String> datas = new HashMap<>();
	        datas.put("hello", "spring");
	        return ResponseEntity.ok(datas);
    }
	
	@ApiOperation(value = "기준정보 추가", notes = "기준정보 추가")
	@RequestMapping(value="/{PRE_CD}/{CODE}",method = RequestMethod.POST)
	@ResponseBody
    public Map<String,?> createSysCode(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true)	@PathVariable("PRE_CD") String PRE_CD,
    		@ApiParam(value="코드", name="CODE", required=true)		@PathVariable("CODE") String CODE,
    		@RequestParam("sysCodeLocales") String sysCodeLocales) throws Exception {
        
		Map<String,Object> returnMap = new HashMap<String,Object>();
		List<Map<String,?>> listSysCodeLocale = JsonConvertor.convertJsonToList(sysCodeLocales);
		sysCodeService.createSysCode(listSysCodeLocale);
		
      
        return returnMap;
    }
	
	@ApiOperation(value = "기준정보 수정", notes = "기준정보 수정 ")
	@RequestMapping(value="/{PRE_CD}/{CODE}",method = RequestMethod.PUT)
	@ResponseBody
    public Map<String,?> modifySysCode(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true)	@PathVariable("PRE_CD") String PRE_CD,
    		@ApiParam(value="코드", name="CODE", required=true)		@PathVariable("CODE") String CODE,
    		@RequestParam("sysCodeLocales") String sysCodeLocales) throws Exception {
		Map<String,Object> returnMap = new HashMap<String,Object>();
		List<Map<String,?>> listSysCodeLocale = JsonConvertor.convertJsonToList(sysCodeLocales);
		sysCodeService.modifySysCode(listSysCodeLocale);
		
       return returnMap;
    }
}