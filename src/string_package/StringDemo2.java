
package string_package;


public class StringDemo2 {
    
    public static void main(String[] args) {
        
        String firstName = "Soumik";
        String lastName = " Barua";
        
        //String fullName = firstName + lastName ;
        String fullName = firstName.concat(lastName) ;
        System.out.println("Full Name : "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("UpperName : "+upperName);
        
        
        String lowerName = fullName.toLowerCase();
        System.out.println("LowerName : "+lowerName);
        
        boolean b = firstName.startsWith("4");
        System.out.println("Is it Starts with S : "+b);
        
        
        boolean c = firstName.endsWith("k");
        System.out.println("Is it Starts with k : "+c);
        
        
        
    }
    
}
