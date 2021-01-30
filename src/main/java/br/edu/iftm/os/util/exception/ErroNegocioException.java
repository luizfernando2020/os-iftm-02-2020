package br.edu.iftm.os.util.exception;

/**
 *
 * @author Trabalho luiz fernando
 */
public class ErroNegocioException extends Exception{

    public ErroNegocioException(String message) {
        super(message);
    }

    public ErroNegocioException(String message, Throwable cause) {
        super(message, cause);
    }

    
}
