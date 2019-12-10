
package array_demo;

import java.util.Scanner;


public class SumOfDiagonal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int [][] A = new int [3][3];
        int sumOfdiagonalElements =0;
        int sumOfUpperElements =0;
        int sumOfLowerElements =0;
        
        System.out.println("Please Enter Matrix A : ");
        //Matrix input
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                System.out.printf("B[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
                
                
            }
            
        }
        
        //diagonal,upper,lower
        for (int row = 0; row < 3; row++) {
            
            for (int col = 0; col < 3; col++) {
                
                if(row==col){
                    
                    sumOfdiagonalElements = sumOfdiagonalElements + A[row][col];
                }
                
                if (row<col){
                    
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }
                
                if (row>col){
                    
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }
                
                
            }
            
        }
        
        System.out.println("Sum of Diagonal Elements : "+sumOfdiagonalElements);
        System.out.println("Sum of Diagonal Elements : "+sumOfUpperElements);
        System.out.println("Sum of Diagonal Elements : "+sumOfLowerElements);
        
        
        
    }
    
}
