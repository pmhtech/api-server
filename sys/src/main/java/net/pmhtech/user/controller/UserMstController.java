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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import net.pmhtech.sys.service.SysCodeService;
import net.pmhtech.sys.service.SysMenuService;
import net.pmhtech.user.domain.UserMst;
import net.pmhtech.user.service.UserMstService;
import net.pmhtech.util.JsonConvertor;

@Api(value = "UserController", description = "USERS", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserMstController {


	@Resource(name="userMstService")
	private UserMstService userMstService;
	
	@RequestMapping(value="{USER_ID}", method = RequestMethod.POST)
    public @ResponseBody Map<String,?> insert(HttpServletRequest request, 
    										HttpServletResponse response,
    										@PathVariable(value="USER_ID") String USER_ID) throws Exception {
        
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
	
		String dataJson = request.getParameter("dataJson");
	    
		Map<String,Object > paramMap = JsonConvertor.convertJsonToMap(dataJson);
		
		UserMst userMst = new UserMst();
		
		BeanUtils.copyProperties(userMst, paramMap);
		
		userMstService.insert(userMst);
		return returnMap;
    }
}
