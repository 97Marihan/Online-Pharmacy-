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
public class PrescriptionNotValid extends Exception {
     private String message;

    public PrescriptionNotValid() {
        this.message = "Code must be 8 digits";
    }


    
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
