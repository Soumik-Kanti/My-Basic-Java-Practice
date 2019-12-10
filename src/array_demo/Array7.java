
package array_demo;


public class Array7 {
    
    
    public static void main(String[] args) {
        
        int[][] number = new int[10][];
        int k = 0;
        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];
        number[4] = new int[5];
        number[5] = new int[6];
        number[6] = new int[7];
        number[7] = new int[8];
        number[8] = new int[9];
        number[9] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < i+1; j++) {
                
                number[i][j] = k ;
                k++;
                
            }
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < i+1; j++) {
                
                System.out.print("\t "+number[i][j]);
            }
            
            System.out.println();
            
        }
    }
}
