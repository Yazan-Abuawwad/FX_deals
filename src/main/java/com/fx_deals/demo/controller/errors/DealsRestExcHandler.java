package com.fx_deals.demo.controller.errors;

import com.fx_deals.demo.entity.DealsDeteilsEntity;
import org.aspectj.bridge.MessageUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class DealsRestExcHandler   {
//
//@ExceptionHandler
//    public ResponseEntity<DealsErrorResponse> handleException(DealsException e ){
//
//        DealsErrorResponse dealsErrorResponse= new DealsErrorResponse();
//
//        dealsErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//        dealsErrorResponse.setMessage(e.getMessage());
//        dealsErrorResponse.setTimeStamp(System.currentTimeMillis());
//
//return new ResponseEntity<>( dealsErrorResponse, HttpStatus.NOT_FOUND);
//
//    }




    @ExceptionHandler
    public ResponseEntity<DealsErrorResponse> costemHandleException(DealsException exc) {

        // create a  ErrorResponse
        DealsErrorResponse error = new DealsErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        error.setEntity(exc.getDealsDeteilsEntity());

        // return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


}
