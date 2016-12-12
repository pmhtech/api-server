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

@Api(value = "메뉴관리", description = "SysMenuController", produces = "application/json")
@RestController
@RequestMapping(value = "/sys/menus", produces = MediaType.APPLICATION_JSON_VALUE)
public class SysMenuController {

	@Resource(name="sysMenuService")
	private SysMenuService sysMenuService;
	
	@Resource(name="sysMenuCodeService")
	private SysMenuCodeService sysMenuCodeService;
	
	
   	
	@ApiOperation(value = "메뉴목록 조회", notes = "메뉴목록 조회")
	@RequestMapping(method = RequestMethod.GET)
    public Map<String,?> selectList(HttpServletRequest request, HttpServletResponse response,
    		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @RequestParam("SYSTEM") String SYSTEM
    		) throws Exception {
        

		Map<String,Object > paramMap = new HashMap<String,Object>();
		paramMap.put("SYSTEM", SYSTEM);
		
        List<Map<String,?>> sysMenus = sysMenuService.selectList(paramMap);
        
        
        
        
        Map<String,Object> returnMap = new HashMap<String,Object>();
        returnMap.put("sysMenus", sysMenus);

        return returnMap;
    }
	
	@ApiOperation(value = "메뉴에 사용되는 기준정보조회", notes = "메뉴에 사용되는 기준정보조회")
   @RequestMapping(value="/{SYSTEM}/{MENU_ID}",method = RequestMethod.GET)
   public Map<String,?> select(HttpServletRequest request, HttpServletResponse response,
   		@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
   		@ApiParam(value="메뉴ID", name="MENU_ID", required=true) @PathVariable("MENU_ID") String MENU_ID
   		) throws Exception {
       
		
		Map<String,Object > paramMap = new HashMap<String,Object>();
		
		paramMap.put("SYSTEM", SYSTEM);
		paramMap.put("MENU_ID", MENU_ID);
		
       List<Map<String,?>> sysMenuCodes = sysMenuCodeService.selectList(paramMap); 
       
       Map<String,Object> returnMap = new HashMap<String,Object>();
       returnMap.put("sysMenuCodes", sysMenuCodes);
       return returnMap;
   }
	
	@ApiOperation(value = "메뉴추가", notes = "메뉴추가")
	@RequestMapping(value="/{SYSTEM}/{MENU_ID}",method = RequestMethod.POST)
	public Map<String,?> createMenu(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
	   		@ApiParam(value="메뉴ID", name="MENU_ID", required=true) @PathVariable("MENU_ID") String MENU_ID,
	   		@ApiParam(value="메뉴", name="SysMenu", required=true) @RequestParam("SysMenu") String sysMenu,
	   		@ApiParam(value="메뉴ID", name="SysMenuCodes", required=true) @RequestParam("SysMenuCodes") String sysMenuCodes,
	   		@ApiParam(value="메뉴ID", name="SysMenuLocales", required=true) @RequestParam("SysMenuLocales") String sysMenuLocales
	   		) throws Exception {
	       
			
			Map<String,?> sysMenuMap = JsonConvertor.convertJsonToMap(sysMenu);
			List<Map<String,?>> listSysMenuCodes = JsonConvertor.convertJsonToList(sysMenuCodes);
			List<Map<String,?>> listSysMenuLocales = JsonConvertor.convertJsonToList(sysMenuLocales);
			
			int count = sysMenuService.createSysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
	
	@ApiOperation(value = "메뉴수정", notes = "메뉴수정")
	@RequestMapping(value="/{SYSTEM}/{MENU_ID}",method = RequestMethod.PUT)
	public Map<String,?> modifyMenu(HttpServletRequest request, HttpServletResponse response,
			@ApiParam(value="시스템코드", name="SYSTEM", required=true) @PathVariable("SYSTEM") String SYSTEM,
	   		@ApiParam(value="메뉴ID", name="MENU_ID", required=true) @PathVariable("MENU_ID") String MENU_ID,
	   		@ApiParam(value="메뉴", name="SysMenu", required=true) @RequestParam("SysMenu") String sysMenu,
	   		@ApiParam(value="메뉴ID", name="SysMenuCodes", required=true) @RequestParam("SysMenuCodes") String sysMenuCodes,
	   		@ApiParam(value="메뉴ID", name="SysMenuLocales", required=true) @RequestParam("SysMenuLocales") String sysMenuLocales
	   		) throws Exception {
	       
			
			Map<String,?> sysMenuMap = JsonConvertor.convertJsonToMap(sysMenu);
			List<Map<String,?>> listSysMenuCodes = JsonConvertor.convertJsonToList(sysMenuCodes);
			List<Map<String,?>> listSysMenuLocales = JsonConvertor.convertJsonToList(sysMenuLocales);
			
			int count = sysMenuService.modifySysMenu(sysMenuMap,listSysMenuLocales,listSysMenuCodes); 
	       
	       Map<String,Object> returnMap = new HashMap<String,Object>();
	       return returnMap;
	}
}
