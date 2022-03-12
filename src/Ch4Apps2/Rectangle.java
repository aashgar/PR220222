/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps2;

/**
 *
 * @author aashgar
 */
public class Rectangle implements Measurable, Showable{
    private double width;
    private double hieght;

    public Rectangle(double width, double hieght) {
        this.width = width;
        this.hieght = hieght;
    }
    
    @Override
    public double getperimeter() {
        return 2 * (width + hieght);
    }

    @Override
    public double getArea() {
       return width * hieght;
    }

    @Override
    public String showData(String str) {
        return str.toUpperCase();
    }

    @Override
    public void print() {
    }
    
}
