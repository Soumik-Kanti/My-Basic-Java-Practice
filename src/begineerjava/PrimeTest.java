
package begineerjava;

import java.util.Scanner;


public class PrimeTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m,n,count=0,totalPrime =0 ;
        System.out.print("Enter Initial Number : ");
        m = input.nextInt();
        
        System.out.print("Enter Ending Number : ");
        n = input.nextInt();
       
        System.out.println();
        for (int i = m; i <=n; i++) 
        {
            
            for (int j = 2; j <i-1; j++) 
            {
                
                if(i%j==0)
                {
                    count++;
                    break;
                    
                }                              
            }
            if(count==0)
            {
                System.out.println(i);
                totalPrime++;
            }
                    
              count = 0;
            
        }
        System.out.println("Total Prime Number : "+totalPrime);
        
    }
    
}
