/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.io.File;
import java.io.FileNotFoundException;
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
        try {
            Scanner scanner1 = new Scanner(new File(""));
        } catch (FileNotFoundException ex) {
            
        }
        Student student = null;
        int x = scanner.nextInt();
        try{
            if(x==0)
                throw new DivideByZero("You can not divide by zero");
       if(student == null)
            throw new NullPointerException("This is NULL");
        double r;
        r = 100 / x;
        System.out.println("Result: " + r);
        System.out.println("Something1");
        student.getId();
        System.out.println("Something2");
        }catch(DivideByZero ex){
            System.out.println(ex.getMessage());
            System.out.println("Iam Arithmetic");
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("This is a finally place");
        }
        
    }
}
