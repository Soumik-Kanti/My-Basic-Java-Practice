
package link;

import java.util.LinkedList;


public class StudentListDemo {
    
    public static void main(String[] args) {
        
        //student linkedList
        LinkedList<Student> list = new LinkedList<>();
        
        //student create
        
        Student s1 = new Student(101,"Karim","Eleven");
        Student s2 = new Student(102,"Rahim","twelve");
        Student s3 = new Student(103,"Soumik","seven");
        Student s4 = new Student(104,"Arthi","fifteen");
        Student s5 = new Student(105,"Borno","one");
        
        //adding Student
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        //information display
        
        for(Student s : list){
            System.out.println(s.id+"  "+s.name +"  "+s.className);
        }
        
    }
    
}
