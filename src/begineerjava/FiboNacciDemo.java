
package begineerjava;

import java.util.Scanner;


public class FiboNacciDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,fibo;
        System.out.print("How Many Numbers : ");
        n = input.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= n; i++) 
        {
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println();
        
        
    }
    
}
