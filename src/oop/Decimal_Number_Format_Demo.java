
package oop;

import java.text.DecimalFormat;


public class Decimal_Number_Format_Demo {
    
    public static void main(String[] args) {
        
        double x = 2.065685656;
        System.out.printf("x = %.2f",x);
        
        System.out.println();
        
        DecimalFormat ob = new DecimalFormat("0.0000");
        System.out.println("x : "+ob.format(x));
        
    }
    
}
