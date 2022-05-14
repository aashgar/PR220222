/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6Apps3;

/**
 *
 * @author aashgar
 */
public class FileProcessingDemo {
    
    public static void main(String[] args) {
        FileProcessing fileProcessing = new FileProcessing();
        Employee employee = new Employee(111, "Ali", "Sales", 999.9);
        fileProcessing.writeToFile(employee);
        fileProcessing.readFromFile();
    }
}
