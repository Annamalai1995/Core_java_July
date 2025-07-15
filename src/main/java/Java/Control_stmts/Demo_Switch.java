package Java.Control_stmts;

import java.util.Scanner;

public class Demo_Switch {
    public static void main(String[] args) {
        //syntax:
//        switch(expression)
//        {
//            case value :
//                stmts;
//                break
//             case value 2:
//                 stmts
//                 break;
//            .
//            .
//            .
//            .
//            .
//            default:
//                stmts;
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell us vowels letter");
        String vowels=scan.next();
        switch (vowels)
        {
            case "a":
                System.out.println("A is vowels");
                break;
            case "e":
                System.out.println("E is vowels");
                break;
            case "i":
                System.out.println("I is vowels");
                break;
            case "o":
                System.out.println("O is vowels");
                break;
            case "u":
                System.out.println("U is vowels");
                break;
            default:
                System.out.println("Not a Vowels");
        }



    }
}
