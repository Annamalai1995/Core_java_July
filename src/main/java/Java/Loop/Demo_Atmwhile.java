package Java.Loop;

import java.util.Scanner;

public class Demo_Atmwhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int attempt=0;
        int maxattempt=4;
        int pin=1122;
        while(attempt<maxattempt)
        {
            System.out.println("Enter the 4 digit pin");
            int enterpin=scan.nextInt();
            if(enterpin==pin)
            {
                System.out.println("Access the card");
                break;
            }
            else {
                System.out.println("Incorrect pin");
                attempt++;
            }

        }

    }
}
