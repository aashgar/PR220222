/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps3;

/**
 *
 * @author aashgar
 */
public class Library implements Showable{
    private String libname;

    public Library() {
    }

    public Library(String libname) {
        this.libname = libname;
    }

    public String getLibname() {
        return libname;
    }

    public void setLibname(String libname) {
        this.libname = libname;
    }

    @Override
    public void showData() {
        System.out.println("Lib Name: "+this.getLibname());
    }
    
}
