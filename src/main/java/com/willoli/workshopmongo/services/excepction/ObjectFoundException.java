package com.willoli.workshopmongo.services.excepction;

import java.io.Serial;

public class ObjectFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjectFoundException(String msg) {
        super(msg);
    }
    
}
