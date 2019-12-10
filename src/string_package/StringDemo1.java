
package string_package;


public class StringDemo1 {
    
    public static void main(String[] args) {
        
        String s1 = "Soumik Kanti Barua";
        
        String s2 = new String("soumik Kanti Barua");
        
        //char[] s3 = {'S','o','u','m','i','k'};
        //System.out.println(s3);
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of s1 : "+len);
        
        if(s1.equalsIgnoreCase(s2)){ //equals method and contains method and equalsIgnoreCase
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        boolean con = s1.contains("Sou");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("IS Eempty : "+b);
    }
    
}
