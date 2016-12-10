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
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.pmhtech.sys.menu.service.SysMenuService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "SysMenuController", description = "SysMenu", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/menus", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysMenuController {

	@Resource(name="sysMenuService")
	private SysMenuService sysMenuService;
   	
	@ApiOperation(value = "기준정보그룹 조회", notes = "기준정보그룹 조회")
	@RequestMapping(value="/{SYSTEM}",method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("SYSTEM", SYSTEM);
		
        List<Map<String,?>> sysMenus = sysMenuService.selectList(paramMap); 
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
   
   @ApiOperation(value = "기준정보 상세조회", notes = "기준정보 상세조회")
   @RequestMapping(value="/{SYSTEM}/{MENU_ID}",method = RequestMethod.GET)
   public Map<String,?> createSysMenu(HttpServletRequest request, HttpServletResponse response,
   		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
   		@ApiParam(value="시스템코드", name="MENU_ID", required=true) @PathVariable("MENU_ID") String MENU_ID
   		) throws Exception {
       
		
		Map<String,Object > paramMap = new HashMap<String,Object>();
		
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("MENU_ID", MENU_ID);
		
       List<Map<String,?>> sysMenus = sysMenuService.createSysMenu(null); 
       
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       returnMap.put("sysMenus", sysMenus);

       return returnMap;
   }
}
