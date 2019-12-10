
package link;

import java.util.HashMap;


public class HashMapDemo {
    
    public static void main(String[] args) {
        //put,get
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        
        customer.put(101, "Soumik");
        customer.put(102, "Arthi");
        customer.put(103, "Barna");
        
        System.out.println(customer.get(102));
    }
    
}
