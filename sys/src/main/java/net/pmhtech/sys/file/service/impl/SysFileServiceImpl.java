package net.pmhtech.sys.file.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import net.pmhtech.sys.file.dao.SysFileDAO;
import net.pmhtech.sys.file.domain.SysFile;
import net.pmhtech.sys.file.service.SysFileService;
import net.pmhtech.sys.seq.service.SysSequenceService;


@Service("sysFileService")
public class SysFileServiceImpl implements SysFileService{
	// Dependency Injection
	private String uploadPath;

	@Resource(name="sysSequenceService")
	private SysSequenceService sysSequenceService;
	
	@Resource(name="sysFileDAO")
	private SysFileDAO sysFileDAO;
	
	private SysFile getSysFileVO(SysFile sysFileVO, MultipartFile file)throws Exception{
		
		sysFileVO.setFILE_PATH(uploadPath);
		String fileName = file.getOriginalFilename();
		sysFileVO.setFILE_ORI_NAME(fileName);
		
		int index = fileName.lastIndexOf('.');
		sysFileVO.setFILE_NAME(fileName.substring(0,index)+"_"+sysFileVO.getTEMP_FILE_ID()+fileName.substring(index));
		sysFileVO.setFILE_SIZE(file.getSize());
		return sysFileVO;
	}
	
	private int uploadFile(SysFile sysFileVO, MultipartFile file) throws Exception{
		
        byte[] bytes = file.getBytes();
        
        File dir = new File(sysFileVO.getFILE_PATH());
        if (!dir.exists()){
            dir.mkdirs();
        }
        File serverFile = new File(dir.getAbsolutePath() + File.separator + sysFileVO.getFILE_NAME());
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
        stream.write(bytes);
        stream.close();
		return 0;
	}
	
	public String createFile(Map<String,?> paramMap, MultipartFile[] files) throws Exception {
		
		int uploadCount = 0;

		SysFile sysFileVO = new SysFile();
		
		BeanUtils.copyProperties(sysFileVO, paramMap);
		String tablePK = sysFileVO.getTEMP_FILE_ID();
		
		if("".equals(tablePK) || tablePK==null ){
			 tablePK = sysSequenceService.getSequence(sysFileVO);
		}
		sysFileVO.setTEMP_FILE_ID(tablePK);
		
		for(MultipartFile file : files){

			if(!file.isEmpty()){
				SysFile tempVO = this.getSysFileVO(sysFileVO,file);
				this.uploadFile(tempVO,file);
				uploadCount = sysFileDAO.insert(tempVO);
			}
			
		}
		return tablePK;
	}
	
	public void downloadFile(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public int removeFile(SysFile sysFileVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int updateTempFileID(SysFile sysFileVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<Map<String, ?>> selectList(Map<String, Object> paramMap)
			throws Exception {

		return sysFileDAO.selectList(paramMap);
	}

	
	// Dependency Injection 
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
}
