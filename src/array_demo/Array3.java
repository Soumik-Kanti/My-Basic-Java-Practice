
package array_demo;


public class Array3 {
    
    public static void main(String[] args) {
        
        /*String[] names = new String[4];
        
        names[0]= "Soumik";
        names[1]= "Turja";
        names[2]= "Arthi";
        names[3]= "Barna"; */
        
        String[] names = {"Soumik","Arthi","Turja","Barun"};
        
        System.out.println(names.length);
        
        //for (int i = 0; i < 4; i++) {
        
        
        ///forEach loop
        for (String x : names){
            
            System.out.println(x); 
        }

    }
    
}
