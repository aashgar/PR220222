/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch5Apps;

import java.io.IOException;

/**
 *
 * @author aashgar
 */
public class MainApp3 {
    public static void main(String[] args) {
        double z=0;
        try{
        z = divide(100, 0);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The sum is: "+z);
        //method1();
    }
    private static double divide(int x, int y) 
                    throws ArithmeticException{
        if(y==0)
            throw new ArithmeticException("Error");
        return x/y;
    }
    private static  void method1() throws IOException{
        
    }
}
