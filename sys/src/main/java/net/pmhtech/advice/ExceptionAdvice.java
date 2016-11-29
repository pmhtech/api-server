package net.pmhtech.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import net.pmhtech.user.exception.UserNotFoundException;
import net.pmhtech.user.exception.UserPasswordMismatchedException;
import net.pmhtech.view.AjaxXmlView;

@ControllerAdvice
public class ExceptionAdvice extends AbstractHandlerExceptionResolver{
	  

	@ResponseBody
	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "UserNotFoundException")
	@ExceptionHandler(Exception.class)
    public ModelMap defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("reason",e.getMessage());
		modelMap.addAttribute("statusCode","DDDD");
		return modelMap;
    }
	@ResponseBody
	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "UserNotFoundException")
	@ExceptionHandler(UserNotFoundException.class)
	public ModelMap handlerUserNotFoundException(HttpServletRequest request, 
			UserNotFoundException e){
	

		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("reason",e.getMessage());
		modelMap.addAttribute("statusCode","DDDD");
		return modelMap;
		
		
	}
	@ResponseBody
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ExceptionHandler(UserPasswordMismatchedException.class)
	public  ModelMap handlerUserPasswordUnMatchedException(HttpServletRequest request, 
			UserPasswordMismatchedException e){
		
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("code", "DDD");
		modelMap.addAttribute("reason",e.getMessage());
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
