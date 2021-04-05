package com.esamparka.exceptions;

import org.springframework.http.HttpStatus;

public class IdMismatchException extends DevGlobalException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    public IdMismatchException() {
        super(HttpStatus.CONFLICT, "ID AND CONTENT MISMATCHED");
    }

    public IdMismatchException(HttpStatus status, String message) {
		super(status, message);
	}

}
