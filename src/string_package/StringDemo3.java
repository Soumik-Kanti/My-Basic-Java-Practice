
package string_package;


public class StringDemo3 {
    
    public static void main(String[] args) {
        
        String country = "  Bangladesh is my country  ";
        System.out.println("Statement : "+country);
        
        String s3 = country.trim();
        System.out.println(s3);
        
        char ch = country.charAt(0);
        System.out.println("At 0 index : "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Value : "+value);
        
        int pos = country.indexOf("n");
        System.out.println("first position of is : "+pos);
        
        
        pos = country.lastIndexOf("n");
        System.out.println("first position of is : "+pos);
        
    }
    
}
