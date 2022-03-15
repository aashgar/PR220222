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
public class PersonDemo2 {
    public static void main(String[] args) {
        Person person = new Student("sss", 222, 90);
        Object[] persons={
          new Student("Ali", 111, 90),
          new Student("Ahmad", 222, 80),
          new Student("Ashraf", 555, 88),
          new Employee("Mostafa", 999, 8889),
         
        };       
        System.out.println(calcTotalGrade(persons));
        Shape shape = new Shape("Rectangle");
        System.out.println(shape); 
       
    }    
    private static double calcTotalGrade(Object[] persons){
        double sum=0;
        int count = 0;
        for(Object p: persons){
            if(p instanceof Student){
                sum += ((Student) p).getGrade();
                count++;
            }
        }
        return sum/count;
    }
}
