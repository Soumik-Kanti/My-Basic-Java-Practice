
package method_overriding;


public class Test {
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Soumik";
        t1.age = 24;
        t1.Qualification = "Unemployed";
        
        t1.displayInformation();
        
        Person p1 = new Teacher();
        p1.name = "Arthi";
        p1.age = 24;
        p1.displayInformation();
        
    }
    
}
