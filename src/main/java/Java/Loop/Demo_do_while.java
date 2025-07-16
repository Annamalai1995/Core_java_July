package Java.Loop;

import java.util.Scanner;

public class Demo_do_while {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int attempt=0;
        int maxattempt=4;
        int pin=1122;
        do {
            System.out.println("enter the 4 Digit pin");
            int enterpin = scan.nextInt();
            if (enterpin == pin) {
                System.out.println("Access the card");
                break;
            } else {
                attempt++;
                System.out.println("Incorrect Pin");
            }

        } while (attempt < maxattempt) ;
    }
}
