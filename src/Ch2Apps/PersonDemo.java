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
        Person[] persons = {
          new Student("Maher",898,88.8),
          new Employee("Sami", 555, 4472.6),
          new SalariedEmployee("Ali", 999, 88.8, 4)
        };
        for(Person person: persons){
            if(person instanceof Employee){
                //person.showData();
                showObject(person);
                System.out.println("=======");
            }
        }
        Shape shape = new Shape("Circle");
        showObject(shape);
   }
    
    private static void showObject(Object o){
        if(o instanceof Shape)
            ((Shape) o).showData();
        else if(o instanceof Person)
            ((Person) o).showData();
    }
}
