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
public class Author implements Showable{
    private String authorname;

    public Author() {
    }

    public Author(String authorname) {
        this.authorname = authorname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public void showData() {
        System.out.println("Author: "+ this.getAuthorname());
    }
    
}
