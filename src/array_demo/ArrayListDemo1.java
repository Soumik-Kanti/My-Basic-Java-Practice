
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("Size : "+number.size());
        
        //adding Elements
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        
        System.out.println("Arraylist Conatins : "+number);
        
        /*for(int x : number){
            
            System.out.print(" "+x);
        }
        */
        
        /*Iterator itr = number.iterator();
        
        while(itr.hasNext()){
        
        System.out.print(" "+itr.next());
        
    }

    */
        
        //Removing Elements
        
       /* number.remove(2);
        
        System.out.println("After Removing Arraylist Conatins : "+number); */
       
       
        
        //System.out.println();
        System.out.println("Size : "+number.size());
        
        //number.clear();
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty = "+check);
        
        boolean contain = number.contains(30);
        System.out.println("30 in the list : "+contain);
        
        int pos = number.indexOf(40);
        System.out.println("The index of 40 : "+pos);
        
        number.set(3, 50);  //replace
        System.out.println("After Setting Number : "+number);
        
        int x = number.get(0);
        System.out.println("Index 0 = "+x);
        
        
        
        /*number.removeAll(number);
        System.out.println("After Remove All : "+number);*/
    }
    
}
