package array_demo;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[3];
        double sum = 0;

        System.out.print("Please Enter 6 numbers : ");

        for (int i = 0; i<number.length; i++) {

            number[i] = input.nextDouble();

        }

        //number[0] = input.nextDouble();
        //number[1] = input.nextDouble();
        //number[2] = input.nextDouble();
        //number[3] = input.nextDouble();
        //number[4] = input.nextDouble();
        //number[5] = input.nextDouble();
        
        
        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];
        }

        //sum = + number[0] + number[1] + number[2] +  number[3] + number[4] + number[5]  ;
        System.out.println("The Sum is : " + sum);

        double avg = sum / number.length;
        System.out.println("The avg is : " + avg);
        
        
        double max = number[0];
        double min = number[0];
        for (int i = 0; i < number.length; i++) {
            
            if (max < number[i]) {
                
                max = number[i];
            }
            
            if (min > number[i]) {
                
                min = number[i];
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimun : "+min);
    }

}
