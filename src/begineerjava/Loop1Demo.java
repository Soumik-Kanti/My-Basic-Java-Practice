
package begineerjava;

import java.util.Scanner;


public class Loop1Demo 
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int sum = 0;
        int m,n;
        
        System.out.print("Enter Initial number : ");
        m = input.nextInt();
        
        System.out.print("Enter Final number : ");
        n = input.nextInt();
        
        System.out.println();
        for (int i=m; i<=n; i++)
        {
            if(i%2!=0){
                sum = sum + i;
                    System.out.printf(" "+i);
            }
        }
        
        System.out.println();
        
        System.out.println("The Sum is = "+sum);
    }
}
