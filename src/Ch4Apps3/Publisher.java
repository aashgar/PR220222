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
public class Publisher implements Showable{
    private String pubname;

    public Publisher() {
    }

    public String getPubname() {
        return pubname;
    }

    public void setPubname(String pubname) {
        this.pubname = pubname;
    }

    public Publisher(String pubname) {
        this.pubname = pubname;
    }

    @Override
    public void showData() {
        System.out.println("Publisher: "+ this.getPubname());
    }
    
}
