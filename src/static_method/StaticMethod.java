
package static_method;


public class StaticMethod {
    
    void display1(){
        
        //display2();
        System.out.println("I am non-static method");
        
    }
    
    static void display2(){
        
        // display1(); //Showing Error
        System.out.println("I am static method");
        
    }
    
}
