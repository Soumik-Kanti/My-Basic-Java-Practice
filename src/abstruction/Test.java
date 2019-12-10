
package abstruction;


public class Test {
    
    public static void main(String[] args) {
        
        MobileUser mu ; ///Referance Variable
        
        mu = new Rahim();
        mu.call();
        mu.sendMessage();
        
        mu = new Karim();
        mu.sendMessage();
        
        
        
    }
    
}
