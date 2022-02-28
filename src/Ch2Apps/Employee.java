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
public class Employee extends Person{
    private long eid;
    private double salary;
    private final int tax=10;

    public Employee() {
     
    }

    public Employee(String name, long eid, double salary ) {
        super(name);
        this.eid = eid;
        this.salary = salary;
    }
    
    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void showData(){
        super.showData();
       System.out.println("ID:" +this.eid);
        System.err.println("Salary: "+ this.salary);
   }
}
