package com.devteria.tkc.exception;

import com.devteria.tkc.dto.request.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<ApiResponse> hanApiResponseResponseEntity(RuntimeException exception){
    ApiResponse apiResponse = new ApiResponse<>();
            apiResponse.setMessage(exception.getMessage());
            return ResponseEntity.badRequest().body(apiResponse);

}
    @ExceptionHandler(value = AppException.class)
    ResponseEntity<ApiResponse> hanApiResponseResponseEntity(AppException exception){
      ErrorCode errorCode = exception.getErrorCode();
        ApiResponse apiResponse = new ApiResponse<>();
    apiResponse.setCode(errorCode.getCode());
    apiResponse.setMessage(errorCode.getMessage());
        return ResponseEntity.badRequest().body(apiResponse);

    }
}
