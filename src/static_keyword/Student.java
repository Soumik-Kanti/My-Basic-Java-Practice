/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_keyword;

/**
 *
 * @author soumi
 */
public class Student {
    
    String name ;
    int id;
    static String universityname = "Dhaka University";
    
    Student(String n, int i){
        
        name = n;
        id = i;
        
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityname);
        
    }
    
}
