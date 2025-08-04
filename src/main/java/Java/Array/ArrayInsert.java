package Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
//        int a[]=new int[5];
//        a[0]=150;
//        a[1]=250;
//        a[2]=3501;
//        a[3]=450;
//        a[4]=550;
//        System.out.println("Array :"+ Arrays.toString(a));

        int arrayname[]= new int[5];
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<arrayname.length;i++)
        {
            System.out.println("Enter the value");
            arrayname[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(arrayname));



    }
}
