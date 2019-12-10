
package type_casting;


public class Test {
    
    public static void main(String[] args) {
        
        int x = 10;
        double y = x;
        System.out.println(y);
        
        double k = 22.5;
        int w = (int) k;
        System.out.println(w);
        
        Person p = new Teacher(); // Upcasting
        p.display();
        
        Teacher t = (Teacher) new Person(); //Downcasting
        t.display();
        
    }
    
}
