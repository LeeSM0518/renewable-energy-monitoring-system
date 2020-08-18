package io.wisoft.monitoringsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;
import java.util.stream.Collectors;

@RestControllerAdvice("io.wisoft.monitoringsystem.controller")
public class ApiExceptionAdvice {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> invalidException(
      MethodArgumentNotValidException ex) {
    String errorCodes = ex.getBindingResult().getAllErrors()
        .stream()
        .map(error -> Objects.requireNonNull(error.getDefaultMessage()))
        .collect(Collectors.joining(" ,"));
    return ResponseEntity
        .status(HttpStatus.BAD_REQUEST)
        .body(new ErrorResponse(errorCodes));
  }

}
