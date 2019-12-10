
package oop;


public class staticBlock {
    
    static int id;
    static String name;
    
    //Static Block
    static{
        
        id = 101;
        name ="Soumik";
        
    }
    
    static void display(){
        
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        
    }
    
    public static void main(String[] args) {
        
        staticBlock.display();
    }
    
}
