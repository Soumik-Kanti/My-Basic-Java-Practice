
package varargs;


public class AddDemo {
    
    void Add (int ... num){
        
        int sum = 0;
        
        for(int x : num){
            
            sum = sum + x;
        }
        
        System.out.println(sum);
        
    }
    
    
}
