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
public class StudentDemo {
    public static void main(String[] args) {
       Student[] students={
          new Student("Ali", 111, 90),
          new Student("Ahmad", 222, 80),
          new Student("Ashraf", 555, 88),
          new Student("Waseem", 333, 91),
           new Student("Somebody", 444, 75)        
        };
        sortStudents(students);
        for(Student student: students)
            System.out.println(student);
    }
    private static void sortStudents(Student[] students){
        for(int i=0; i<students.length; i++)
            for(int j=i+1; j<students.length; j++){
                if(students[i].getSid() > students[j].getSid()){
                    Student studentTemp = students[i];
                    students[i] = students[j];
                    students[j] = studentTemp;
                }
            }
    }
       
}
