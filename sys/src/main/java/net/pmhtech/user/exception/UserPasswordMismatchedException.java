package net.pmhtech.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "UserPasswordUnMachtedException")
public class UserPasswordMismatchedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5045584823817098499L;

	public UserPasswordMismatchedException(String string) {
		super(string);
	}

}
