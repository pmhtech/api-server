package net.pmhtech.auth.service;

import java.util.List;
import java.util.Map;

public interface AuthService {
	public Map<String, ?> loginProcess(Map<String, ?> paramMap, boolean isLogined) throws Exception;
	public List<Map<String,?>> logoutProcess(Map<String,?> paramMap) throws Exception;
}
