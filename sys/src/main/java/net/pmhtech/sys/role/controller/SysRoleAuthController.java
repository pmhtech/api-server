package net.pmhtech.sys.role.controller;

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

@Api(value = "그룹권한관리", description = "SysRoleController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/roles/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysRoleAuthController {

	@Resource(name="sysRoleAuthService")
	private SysRoleAuthService sysRoleAuthService;
	
	@ApiOperation(value = "사용자그룹 메뉴권한 조회", notes = "사용자그룹 메뉴권한 조회")
	@RequestMapping(value="/{USER_AUTH}", method = RequestMethod.GET)
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
	@RequestMapping(value="/{USER_AUTH}", method = RequestMethod.POST)
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
	@RequestMapping(value="/preview", method = RequestMethod.GET)
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
