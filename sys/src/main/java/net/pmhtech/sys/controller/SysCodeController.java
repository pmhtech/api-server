package net.pmhtech.sys.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import net.pmhtech.sys.service.SysCodeService;




@Api(value = "기준정보관리", description="SysCodeController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/codes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysCodeController {
	
	
	@Resource(name="sysCodeService")
	private SysCodeService sysCodeService;
	   	
	@ApiOperation(value = "공통코드그룹목록 조회", notes = "언어설정ddddddddd에 따른 공통코드그룹목록 조회")
	@RequestMapping(value="",method = RequestMethod.GET)
    public @ResponseBody Map<String,?> selectSysCodeGroup(
    		HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();
		Map<String,Object > paramMap = new HashMap<String,Object>();
        List<Map<String,?>> sysCodeList = sysCodeService.selectGroupList(paramMap); 
        
        returnMap.put("sysCodeGroup", sysCodeList);
        
        return returnMap;
    }
   
	@ApiOperation(value = "공통코드 상세조회", notes = "언어코드에 따른공통코드상세 조회")
	@RequestMapping(value="/{PRE_CD}",method = RequestMethod.GET)
    public @ResponseBody Map<String,?> selectSysCode(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD
    		) throws Exception {
		Map<String,Object> returnMap = new HashMap<String,Object>();
		Map<String,Object > paramMap = new HashMap<String,Object>();
	
		paramMap.put("PRE_CD", PRE_CD);
        List<Map<String,?>> sysCodeList = sysCodeService.selectList(paramMap); 
        
        returnMap.put("sysCode", sysCodeList);
        
        return returnMap;
    }
	
	@ApiOperation(value = "공통코드그룹 추가", notes = "공통코드그룹 추가")
	@RequestMapping(value="/{PRE_CD}",method = RequestMethod.POST)
    public ResponseEntity<?> createSysCodeGroup(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="언어코드", name="LOCALE_CD", required=true) @PathVariable("LOCALE_CD") String LOCALE_CD,
    		@ApiParam(value="코드그룹명", name="LOCALE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD
    		) throws Exception {
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
 
        return ResponseEntity.ok(datas);
    }
	
	@ApiOperation(value = "공통코드그룹 수정", notes = "공통코드그룹 수정 ")
	@RequestMapping(value="//{PRE_CD}",method = RequestMethod.PUT)
    public ResponseEntity<?> modifySysCodeGroup(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹명", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD
    		) throws Exception {
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
 
        return ResponseEntity.ok(datas);
    }
	
	@ApiOperation(value = "공통코드 추가", notes = "공통코드 추가")
	@RequestMapping(value="/{PRE_CD}/{CODE}",method = RequestMethod.POST)
    public ResponseEntity<?> createSysCode(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD,
    		@ApiParam(value="코드", name="CODE", required=true) @PathVariable("CODE") String CODE
    		) throws Exception {
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
 
        return ResponseEntity.ok(datas);
    }
	
	@ApiOperation(value = "공통코드 수정", notes = "공통코드 수정 ")
	@RequestMapping(value="/{PRE_CD}/{CODE}",method = RequestMethod.PUT)
    public ResponseEntity<?> modifySysCode(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="코드그룹", name="PRE_CD", required=true) @PathVariable("PRE_CD") String PRE_CD,
    		@ApiParam(value="코드", name="CODE", required=true) @PathVariable("CODE") String CODE
    		) throws Exception {
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
 
        return ResponseEntity.ok(datas);
    }
}