package com.esamparka.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class DevGlobalException extends ResponseStatusException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    public DevGlobalException(HttpStatus status, String message) {
        super(status, message);
    }

}
