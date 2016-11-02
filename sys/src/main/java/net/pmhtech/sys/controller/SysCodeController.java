package net.pmhtech.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponses;

import net.pmhtech.sys.service.SysCodeService;
import net.pmhtech.util.JsonConvertor;

import com.wordnik.swagger.annotations.ApiResponse;


@Api(value = "SysCodeController", description = "SysCode", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/codes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SysCodeController {
	
	
	@Resource(name="sysCodeService")
	private SysCodeService sysCodeService;
	   	
	@ApiOperation(value = "기준정보그룹 조회", notes = "기준정보그룹 조회")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request"),
            @ApiResponse(code = 204, message = "success request")
    })
    
	@RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
		
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
		/*String dataJson = request.getParameter("dataJson");
	    
		Map<String,Object > paramMap = JsonConvertor.convertJsonToMap(dataJson);*/
        List<Map<String,?>> sysCodeList = sysCodeService.selectList(null); 
        
        returnMap.put("sysCode", sysCodeList);
        
        return returnMap;
    }
   
   @ApiOperation(value = "기준정보 상세조회", notes = "기준정보 상세조회")
   @ApiResponses(value = {
		   @ApiResponse(code = 200, message = "success request"),
		   @ApiResponse(code = 204, message = "success request")
    })
    @RequestMapping(value="/{COMPANY}/{PRE_CD}",method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        Map<String, String> datas = new HashMap<>();
        datas.put("hello", "spring");
 
        return ResponseEntity.ok(datas);
    }
}