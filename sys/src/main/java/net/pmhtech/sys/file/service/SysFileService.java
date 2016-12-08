package net.pmhtech.sys.file.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import net.pmhtech.sys.file.domain.SysFile;



public interface SysFileService {
	public String createFile(Map<String,?> paramMap, MultipartFile[] file) throws Exception;
	public void downloadFile(Map<String,Object> paramMap) throws Exception;
	public int updateTempFileID(SysFile sysFileVO) throws Exception;
	public int removeFile(SysFile sysFileVO) throws Exception;
	public List<Map<String, ?>> selectList(Map<String, Object> paramMap)	throws Exception;
}
