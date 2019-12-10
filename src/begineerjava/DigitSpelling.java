
package begineerjava;

import java.util.Scanner;


public class DigitSpelling {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int digit;
        
        System.out.printf("Enter the Digit : ");
        digit = input.nextInt();
        
        switch(digit){
            
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
                
            default :
                System.out.println("Not in range");
        }
    }
    
}
