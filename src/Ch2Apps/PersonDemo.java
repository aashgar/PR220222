/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Apps;

/**
 *
 * @author aashgar
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Person person1 = new Employee();
        Person person2 = new Student();
        Person[] persons = {
            new Student(),
            new Employee()
        };
        
    }
}
