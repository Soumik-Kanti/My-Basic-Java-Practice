
package method_overriding;


public class Teacher extends Person {
    
    String Qualification;
    
    @Override
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+Qualification);
        
    }
    
}
