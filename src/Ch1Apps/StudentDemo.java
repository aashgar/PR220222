package Ch1Apps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashgar
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student  student1 = new Student(111, "Ali", 90.2);
        Student student2 = new Student(222, "Ali", 90.3);
         Student student3 = new Student(555, "Ahmad", 90.1);
        System.out.println(student1.getCount());
        System.out.println(student3.getCount());
        System.out.println(Student.getCount());
        
//        Character c = 'a';
       
//        System.err.println(Character.toUpperCase('b'));
//        System.out.println(student1.isEqual(student2));
//        student1.setId(111);
//        student1.setName("Ali");
//        student1.setGrade(student1.calculateGrade(80, 90, 77));
//        System.out.println(student1.showData());
//        
//        Student  student2 = new Student();
//        student2.setId(555);
//        student2.setName("Ahmad");
//        student2.setGrade(student2.calculateGrade(80, 100, 77));
//        System.out.println(student2.showData());
        //System.out.println(student2);  
//        student1 = student2;
//        System.out.println(student1 == student2);
//        System.out.println(student1);
//        System.out.println(student2);
    }
 
}
