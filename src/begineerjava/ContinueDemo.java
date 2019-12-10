
package begineerjava;


public class ContinueDemo {
    
    public static void main(String[] args) {
        
        for ( int i = 2; i<=100 ; i=i+2){
            
            if ( i == 10){
                continue;
            }
            
            if ( i > 13){
                break;
            }
            
            
            System.out.println(i);
        }
        
    }
    
}
