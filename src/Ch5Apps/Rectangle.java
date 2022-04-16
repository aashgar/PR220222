/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aashgar
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
    }

    public void reaArea() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter width:");
            this.width = scanner.nextInt();
            System.out.println("Enter height:");
            this.height = scanner.nextInt();
            this.calcArea();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }
    
    public void reaArea2() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);        
            System.out.println("Enter width:");
            this.width = scanner.nextInt();
            System.out.println("Enter height:");
            this.height = scanner.nextInt();
            this.calcArea();       
    }
    public void reaArea3() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);        
            System.out.println("Enter width:");
            this.width = scanner.nextInt();
            System.out.println("Enter height:");
            this.height = scanner.nextInt();
            this.calcArea();       
    }

    private void calcArea() {
        int area = width * height;
        System.out.println("Area is: " + area);
    }
}
