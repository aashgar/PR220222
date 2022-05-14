/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6Apps2;

import java.io.EOFException;
import java.io.FileInputStream;
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
public class BinaryFileProcessing {

    private String fileName = "src/Ch6Apps2/employees.dat";

    public void writeToFile() {
        ObjectOutputStream outputStream = null;
        try {
            outputStream
                    = new ObjectOutputStream(new FileOutputStream(fileName));
//            for (int val = 2; val <= 10; val += 2) {
//                outputStream.writeUTF(",_"+val+"_,");
//                outputStream.writeInt(val);
            Employee employee1 = new Employee(111, "Ahmad", "Sales", 800.8);
            Employee employee2 = new Employee(999, "Waseem", "IT", 1505.5);
            outputStream.writeObject(employee1);
            outputStream.writeObject(employee2);
            outputStream.close();

        } catch (IOException ex) {
            Logger.getLogger(BinaryFileProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readFromFile() {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(
                    new FileInputStream(fileName));
//            System.out.println("Val1: "+ inputStream.readInt());
//            System.out.println("Val2: "+ inputStream.readInt());
//            for(int val=1; val<=11; val+=2)
//                System.out.println("Val"+val+": "+ inputStream.readInt());
            while (true) {
                Employee employee = (Employee) inputStream.readObject();
                System.out.println(employee);
            }

            //inputStream.close();
        } catch (EOFException ex) {
            System.out.println("End of File ....");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
