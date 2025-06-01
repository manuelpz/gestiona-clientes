package com.gestiona.clientes.exceptions.handler;

import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.gestiona.clientes.dto.ApiErrorDTO;

import jakarta.persistence.EntityNotFoundException;



@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ApiErrorDTO> handleEntityNotFoundException(EntityNotFoundException ex) {
    	ApiErrorDTO error = ApiErrorDTO.builder()
    	        .status(HttpStatus.NOT_FOUND.value())
    	        .message(ex.getMessage())
    	        .date(new Date())
    	        .build();
    	 return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiErrorDTO> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String paramName = ex.getName();
        String value = String.valueOf(ex.getValue());

        ApiErrorDTO error = ApiErrorDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message("Parámetro inválido: '" + paramName + "' no puede ser '" + value + "'")
                .date(new Date())
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorDTO> handleValidationException(MethodArgumentNotValidException ex) {
        String errores = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .collect(Collectors.joining("; "));

        ApiErrorDTO error = ApiErrorDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message("Error de validación: " + errores)
                .date(new Date())
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
