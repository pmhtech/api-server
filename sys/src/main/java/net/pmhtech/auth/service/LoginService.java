package net.pmhtech.auth.service;

import java.util.List;
import java.util.Map;

public interface LoginService {
	public Map<String, ?> loginProcess(Map<String, ?> paramMap, boolean isLogined) throws Exception;
	public List<Map<String,?>> logoutProcess(Map<String,?> paramMap) throws Exception;
}
