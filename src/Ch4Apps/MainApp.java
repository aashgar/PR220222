 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps;

/**
 *
 * @author aashgar
 */
public class MainApp {
    public static void main(String[] args) {
        Showable lowercase = new Lowercase();
        //howable.show("Lower Case Test..");        
        Uppercase uppercase = new Uppercase();
        ///uppercase.show("Any string...");
        process(lowercase);
        process(uppercase);    }
    
    private static void process(Showable showable){
        showable.show("Testing and validation");
    }
}
