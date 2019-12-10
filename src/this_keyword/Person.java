
package this_keyword;


public class Person {
    
    String name;
    int age;
    String haircolor;
    
    
   /* Person(String name, int age,String haircolor){
        this(name,age);
        this.haircolor = haircolor;
    }
    
    
    Person(String name, int age){
        
        this.name = name;
        this.age = age;
        
    }  */
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display(){
        //System.out.println("Name : "+name);
        //System.out.println("Age : "+age);
        //System.out.println("Haircolor : "+haircolor);
        
        this.message();
        System.out.println("I am display method");
    }
}
