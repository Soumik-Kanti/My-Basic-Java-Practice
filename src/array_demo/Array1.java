
package array_demo;


public class Array1 {
    
    public static void main(String[] args) {
        
        int number[] = new int[10];
        
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        
        int sum = number[0] + number[4] + number [2];
        System.out.println("Sum : "+sum);
        
        int len = number.length;
        System.out.println("Array Size : "+len);
        
        
    }
    
}
