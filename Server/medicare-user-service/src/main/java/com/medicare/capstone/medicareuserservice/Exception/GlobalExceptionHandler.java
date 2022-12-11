package com.medicare.capstone.medicareuserservice.Exception;


import com.medicare.capstone.medicareuserservice.Entity.ApiResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex) {
       Map<String, String> errorMap = new HashMap<>();
       ex.getBindingResult().getFieldErrors().forEach(fieldError -> {
           errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
       });
       return errorMap;
   }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiResponse> DataIntegrityViolationExceptionHandler(DataIntegrityViolationException ex) {
        ApiResponse resp = new ApiResponse();
        resp.setMessage("Name or email already exist!!");
        return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    }

}
