
package encapsulation;


public class EncapTest {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();
        
        p1.setName("Soumik");
        
        System.out.println("Name : "+p1.getName());
        
        p1.setAge(24);
        
        System.out.println(p1.getAge());
        
        //p1.display();
        
    }
    
}
