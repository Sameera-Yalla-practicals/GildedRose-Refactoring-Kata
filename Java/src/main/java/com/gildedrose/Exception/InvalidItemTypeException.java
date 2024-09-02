package com.gildedrose.Exception;

/**
 * Exception thrown when there is invalid item type passed to the application.
 */
public class InvalidItemTypeException extends RuntimeException{

    /**
     * Constructs InvalidItemTypeException with the specific detail message.
     * @param message provides information about the exception
     */
    public InvalidItemTypeException(String message){
        super(message);
    }
}
