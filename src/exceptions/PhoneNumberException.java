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
public class PhoneNumberException extends Exception {
    
    private String message;
    public PhoneNumberException(){
        message = "invalidPhone Number";
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
