
package array_demo;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo3_Sorting {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
               
        
        number.add(10);
        number.add(-3);
        number.add(97);
        number.add(0);
        number.add(49);
        number.add(36);
        number.add(69);
        
        System.out.println("Before Sorting : "+number);
        
        Collections.sort(number);
        System.out.println("After sorting in ascending : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting in decending : "+number);
    }
    
    
}
