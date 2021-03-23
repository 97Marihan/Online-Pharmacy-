/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Abdelrahman
 */
public class QuantityNotValidException extends Exception {
    private String message;

    public QuantityNotValidException() {
        this.message = "Invalid quantity";
                
    }
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
