
package polymorphism1;


public class Rectangle extends Shape{
    
    double length,width;
    
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){
        System.out.print("Area for Triangle : ");
        return length * width;
    }
    
}
