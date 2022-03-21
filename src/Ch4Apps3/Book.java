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
public class Book extends Library implements Comparable{
    private String bookname;
    private int pubyear;
    private Author author;
    private Publisher publisher;

    public Book( String libname, String bookname, int pubyear, Author author, Publisher publisher) {
        super(libname);
        this.bookname = bookname;
        this.pubyear = pubyear;
        this.author = author;
        this.publisher = publisher;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPubyear() {
        return pubyear;
    }

    public void setPubyear(int pubyear) {
        this.pubyear = pubyear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Book Name: "+ this.getBookname());
        System.out.println("Pub Year: "+ this.getPubyear());
        this.getAuthor().showData();
        this.getPublisher().showData();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getBookname()
         .equals(((Book)obj).getBookname()) &&
        this.getPubyear() == ((Book)obj).getPubyear() &&
          this.getAuthor().getAuthorname()
          .equals(((Book)obj).getAuthor().getAuthorname())
                && 
           this.getPublisher().getPubname()
      .equals(((Book)obj).getPublisher().getPubname());
                
    }

    @Override
    public int compareTo(Object o) {
        if(getPubyear() > ((Book) o).getPubyear())
            return +1;
        else if(getPubyear() < ((Book) o).getPubyear())
            return -1;
        return 0;
    }
   
}
