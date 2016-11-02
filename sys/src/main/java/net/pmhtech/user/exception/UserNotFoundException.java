package net.pmhtech.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5045584823817098499L;

	public UserNotFoundException(String string) {
		super(string);
	}

}
