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
public class PasswordNotValidException extends Exception {

    private String message;

    public PasswordNotValidException() {
        this.message = "Password not valid.";
    }
    
    public PasswordNotValidException(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
    
    
}
