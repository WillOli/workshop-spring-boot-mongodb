package com.willoli.workshopmongo.resources.exception;

import com.willoli.workshopmongo.services.excepction.ObjectFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/*Notation que trata possíveis erros nas requisições.*/
@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectFoundException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
