/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class MainApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;
        int x = scanner.nextInt();
        try{
        double r;
        r = 100 / x;
        System.out.println("Result: " + r);
        System.out.println("Something1");
        student.getId();
        System.out.println("Something2");
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("Iam Arithmetic");
        }catch(NullPointerException ex){
            System.out.println("Null Object for student");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
