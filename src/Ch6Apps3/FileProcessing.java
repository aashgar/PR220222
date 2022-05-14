/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6Apps3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class FileProcessing {

    private String file = "src/Ch6Apps2/employee.data";

    public void writeToFile(Employee employee) {
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(employee);
            outputStream.writeObject(employee);
            outputStream.writeObject(employee);
            outputStream.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    public void readFromFile() {
        ObjectInputStream inputStream = null;
        try {
             inputStream = new ObjectInputStream(new FileInputStream(file));
            while (true) {                
                Employee employee = (Employee) inputStream.readObject();
                System.out.println(employee.getName());               
                System.out.println("X");
            }
            
            
        } catch (EOFException ex) {
            System.out.println("End of file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }
    }

}
