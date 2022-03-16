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
public class Circle implements Measurable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getperimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void print() {
    }
    
}
