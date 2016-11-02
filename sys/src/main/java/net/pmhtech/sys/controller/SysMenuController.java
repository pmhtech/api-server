package net.pmhtech.sys.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import net.pmhtech.sys.service.SysMenuService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "SysMenuController", description = "SysMenu", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/menus", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysMenuController {

	@Resource(name="sysMenuService")
	private SysMenuService sysMenuService;
	   	
	@ApiOperation(value = "기준정보그룹 조회", notes = "기준정보그룹 조회")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request"),
            @ApiResponse(code = 204, message = "success request")
    })
    
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> selectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
	
	    String dataJson = request.getParameter("dataJson");
	    
		Map<String,Object > paramMap = JsonConvertor.convertJsonToMap(dataJson);
		Map<String, String> datas = new HashMap<>();
        sysMenuService.selectList(paramMap); 
 
        return ResponseEntity.ok(datas);
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
