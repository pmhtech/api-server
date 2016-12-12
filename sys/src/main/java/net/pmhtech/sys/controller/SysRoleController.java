package net.pmhtech.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
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
import net.pmhtech.util.JsonConvertor;

@Api(value = "권한관리", description = "SysRoleController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/roles", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysRoleController {

	@ApiOperation(value = "메뉴권한그룹 조회", notes = "메뉴권한그룹 조회")
	@RequestMapping(method = RequestMethod.GET)
    public Map<String,?> selectRole(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="권한ID", name="ROLE_ID", required=true) @RequestParam("ROLE_ID") String ROLE_ID
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("ROLE_ID", ROLE_ID);
		
        //List<Map<String,?>> sysMenus = null
        
        
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        //returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
	
	@ApiOperation(value = "메뉴권한그룹 추가", notes = "메뉴권한그룹 추가")
	@RequestMapping(value="/{ROLE_ID}",method = RequestMethod.POST)
	public Map<String,?> createRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="권한그룹ID", name="ROLE_ID", required=true) @PathVariable("ROLE_ID") String ROLE_ID,
	   		@ApiParam(value="권한그룹", name="SysRoles", required=true) @RequestParam("SysRoles") String sysRoles,
	   		@ApiParam(value="권한그룹상", name="SysRoleLocales", required=true) @RequestParam("SysRoleLocales") String sysRoleLocales
	   		) throws Exception {
	       
			
			//Map<String,?> sysMenuMap = JsonConvertor.convertJsonToMap(sysMenu);
			//List<Map<String,?>> listSysMenuCodes = JsonConvertor.convertJsonToList(sysMenuCodes);
			//List<Map<String,?>> listSysMenuLocales = JsonConvertor.convertJsonToList(sysMenuLocales);
			
		//	int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴권한그룹 수정", notes = "메뉴권한그룹 수정")
	@RequestMapping(value="/{ROLE_ID}",method = RequestMethod.PUT)
	public Map<String,?> modifyRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="권한그룹ID", name="ROLE_ID", required=true) @PathVariable("ROLE_ID") String ROLE_ID,
	   		@ApiParam(value="메뉴ID", name="SysRoles", required=true) @RequestParam("SysRoles") String sysRoles,
	   		@ApiParam(value="메뉴ID", name="SysRoleLocales", required=true) @RequestParam("SysRoleLocales") String sysRoleLocales
	   		) throws Exception {
	       
			
			//Map<String,?> sysMenuMap = JsonConvertor.convertJsonToMap(sysMenu);
			//List<Map<String,?>> listSysMenuCodes = JsonConvertor.convertJsonToList(sysMenuCodes);
			//List<Map<String,?>> listSysMenuLocales = JsonConvertor.convertJsonToList(sysMenuLocales);
			
		//	int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴권한그룹 삭제", notes = "메뉴권한그룹 삭제")
	@RequestMapping(value="/{ROLE_ID}",method = RequestMethod.DELETE)
	public Map<String,?> removeRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="권한그룹ID", name="ROLE_ID", required=true) @PathVariable("ROLE_ID") String ROLE_ID
	   		) throws Exception {
	       
			
			//Map<String,?> sysMenuMap = JsonConvertor.convertJsonToMap(sysMenu);
			//List<Map<String,?>> listSysMenuCodes = JsonConvertor.convertJsonToList(sysMenuCodes);
			//List<Map<String,?>> listSysMenuLocales = JsonConvertor.convertJsonToList(sysMenuLocales);
			
		//	int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "사용자그룹 메뉴권한 조회", notes = "사용자그룹 메뉴권한 조회")
	@RequestMapping(value="/auth/{USER_AUTH}", method = RequestMethod.GET)
    public Map<String,?> selectRoleAuth(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="사용자 권한", name="USER_AUTH", required=true) @RequestParam("USER_AUTH") String USER_AUTH
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("USER_AUTH", USER_AUTH);
		
        //List<Map<String,?>> sysMenus = null
        
        
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        //returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
	
	@ApiOperation(value = "사용자그룹 메뉴권환 추가", notes = "사용자그룹 메뉴권환 추가")
	@RequestMapping(value="/auth/{USER_AUTH}", method = RequestMethod.POST)
    public Map<String,?> createSysRoleAuth(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="사용자 권한", name="USER_AUTH", required=true) @RequestParam("USER_AUTH") String USER_AUTH
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("USER_AUTH", USER_AUTH);
		
        //List<Map<String,?>> sysMenus = null
        
        
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        //returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
}
