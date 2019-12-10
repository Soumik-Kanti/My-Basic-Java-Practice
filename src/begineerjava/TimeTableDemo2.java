
package begineerjava;

import java.util.Scanner;


public class TimeTableDemo2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int m , n ;
        
        System.out.print("Enter initial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number : ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            
            for (int j = 1; j <= 10; j++) {
                
                System.out.println(i+" X "+j+ " = "+i*j);
                
            }
            
            System.out.println("\n \n");
        }
    }
    
}
