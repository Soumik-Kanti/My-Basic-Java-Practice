
package oop;


public class String_Comparision {
    
    public static void main(String[] args) {
        
        String password1 = "Soumik123";
        String password2 = "soumik123";
        String password3 = new String ("Soumik123");
        String password4 = new String ("Soumik123");
        
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);
        
        System.out.println();
        
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
        System.out.println();
        
        System.out.println(password1.equalsIgnoreCase(password2));
        
        
        
    }
    
}
