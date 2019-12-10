package oop;

public class Teacher {

    String name, gender;
    int phone;

    //Perametarized Method
    /* void setInformation(String n,String m,int ph){
        
        name = n;
        gender = m;
        phone = ph;
        
    } */
    //Perameterized Constructor
    Teacher(String n, String g, int p) {

        name = n;
        gender = g;
        phone = p;

    }

    //Default Constructor
    Teacher() {
        
        System.out.println("No value");

    }

    // Display method
    void displayInformation() {

        System.out.println("Name : \t\t" + name);
        System.out.println("Gender : \t" + gender);
        System.out.println("Phone : \t" + phone);
        System.out.println("\n");
    }

}
