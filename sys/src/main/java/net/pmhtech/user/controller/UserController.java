package net.pmhtech.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.pmhtech.user.domain.UserMst;
import net.pmhtech.user.service.LoginService;
import net.pmhtech.user.service.UserMstService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "사용자관리", description = "UserController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {


	@Resource(name="userMstService")
	private UserMstService userMstService;
	
	@Resource(name="loginService")
	private LoginService loginService;
	
	
	@ApiOperation(value = "사용자 추가", notes = "사용자 추가")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request"),
            @ApiResponse(code = 204, message = "success request")
    })
	@RequestMapping(value="{USER_ID}", method = RequestMethod.POST)
    public @ResponseBody Map<String,?> insert(HttpServletRequest request, 
    										HttpServletResponse response,
    										@PathVariable(value="USER_ID") String USER_ID) throws Exception {
        
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
	
		String dataJson = request.getParameter("dataJson");
	    
		Map<String,? > paramMap = JsonConvertor.convertJsonToMap(dataJson);
		
		UserMst userMst = new UserMst();
		
		BeanUtils.copyProperties(userMst, paramMap);
		
		userMstService.insert(userMst);
		return returnMap;
    }
	@ApiOperation(value = "사용자 로그인", notes = "사용자 로그인")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request"),
            @ApiResponse(code = 204, message = "success request")
    })
	
	
	@RequestMapping(value="{USER_ID}/login", method = RequestMethod.POST)
    public @ResponseBody Map<String,?> login(HttpServletRequest request, HttpServletResponse response,
    										@PathVariable(value="USER_ID") String USER_ID,
    										@RequestParam("LoginData") String loginData) throws Exception {
        
		
		Map<String,?> returnMap = new HashMap<String,Object>();
		String userId = (String) request.getSession().getAttribute("USER_ID");
		
		userId = (userId == null) ? "" : userId;		
				
		boolean isLogined = false;
		if("".equals(userId)&& userId.equals(USER_ID)){
			isLogined=true;
		}
		Map<String,? > paramMap = JsonConvertor.convertJsonToMap(loginData);
		returnMap = loginService.loginProcess(paramMap,isLogined);
		request.getSession().setAttribute("USER_ID", paramMap.get("USER_ID"));
        return returnMap;
    }
	
	@ApiOperation(value = "사용자 로그아웃", notes = "사용자 로그인")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success request"),
            @ApiResponse(code = 204, message = "success request")
    })
	@RequestMapping(value="{USER_ID}/logout", method = RequestMethod.POST)
    public @ResponseBody Map<String,?> logout(HttpServletRequest request, 
			HttpServletResponse response,
			@PathVariable(value="USER_ID") String USER_ID) throws Exception {
        
		Map<String,Object> returnMap = new HashMap<String,Object>();
	
        
        return returnMap;
    }
}
