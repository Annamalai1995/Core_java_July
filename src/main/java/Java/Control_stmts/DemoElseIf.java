package Java.Control_stmts;

import java.util.Scanner;

public class DemoElseIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Tell us Company Name");
        String cmp_name=scan.next();
        if(cmp_name.equalsIgnoreCase("zealous"))
        {
            System.out.println("you r u working in IT sector");

        } else if ( cmp_name.equalsIgnoreCase("cts")) {
            System.out.println("you are working in MNC COMPANY");
        } else if (cmp_name.equalsIgnoreCase("Sutherland")) {
            System.out.println("You are working BPO sector");

        }
        else
        {
            System.out.println("you are not eligible for any company");
        }
    }

}
