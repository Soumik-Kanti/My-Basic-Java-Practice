
package oop;


public class CallByReferanceTest {
    
    public static void main(String[] args) {
        
        CallByReferance r1 = new CallByReferance();
        
        r1.name = "Soumik";
        
        System.out.println("before calling : "+r1.name);
        
        r1.change(r1);
        
        System.out.println("after calling : "+r1.name);
    }
    
}
