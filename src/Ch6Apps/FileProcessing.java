/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch6Apps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class FileProcessing {

    private File file;

    public FileProcessing() {
        this.file = new File("src/Ch6Apps/data105.txt");
//        this.file = new File("data105.txt");
//        this.file = new File("D:/data107.txt");
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
        
    }

    public void writeToFile() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(this.file);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        printWriter.println("ID,Name,Department,Salary");
        printWriter.println("111,Abdallah,IT,1200.5");
        printWriter.println("333,Ali,Sales,900.5");
        printWriter.println("555,Waseem,Security,3000.5");
        printWriter.println("200,Huda,Secratery,600.7");
        printWriter.close();

    }

    public void readFromFile() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(this.file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        String line = scanner.nextLine();
        System.out.println(line);
        while (scanner.hasNext()) {
            String empData = scanner.nextLine();
            String[] empAry = empData.split(",");
            System.out.println("---");
            for(String word: empAry)
                System.out.println(word);
//            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
