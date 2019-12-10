
package oop;


public class Wrapperdemo {
    
    public static void main(String[] args) {
        
        //Autoboxing | Primitive --> Object
        
        int x = 30;
        
        Integer y = Integer.valueOf(x);
        
        System.out.println(y);
        
        
        Integer z = x; // Autoboxing
        
        System.out.println(z);
        
        //Unboxing | Object --> Primitive
        
        Double d = new Double (10.25);
        System.out.println(d);
        
        //double e = d.doubleValue();
        
        double e = d; // Unboxing
        
        System.out.println(e);
        
    }
    
}
