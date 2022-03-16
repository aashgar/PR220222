/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 *
 * @author aashgar
 */
public class MainApp2 {
    public static void main(String[] args) {
       // System.out.println(
        IntStream
                .rangeClosed(0, 100000)
                //.of(19,10,20,30,11,1,1,1,1)
                //.sum()
                //.average()
                //.getAsDouble()
                .filter(v -> v%9 ==0 && v> 98000)
                .forEach(element-> System.out.print(element+" "));
        //);
    }
}
