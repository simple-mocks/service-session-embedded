package com.github.simple_mocks.session.embedded.exception;

import com.github.simple_mocks.error_service.exception.ServiceException;
import com.github.simple_mocks.session.embedded.constant.Constants;

/**
 * @author sibmaks
 * @since 0.0.3
 */
public class UnexpectedErrorException extends ServiceException {

    /**
     * Construct unexpected error exception.
     *
     * @param systemMessage system message
     */
    public UnexpectedErrorException(String systemMessage) {
        super(Constants.ERROR_SOURCE, "UNEXPECTED_ERROR", systemMessage);
    }

    /**
     * Construct unexpected error exception with cause.
     *
     * @param systemMessage system message
     * @param cause         cause
     */
    public UnexpectedErrorException(String systemMessage, Throwable cause) {
        super(Constants.ERROR_SOURCE, "UNEXPECTED_ERROR", systemMessage, cause);
    }
}
