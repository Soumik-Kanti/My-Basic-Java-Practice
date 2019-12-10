
package problem_solving_1;


public class Circle extends Shape{
    
    
    Circle(double r){
        super(r,r);
    }
    
    @Override
    void area(){
        double result = 3.1416*dim1*dim2;
        System.out.println("Circle area : "+result);
    }
    
}
