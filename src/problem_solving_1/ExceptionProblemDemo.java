package problem_solving_1;

import java.util.Scanner;

public class ExceptionProblemDemo {

    public static void main(String[] args) {

        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please Enter num1 : ");
                int num1 = input.nextInt();
                System.out.print("Please Enter num2 : ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
                count = 2;
            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You mast enter Integer , Please Try again");
            }
        }while(count == 1);

    
    }

}
