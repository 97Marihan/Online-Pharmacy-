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

public class EmailNotValidException extends Exception {
    private String message;
    public EmailNotValidException() {
        this.message = "Email not valid.";
    }
    public EmailNotValidException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
