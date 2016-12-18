package net.pmhtech.sys.controller;

import java.util.ArrayList;
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
import net.pmhtech.sys.role.service.SysRoleAuthService;
import net.pmhtech.sys.role.service.SysRoleService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "권한관리", description = "SysRoleController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/roles", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysRoleController {

	@Resource(name="sysRoleService")
	private SysRoleService sysRoleService;
	
	@Resource(name="sysRoleAuthService")
	private SysRoleAuthService sysRoleAuthService;
	
	
	
	@ApiOperation(value = "메뉴권한그룹 조회", notes = "메뉴권한그룹 조회")
	@RequestMapping(method = RequestMethod.GET)
    public Map<String,?> selectSysRole(HttpServletRequest request, HttpServletResponse response
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		List<Map<String,?>> sysRoles = sysRoleService.selectSysRole(paramMap);
		Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysRoles", sysRoles);

        return returnMap;
    }
	
	@ApiOperation(value = "메뉴권한그룹 조회", notes = "메뉴권한그룹 조회")
	@RequestMapping(value="/{SYSTEM}/{ROLE_ID}",method = RequestMethod.GET)
    public Map<String,?> selectSysRolePage(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템구분", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
    		@ApiParam(value="시스템구분", name="ROLE_ID", required=true) @PathVariable("ROLE_ID") String ROLE_ID
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("ROLE_ID", ROLE_ID);
		List<Map<String,?>> sysRolesPages = sysRoleService.selectSysRolePage(paramMap);
		Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysRolePages", sysRolesPages);

        return returnMap;
    }
	
	@ApiOperation(value = "메뉴권한그룹 추가", notes = "메뉴권한그룹 추가")
	@RequestMapping(value="/{SYSTEM}",method = RequestMethod.POST)
	public Map<String,?> createRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템구분", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
	   		@ApiParam(value="SysRole", name="SysRoles", required=true) @RequestParam("sysRole") String sysRole,
	   		@ApiParam(value="SysRoleLocals", name="SysRoleLocales", required=true) @RequestParam("sysRoleLocales") String sysRoleLocales,
	   		@ApiParam(value="SysRolePages", name="SysRolePages", required=true) @RequestParam("sysRolePages") String sysRolePages
	   		) throws Exception {
	       
			
			Map<String,?> mapSysRole = JsonConvertor.convertJsonToMap(sysRole);
			List<Map<String,?>> listSysRoleLocale = JsonConvertor.convertJsonToList(sysRoleLocales);
			List<Map<String,?>> listSysRolePage = JsonConvertor.convertJsonToList(sysRolePages);
			
			sysRoleService.createSysRole(mapSysRole, listSysRoleLocale, listSysRolePage);
		//	int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴권한그룹 수정", notes = "메뉴권한그룹 수정")
	@RequestMapping(value="/{SYSTEM}/{ROLE_ID}",method = RequestMethod.PUT)
	public Map<String,?> modifyRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템구분", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
	   		@ApiParam(value="SysRole", name="SysRoles", required=true) @RequestParam("sysRole") String sysRole,
	   		@ApiParam(value="SysRoleLocals", name="SysRoleLocales", required=true) @RequestParam("sysRoleLocales") String sysRoleLocales,
	   		@ApiParam(value="SysRolePages", name="SysRolePages", required=true) @RequestParam("sysRolePages") String sysRolePages
	   		) throws Exception {
	       
			
		Map<String,?> mapSysRole = JsonConvertor.convertJsonToMap(sysRole);
		List<Map<String,?>> listSysRoleLocale = JsonConvertor.convertJsonToList(sysRoleLocales);
		List<Map<String,?>> listSysRolePage = JsonConvertor.convertJsonToList(sysRolePages);
		
		sysRoleService.modifySysRole(mapSysRole, listSysRoleLocale, listSysRolePage);
			
		//	int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴권한그룹 삭제", notes = "메뉴권한그룹 삭제")
	@RequestMapping(value="/{SYSTEM}/{ROLE_ID}",method = RequestMethod.DELETE)
	public Map<String,?> removeRole(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템구분", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
			@ApiParam(value="권한ID", name="ROLE_ID", required=true) @PathVariable("ROLE_ID") String ROLE_ID
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
    		@ApiParam(value="사용자 권한", name="USER_AUTH", required=true) @PathVariable("USER_AUTH") String USER_AUTH
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("USER_AUTH", USER_AUTH);
		

		List<Map<String,?>>sysRoleAuths = sysRoleAuthService.selectList(paramMap);
        
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysRoleAuths", sysRoleAuths);

        return returnMap;
    }
	
	@ApiOperation(value = "사용자그룹 메뉴권환 추가", notes = "사용자그룹 메뉴권환 추가")
	@RequestMapping(value="/auth/{USER_AUTH}", method = RequestMethod.POST)
    public Map<String,?> createSysRoleAuth(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="사용자 권한", name="USER_AUTH", required=true) @PathVariable("USER_AUTH") String USER_AUTH,
    		@ApiParam(value="사용자 권한", name="sysRoleAuths", required=true) @RequestParam("sysRoleAuths") String sysRoleAuths
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		List<Map<String,?>> listSysRoleAuth = JsonConvertor.convertJsonToList(sysRoleAuths);
		
	
	
		sysRoleAuthService.createSysRoleAuth(USER_AUTH, listSysRoleAuth);
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        //returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
	
	@ApiOperation(value = "사용자그룹 메뉴권환 추가", notes = "사용자그룹 메뉴권환 추가")
	@RequestMapping(value="/auth/preview", method = RequestMethod.GET)
    public Map<String,?> selectPreview(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="사용자 권한", name="sysRoles", required=true) @RequestParam("sysRoles") String sysRoles
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		
		
		List<Map<String,?>> listSysRoles = JsonConvertor.convertJsonToList(sysRoles);
		
		List<String> listRole= new ArrayList<String>();
		for(Map map :listSysRoles){
			listRole.add("'"+map.get("ROLE_ID").toString()+"'");
			
		}
		
		List<Map<String,?>> sysRolePage = sysRoleAuthService.selectPreview(listRole);
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysRolePage", sysRolePage);

        return returnMap;
    }
}
