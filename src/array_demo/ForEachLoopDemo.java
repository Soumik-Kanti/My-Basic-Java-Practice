
package array_demo;


public class ForEachLoopDemo {
    public static void main(String[] args) {
        
        int[] num = {10,20,30,40,50,60,70,80};
        int sum = 0;
        
        for(int x : num){
            
            
            System.out.println(x);
            sum = sum +x;
            
            
        }
        System.out.println("The sum is : "+sum);
    }
    
}
