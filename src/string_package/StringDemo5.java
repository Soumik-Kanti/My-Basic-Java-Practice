
package string_package;


public class StringDemo5 {
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Soumik Kanti Barua");
        
        System.out.println(sb);
        
        sb.append(" Ucchash");
        
        sb.append(" "+1995);
        
        System.out.println(sb);
        
        
       //sb.reverse();
        
        //System.out.println(sb);
        
        //sb.delete(0, 5);
        
        //System.out.println(sb);
        
        sb.setLength(5);
        
        System.out.println(sb);
    }
    
}
