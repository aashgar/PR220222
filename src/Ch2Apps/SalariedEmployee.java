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
public class SalariedEmployee extends Employee{
    private double overTime;

    public SalariedEmployee(double overTime) {
        this.overTime = overTime;
    }

    public SalariedEmployee( 
            String name, long eid, double salary, double overTime) {
        super(name, eid, salary);
        this.overTime = overTime;
    }
    
    public double getOverTime() {
        
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("OverTime: "+ this.overTime);
    }
    
}
