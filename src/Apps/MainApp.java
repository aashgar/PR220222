/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apps;

/**
 *
 * @author aashgar
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println(sqrt(-100));
    }
    private static double sqrt(double v){
        assert v>=0: "Not valid ...";
        return Math.sqrt(v);
    }
}
