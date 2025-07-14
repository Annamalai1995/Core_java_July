package Java;

public class variables1 {
    static String College="Muthayammal";   //static
    int rollno=501; //instance

    public void yuva()     //local
    {
        String Name="Yuvaraj";
        int age=20;
        System.out.println("Name is"+Name);
        System.out.println(age);
        System.out.println(College);
        System.out.println(rollno);

    }
    public static void main(String[] args) {
        //local global static Instance
        String name="Raghul";   //global
        System.out.println("String Name is:"+name);
        System.out.println("College Name is"+College);


        //calling method
        //syntax:
        //classname objectname=new classname()
        variables1 vv= new variables1();
        vv.yuva();
    }
}
