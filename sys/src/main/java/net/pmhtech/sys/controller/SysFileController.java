package net.pmhtech.sys.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import net.pmhtech.sys.file.service.SysFileService;
import net.pmhtech.util.JsonConvertor;

@Controller
@RequestMapping(value="/sys/files")
public class SysFileController {

	private String fileUploadPath = "C:/file";
	
	
	@Resource(name="sysFileService")
	private SysFileService sysFileService;
	
	
	   /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> uploadFile(
    		@RequestParam("file") MultipartFile[] files,
    		@RequestParam("dataMap") String jsonString
    		) throws Exception{
    		
    	
    	Map<String,Object> ajaxData = new HashMap<String,Object>();
    	
    	int count =0;
    	
    	
    	Map<String, ?> paramMap = JsonConvertor.convertJsonToMap(jsonString);
    	String tempFileID = sysFileService.createFile(paramMap, files);
	    
    	ajaxData.put("success", true);    	
    	ajaxData.put("tempFileID",tempFileID);
    	ajaxData.put("message", "총"+count+"건의 파일이 업로드 되었습니다.");
        return ajaxData;
    }
    
    @RequestMapping(value="/download", method = RequestMethod.GET)
    public void downloadFile( 
    		@RequestParam("COMPANY") String company,
    		@RequestParam("SEQ") String seq,
    							HttpServletResponse response
    													) throws Exception{
    		
    	
    	Map<String,Object> paramMap = new HashMap<String,Object>();
    	paramMap.put("COMPANY", company);
    	paramMap.put("SEQ", seq);
    	List<Map<String,?>> storeSysFile = sysFileService.selectList(paramMap); 
    	Map<String,?> resMap = storeSysFile.get(0);
    	
    	
        response.setContentType("application/octet-stream");
       
        // 브라우저는 ISO-8859-1을 인식하기 때문에
        // UTF-8 -> ISO-8859-1로 디코딩, 인코딩 한다.
        String FILE_ORI_NAME = new String(resMap.get("FILE_ORI_NAME").toString().getBytes("UTF-8"), "iso-8859-1");
       
        // 파일명 지정
        response.setHeader("Content-Disposition", "attachment; filename=\""+FILE_ORI_NAME+"\"");
       
        OutputStream os = response.getOutputStream();
        // String path = servletContext.getRealPath("/resources");
        // d:/upload 폴더를 생성한다.
        // server에 clean을 하면 resources 경로의 것이 다 지워지기 때문에
        // 다른 경로로 잡는다(실제 서버에서는 위의 방식으로)
        String path = "c:/file";
        FileInputStream fis = new FileInputStream(path + File.separator + resMap.get("FILE_NAME"));
        int n = 0;
        byte[] b = new byte[512];
        while((n = fis.read(b)) != -1 ) {
            os.write(b, 0, n);
        }
        fis.close();
        os.close();
    }
    
    
    @RequestMapping( method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> selectList(
    		@RequestParam("dataMap") String jsonString
    		
    															) throws Exception{
    		
    	
    	Map<String,Object> ajaxData = new HashMap<String,Object>();
    	Map<String,?> paramMap = JsonConvertor.convertJsonToMap(jsonString);
    	
    	//List<Map<String,Object>> storeSysFile = sysFileService.selectList(paramMap); 
    	
    	List<Map<String,Object>> storeSysFile = new ArrayList();
    	
    	ajaxData.put("success", true);
    	ajaxData.put("totalCount", storeSysFile.size());
    	ajaxData.put("storeSysFile", storeSysFile);
    	
        return ajaxData;
    }
    
    
}