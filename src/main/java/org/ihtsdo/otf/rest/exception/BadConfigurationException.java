package org.ihtsdo.otf.rest.exception;

public class BadConfigurationException extends BusinessServiceException {

	public BadConfigurationException(String message) {
		super(message);
	}

	public BadConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

}
