
package file;

import java.util.Formatter;
import java.util.Scanner;


public class fileDemo2 {
    
    public static void main(String[] args) {
        
        String id,name;
        try{
            Formatter formatter = new Formatter("F:/JAVA CODE/BegineerJava/person/student.txt");
            
            Scanner input = new Scanner(System.in);
            System.out.print("How many students : ");
            int num = input.nextInt();
            
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Student Id and  Name : ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n",id,name);
            }
            
            formatter.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
