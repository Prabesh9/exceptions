package com.esamparka.exceptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends DevGlobalException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    public UserNotFoundException() {
        super(HttpStatus.UNAUTHORIZED, "USER NOT FOUND");
    }

    public UserNotFoundException(HttpStatus status, String message) {
		super(status, message);
	}

}
