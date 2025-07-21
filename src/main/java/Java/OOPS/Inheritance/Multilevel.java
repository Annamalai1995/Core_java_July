package Java.OOPS.Inheritance;

import java.util.Scanner;

class Management{
    public void CEO()
    {
        System.out.println("MD OF MUTHAYAMMAL COLLEGE");
    }
}
class Principal extends Management
{
    public void Prince()
    {
        int age=50;
        float salary=1.5f;
        System.out.println("AGe is:"+age);
        System.out.println("Salary:"+salary);

    }
}
class Teachers extends Principal
{
    public  void students()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Fees Structure");
        int fees=scan.nextInt();
        int hostel_fee=scan.nextInt();
        System.out.println("Fees In:"+fees);
        System.out.println("Hostel Fees is:"+hostel_fee);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Teachers tt =new Teachers();
        tt.CEO();
        tt.Prince();
        tt.students();
    }

}
