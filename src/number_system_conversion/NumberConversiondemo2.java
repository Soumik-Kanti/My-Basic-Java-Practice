package number_system_conversion;

// Convert  Binary,Octal,Hexadecimal number  into decimal ;
import java.util.Scanner;

public class NumberConversiondemo2 {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a binary number : ");
        //String binary = input.nextInt();
        String binary = "1010";

        Integer decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal : " + decimal);

        String octal = "675";

        Integer decimal2 = Integer.parseInt(octal, 8);

        System.out.println("Decimal : " + decimal2);

        String hexadecimal = "A";

        Integer decimal3 = Integer.parseInt(hexadecimal, 16);

        System.out.println("Decimal : " + decimal3);

    }

}
