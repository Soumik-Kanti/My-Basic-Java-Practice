
package overloading_constructor;


public class Overloading_Constructor_Test {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Soumik","Male");
        Teacher teacher3 = new Teacher("Arthi", "Female",845656555);
        
        teacher1.displayInformation();
        teacher2.displayInformation();
        teacher3.displayInformation();
        
    }
    
}
