package org.swami.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceTwoGlobalExceptionHandler {

    @ExceptionHandler(TwoTestNotFound.class)
    public ResponseEntity<?> handleOrderNotFoundException(TwoTestNotFound ex){
        CustomErrorResponse errorResponse= new CustomErrorResponse();
        errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
                errorResponse.setErrorCode(GlobalErrorCode.ERROR_TEST_NOT_FOUND);
                errorResponse.setErrorMessage(ex.getMessage());
        return ResponseEntity.internalServerError().body(errorResponse);
    }

//This below code is written using lombok
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handleGenericException(Exception ex){
//        CustomErrorResponse errorResponse= CustomErrorResponse.builder()
//                .status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .errorCode(GlobalErrorCode.GENERIC_ERROR)
//                .errorMessage(ex.getMessage())
//                .build()  ;
//        log.error("RestaurantServiceGlobalExceptionHandler::handleGenericException exception caught {}",ex.getMessage());
//        return ResponseEntity.internalServerError().body(errorResponse);
//    }
}
