package br.edu.iftm.os.util.exception;

/**
 *
 * @author Trabalho luiz fernando
 */
public class ErroSistemaException extends Exception {

    public ErroSistemaException(String message) {
        super(message);
    }

    public ErroSistemaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
