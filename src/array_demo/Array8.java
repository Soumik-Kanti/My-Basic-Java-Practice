
package array_demo;

import java.util.Arrays;


public class Array8 {
    
    public static void main(String[] args) {
        
        int[] number = {12,5,-38,88,3,6};
        
        Arrays.sort(number);
        
        System.out.print("Ascending : ");
        for (int i = 0; i < 6; i++) {
            
            System.out.print(" "+number[i]);
            
        }
        
        System.out.println();
        
        System.out.print("Decending : ");
        
        for (int i = 5; i >= 0; i--) {
            
            System.out.print(" "+number[i]);
            
        }
        
        System.out.println();
    }
    
}
