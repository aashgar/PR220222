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
public class Student extends Person{
    private int sid;
    private double grade;

    public Student(int sid, double grade) {
        this.sid = sid;
        this.grade = grade;
    }

    public Student( String name,int sid, double grade) {
        super(name);
        this.sid = sid;
        this.grade = grade;
    }

    public int getSid() {
        
        return sid;
    }

    public void setSid(int sid) {        
        this.sid = sid;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ID: "+ this.sid);
        System.out.println("Grade: "+ this.grade);
    }
    
    
}
