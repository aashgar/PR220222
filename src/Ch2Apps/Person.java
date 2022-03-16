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
public abstract class Person {
//    private String name;
        protected  String name;

    public Person() {
//        this("ali");
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public void showData(){
       System.out.println("Name: "+this.name);
   } 
   public abstract void printData();
}
