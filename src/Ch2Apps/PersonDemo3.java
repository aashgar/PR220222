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
public class PersonDemo3 {
    public static void main(String[] args) {
        Student[] students={
          new Student("Ali", 111, 90),
          new Student("Ahmad", 222, 80),
          new Student("Ashraf", 555, 88),
          new Student("Ashraf", 555, 99),
          new Student("Ashraf", 555, 89),
        };
       sortStudents(students);
       
        for(Student student: students)
            System.out.println(student);
    }
    private static void sortStudents(Student[] students){
        for(int i=0; i<students.length; i++)
            for(int j=i+1; j<students.length; j++)
            if(students[i].getGrade()< students[j].getGrade()){
                Student tempStudent= students[i];
                students[i] = students[j];
                students[j] =tempStudent;
            }        
    }
}
