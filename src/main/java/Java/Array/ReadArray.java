package Java.Array;

import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        String company[]={"Wipro","Tcs","Cts","Zoho","Caterpillar"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Array LEngth"+company.length);
        System.out.println("Tell us company Name");
        String IT=scan.next();
        for(int i=0;i<company.length;i++)
        {
            if(IT.equalsIgnoreCase(company[i]))
            {
                System.out.println(i);
                System.out.println("IT COMPANY NAMES:"+IT);
                return;
            }
        }
        System.out.println("Not valid");
    }
}
