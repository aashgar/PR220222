/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

/**
 *
 * @author aashgar
 */
public class DivideByZero extends ArithmeticException{

    public DivideByZero() {
        super();
    }
    public DivideByZero(String message){
        super(message);
    }
    
}
