package net.pmhtech.auth.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.pmhtech.user.dao.UserMstDAO;
import net.pmhtech.user.exception.UserNotFoundException;
import net.pmhtech.user.exception.UserPasswordMismatchedException;
import net.pmhtech.auth.service.LoginService;
import net.pmhtech.sys.code.service.SysCodeLocaleService;
import net.pmhtech.sys.menu.service.SysMenuService;
import net.pmhtech.util.PasswordEncoder;


@Service("authService")
public class LoginServiceImpl implements LoginService{

	@Resource(name="userMstDAO")
	private UserMstDAO userMstDAO;
	
	
	
	@Resource(name="sysCodeLocaleService")
	private SysCodeLocaleService sysCodeLocaleService;
	
	@Resource(name="sysMenuService")
	private SysMenuService sysMenuService;
	
	@Override
	public Map<String,?> loginProcess(Map<String, ?> paramMap, boolean isLogined) throws Exception {
		
		List<Map<String,?>> userMstData = userMstDAO.selectLogin(paramMap);
		
		if(userMstData.size()!=1){
			throw new UserNotFoundException("sss");
		}
		Map<String,?> userMst = userMstData.get(0);
		
		if(!isLogined){
			String inputPassword = (String) paramMap.get("PASSWORD");
			String saltKey = (String) userMst.get("SALT");
			String hashedPassword = (String) userMst.get("PASSWORD");
			
			String resultPass =PasswordEncoder.getHashedPassword(inputPassword, saltKey);
			
			if(!hashedPassword.equals(resultPass)){
				throw new UserPasswordMismatchedException("DDD");
			}
		}
		
		userMst.remove("PASSWORD");
		userMst.remove("SALT");
		List<Map<String,?>> userMstList = new ArrayList<Map<String,?>>();
		userMstList.add(userMst);
		
		Map<String,?> sysCodeGroup = sysCodeLocaleService.selectSysCodeMap(paramMap);
		List<Map<String,?>> sysMenuList = sysMenuService.selectList(paramMap);
		
		
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
		returnMap.put("userMst", userMstList);
		returnMap.put("sysCodeGroup", sysCodeGroup);
		returnMap.put("sysMenu", sysMenuList);
		
		return returnMap;
	}

	@Override
	public List<Map<String, ?>> logoutProcess(Map<String, ?> paramMap) throws Exception {

		
		
		// TODO Auto-generated method stub
		return null;
	}
}
