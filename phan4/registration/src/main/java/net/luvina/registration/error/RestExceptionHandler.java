package net.luvina.registration.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler({ ServiceRuntimeException.class })
  public ResponseEntity<ApiError> handlerServiceRuntimeException(ServiceRuntimeException ex) {
    ApiError apiError = new ApiError(ex.getErrorCode(), ex.getMessage());
    return new ResponseEntity<>(apiError, ex.getHttpStatus());
  }

}
