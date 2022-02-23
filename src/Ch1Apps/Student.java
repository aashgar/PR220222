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
public class Student {
    private int id;
    private String name;
    private double grade;
    private static int count=0;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
    
    public Student() {
        System.out.println("I am constructor of Student");
        ++count;
    }

    public Student(int id, String name, double grade) {
//        this.id = id;
//        this.name = name;
//        this.grade = grade;
        this.setId(id);
        this.setName(name);
        this.setGrade(grade);
        ++count;
    }
    
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    /**
     * 
     * @param mid
     * @param lab
     * @param fin
     * @return the grade of these params as mid*30% + lab*20% + fin *50%
     */
    public double calculateGrade(int mid, int lab, int fin){
        return calc(mid, lab, fin);
    }
     public double calculateGrade(int mid, int lab){
        return mid*0.30 + lab*0.20;
    }
    private double calc(int mid, int lab, int fin){
        return mid*0.30 + lab*0.20 + fin*0.50;
    }
    
    public String showData(){
       return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade + '}';
    }
    
    
    public boolean isEqual(Student student){
       if(student.getId() == this.id && 
               student.getName().equals(this.name) &&
               student.getGrade() == this.grade)
           return true;
            
        return false;
    }
    
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade + '}';
    }
    
}
