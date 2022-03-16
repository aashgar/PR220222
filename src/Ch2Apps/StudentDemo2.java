/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Apps;

import java.util.Arrays;

/**
 *
 * @author aashgar
 */
public class StudentDemo2 {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,9,22,15,4};
//        sortStudents(arr);
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" , ");
    }
    
//    private static void sortStudents(int[] arr){
//        for(int i=0; i<arr.length; i++)
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int v = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = v;
//                }
//            }
//    }
}
