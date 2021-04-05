package com.esamparka.exceptions;

import org.springframework.http.HttpStatus;

public class ItemNotFoundException extends DevGlobalException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    public ItemNotFoundException() {
        super(HttpStatus.NOT_FOUND, "ITEM NOT FOUND");
    }

    public ItemNotFoundException(HttpStatus status, String message) {
		super(status, message);
	}

}
