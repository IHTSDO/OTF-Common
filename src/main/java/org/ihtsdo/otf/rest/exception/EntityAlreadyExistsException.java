package org.ihtsdo.otf.rest.exception;

public class EntityAlreadyExistsException extends BusinessServiceException {

	private static final long serialVersionUID = -652015419944747839L;

	public EntityAlreadyExistsException(String message) {
		super(message);
	}
}
