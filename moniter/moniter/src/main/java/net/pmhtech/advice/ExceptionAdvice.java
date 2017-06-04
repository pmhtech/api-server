package net.pmhtech.advice;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import java.sql.SQLSyntaxErrorException;
import org.mybatis.spring.MyBatisSystemException;
@ControllerAdvice
public class ExceptionAdvice extends AbstractHandlerExceptionResolver{
	  
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ExceptionHandler(SQLSyntaxErrorException.class)
    public @ResponseBody ModelMap handlerSQLSyntaxErrorException(HttpServletRequest req, Exception e) throws Exception {
        
		e.printStackTrace();
		
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("title",req.getServletPath());
		modelMap.addAttribute("exceptionType","SQLSyntaxErrorException");// org.apache.ibatis.exceptions.PersistenceException,,,
		modelMap.addAttribute("message",e.getMessage());
		modelMap.addAttribute("statusCode","DDDD");
		return modelMap;
    }
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ExceptionHandler(MyBatisSystemException.class)
    public @ResponseBody ModelMap MyBatisSystemExceptionHandler(HttpServletRequest req, Exception e) throws Exception {
        
		e.printStackTrace();
		
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("title",req.getServletPath());
		modelMap.addAttribute("exceptionType","MyBatisSystemException");// org.apache.ibatis.exceptions.PersistenceException,,,java.sql.SQLSyntaxErrorException
		modelMap.addAttribute("message",e.getMessage());
		modelMap.addAttribute("statusCode","DDDD");
		return modelMap;
    }
	
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ExceptionHandler(Exception.class)
    public ModelMap defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        
		e.printStackTrace();
		
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("title",req.getServletPath());
		modelMap.addAttribute("message",e.getMessage());
		modelMap.addAttribute("statusCode","DDDD");
		return modelMap;
    }
	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub
		return null;
	}
}
