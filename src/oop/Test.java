
package oop;


public class Test {
    
    public static void main(String[] args) {
        
        //Teacher teacher1;  // object declare
        
        //teacher1 = new Teacher();  // create
        
        //teacher1.name = "Soumik Kanti Barua";
        //teacher1.gender = "Male";
        //teacher1.phone = 015236665545 ;
        
        // teacher1.setInformation("Soumik Kanti Barua","Male",656565686);  //Perametrized method
        
        Teacher teacher1 = new Teacher("Soumik Kanti Barua","Male",656565686); 
        
        teacher1.displayInformation();
        
        
        //System.out.println("Name : "+teacher1.name);
        //System.out.println("Gender : "+teacher1.gender);
        //System.out.println("Phone : "+teacher1.phone);
        
   
        
        
        Teacher teacher2 = new Teacher("Arthi", "Female",845656555);
        
        teacher2.displayInformation();
        
        //teacher2.name = "Arthi Barua";
        //teacher2.gender = "Female";
        //teacher2.phone = 015236665545;
        
        // teacher2.setInformation("Arthi", "Female",845656555); //Initialization
        
     
        
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
        
    }
    
}
