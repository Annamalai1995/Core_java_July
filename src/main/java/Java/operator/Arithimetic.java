package Java.operator;

import java.awt.*;
import java.util.Scanner;

public class Arithimetic {
    public static void main(String[] args) {
//        int alpha=250;
//        int beta=450;
//        int result=0;
//        result=alpha+beta;
//        System.out.println("The Addition"+result);
//        result=alpha-beta;
//        System.out.println("The Subtraction:"+result);
//        result=alpha*beta;
//        System.out.println("The Multiply"+result);
//        result=alpha/beta;
//        System.out.println("The divison:"+result);
//        result=alpha%beta;
//        System.out.println("The Modulo:"+result);

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Alpha value");
        int alpha=scan.nextInt();
        System.out.println("Enter The Beta value");
        int beta=scan.nextInt();
        int result=alpha+beta;
        System.out.println("The Result is"+result);




    }
}
