/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;


import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/**
 *
 * @author aashgar
 */
public class ReacantgleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //rectangle.reaArea();
        try {
             rectangle.reaArea2();
        } catch (InputMismatchException ex) {
            System.out.println("Bad input");
        }
        try {
            rectangle.reaArea3();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
