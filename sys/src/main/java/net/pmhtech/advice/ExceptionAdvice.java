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
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import net.pmhtech.user.exception.UserNotFoundException;
import net.pmhtech.user.exception.UserPasswordMismatchedException;
import net.pmhtech.view.AjaxXmlView;

@ControllerAdvice
public class ExceptionAdvice extends AbstractHandlerExceptionResolver{
	  

	
	@ExceptionHandler(UserNotFoundException.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        // If the exception is annotated with @ResponseStatus rethrow it and let
        // the framework handle it - like the OrderNotFoundException example
        // at the start of this post.
        // AnnotationUtils is a Spring Framework utility class.
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
            throw e;

        // Otherwise setup and send the user to a default error-view.
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        return mav;
    }
	
	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "UserNotFoundException")
	public ModelAndView handlerUserNotFoundException(HttpServletRequest request, 
			HttpServletResponse response){
	
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
		returnMap.put("message", "UserNotFoundException");
		return new ModelAndView("home");
		
		
	}
	
	@ExceptionHandler(UserPasswordMismatchedException.class)
	@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "UserPasswordMismatchedException")
	@RequestMapping(value="/403")
	public ModelAndView handlerUserPasswordUnMatchedException(HttpServletRequest request, 
			HttpServletResponse response){
	
		
		ModelAndView model = new ModelAndView(new AjaxXmlView());

		JSONObject jsonObject= new JSONObject();
		jsonObject.put("code", "DDD");
		
		model.addObject("ajaxXml",jsonObject.toString());
		model.addObject("reason","DDD");
        model.addObject("statusCode","DDDD");
		return model;
		
		
	}	
	
	
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView exceptionHandler(
            HttpServletRequest request,
            HttpServletResponse response,
            Exception exception) {
 
 
        String contentType = request.getHeader("Content-Type");
        ModelAndView model=null;
        String reason= HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();;
        int statusCode= HttpStatus.INTERNAL_SERVER_ERROR.value();
 
 
        // Content-Type 확인, json 만 View를 따로 처리함.
        if(contentType!=null && MediaType.APPLICATION_JSON_VALUE.equals(contentType)){
            model = new ModelAndView("jsonView");
            ResponseStatus annotation = exception.getClass().getAnnotation(ResponseStatus.class);
 
            if(annotation!=null){
                reason = annotation.reason();
                statusCode = annotation.value().value();
            }
 
 
        } else {
            //json 이 아닐경우 error page 로 이동
            model = new ModelAndView("error.jsp");
        }
 
        model.addObject("reason",reason);
        model.addObject("statusCode",statusCode);
        response.setStatus(statusCode);
 
        return model;
    }

	@Override
	protected ModelAndView doResolveException(HttpServletRequest arg0, HttpServletResponse response, Object arg2,
			Exception arg3) {
		// TODO Auto-generated method stub
		return null;
	}
}
