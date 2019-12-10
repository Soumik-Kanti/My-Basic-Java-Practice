
package string_package;


public class StringDemo6 {
    
    public static void main(String[] args) {
        
        
        StringBuilder str = new StringBuilder("Soumik");
        
        System.out.println(str);
        
        str.append(" kanti");
        
        System.out.println(str);
        
        
       // str.reverse();
        
        // System.out.println(str);
        
        str.delete(2, 5);
        
        System.out.println(str);

        
    }
    
}
