package io.wisoft.monitoringsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class ErrorResponse {

  private final String message;

}
