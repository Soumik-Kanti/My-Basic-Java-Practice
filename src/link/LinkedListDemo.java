
package link;

import java.util.LinkedList;


public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<String> countryNames = new LinkedList<String>();
        
        countryNames.add("Bangladesh");
        countryNames.add("Bhutan");
        countryNames.add("Laos");
        countryNames.add("Srilanka");
        countryNames.add("India");
        countryNames.add(5,"Brazil");
        countryNames.addFirst("S.Africa");
        countryNames.addLast("Japan");
        
        //countryNames.remove("Japan");
        //countryNames.remove(7);
        //countryNames.removeFirst();
        
        
        
        
        
        System.out.println(countryNames);
        
        for(String country : countryNames){
            System.out.println(country);
        }
        
        System.out.println("Size of the LinkedList : "+countryNames.size());
        
        System.out.println("First Element : "+countryNames.getFirst());
        System.out.println("First Element : "+countryNames.getLast());
        
        countryNames.clear();
        System.out.println(countryNames);
        
    }
    
}
