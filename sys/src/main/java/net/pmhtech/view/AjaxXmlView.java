package net.pmhtech.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

public class AjaxXmlView extends AbstractView {
	 
	
	
	
	
	@Override
	protected void renderMergedOutputModel(Map model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
 
		response.setContentType("text/xml");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
 
		PrintWriter writer = response.getWriter();
		writer.write((String) model.get("ajaxXml"));  //Model Attribute 이름은 공통으로 사용하는 것으로...
		writer.close();
	}
}