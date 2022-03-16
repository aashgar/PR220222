package Ch1Apps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashgar
 */
public class MainApp2 {
    public static void main(String[] args) {
        int arr[][];
//        int val=0;
//        for(int row=0; row< 5; row++)
//            for(int col=0; col<5; col++)
//                arr[row][col] = ++val;

       arr= initialiazeArray();
        
        for(int row=0; row< 5; row++){
            for(int col=0; col<5; col++)
                System.out.print(arr[row][col]+" ");
            
            System.out.println();
        }   
        
        int sum=0;
        for(int row=0; row< 5; row++)
            for(int col=0; col<5; col++)
                if(row == col)
                    sum+= arr[row][col];
        System.out.println("Sum= " + sum);
        
        sum=0;
        for(int row=0; row<5; row++)
            sum+= arr[row][row];
        System.out.println("Sum= " + sum); 
        
        sum=0;
        for(int row=0; row< 5; row++)
            for(int col=0; col<5; col++)
                if(row + col == 4)
                    sum+= arr[row][col];
        System.out.println("Sum= " + sum);
        
        
        sum=0;
        for(int row=0; row<5; row++)
            sum+= arr[row][(arr.length-1) - row];
        System.out.println("Sum= " + sum); 

    }//end main
    
    public static int[][] initialiazeArray(){
        int arr[][] = new int[5][5];
        int val=0;
        for(int row=0; row< 5; row++)
            for(int col=0; col<5; col++)
                arr[row][col] = ++val;
        return arr;
    }
}
