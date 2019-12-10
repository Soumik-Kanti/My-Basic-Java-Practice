
package array_demo;


public class Array6 {
    
    public static void main(String[] args) {
        
        int[][] number = new int[4][5];
        int k =0;
        
        
        //Assigning the value of 2 D Array
        for (int row = 0; row < 4; row++) {
            
            for (int col = 0; col < 5; col++) {
                
                number[row][col] = k;
                k++;
            }
            
        }
        
        //Printing the elements
        
        for (int row = 0; row < 4; row++) {
            
            for (int col = 0; col < 5; col++) {
                
                System.out.print("\t "+number[row][col]);
                
            }
            
            System.out.println();
            
        }
    }
    
}
