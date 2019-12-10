
package varargs;


public class Test {
    
    public static void main(String[] args) {
        
        AddDemo ob = new AddDemo();
        
        ob.Add(10, 20);
        ob.Add(10, 20,30);
        ob.Add(10, 20,30,40);
        ob.Add(10, 20,30,40,800);
        ob.Add(10, 20,30,40,50);
        
    }
    
}
