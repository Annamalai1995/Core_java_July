package Java.Control_stmts;

import java.util.Scanner;

public class Demo_if {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the age");
        int age =scan.nextInt();
        if(age>=25)
        {
            System.out.println("welcome to wonderla");
            System.out.println("Thrilling Games");
            System.out.println("Enter the Gender");

            String gender=scan.next();
            if(gender.equalsIgnoreCase("Male")||(gender.equalsIgnoreCase("male")))
            {
                System.out.println("water level is 40M");
             }
            else {
                System.out.println("water level is 20m");
            }

        }
        else
        {
            System.out.println("Thank you visit again");
        }

    }

}
