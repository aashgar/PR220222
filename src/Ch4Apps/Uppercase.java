/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps;

/**
 *
 * @author aashgar
 */
public class Uppercase implements Showable{

    @Override
    public void show(String str) {
        System.out.println(str.toUpperCase());
    }

    @Override
    public int sum(int x, int y) {
        return x+y;
    }
    
}
