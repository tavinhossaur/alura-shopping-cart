package br.com.tavinho.exceptions;

/**
 * An exception for the buy method to prevent negative debit.
 *
 * @author  Octávio Barassa
 * @version 1.0
 */
public class NegativeValueException extends RuntimeException{
    /**
     * Exception constructor that receives a message to identify it when is thrown
     *
     * @author          Octávio Barassa
     * @param message   Message to identify the exception
     */
    public NegativeValueException(String message) {
        super(message);
    }
}
