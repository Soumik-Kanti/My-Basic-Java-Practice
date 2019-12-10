
package link;

import java.util.HashSet;


public class HashSetDemo {
    
    public static void main(String[] args) {
        
        HashSet<String> fruitsName = new HashSet<String>();
        
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Lichi");
        fruitsName.add("Mango");
        
        System.out.println(fruitsName);
        System.out.println("Size : "+fruitsName.size());
        
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
        
    }
    
}
