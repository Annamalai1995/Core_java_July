package Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        String Names[]={"Balaji","Ashok","Dinesh","Raghul","Kumar"};
        Names[4]="Madhu";
        //System.out.println("Array update"+ Arrays.toString(Names));
        UpdateArray up=new UpdateArray();
        System.out.println("Before Update data:"+Arrays.toString(Names));
         Scanner scan=new Scanner(System.in);
        System.out.println("which index position:"+(Names.length-1));
        int index= scan.nextInt();
        System.out.println("You are selected position"+index +"Position values"+Names[index]);
        System.out.println("Please enter new name:");
        String name=scan.next();
        Names[index]=name;
        System.out.println("After update values is:"+Arrays.toString(Names));

    }
}
