package Java.Array;

import java.util.Arrays;

public class create {
    public static void main(String[] args) {
        //SYntax
        //datatype arrayname[]
        //int a[];
        //Instanstation
        //int a[]=new int(5)
        //Array start with-0 end with n-1
        //length =5--> 0 1 2 3 4
        String College[]={"SATHYABAMA","PSG","VIT","SRM","BANNARIAMMAN","KARPAGAM","SNS"};
        System.out.println("Array values is"+College);

        //First MEthod
        System.out.println("Array values:"+ Arrays.toString(College));
        //Second MEthod
        for(int i=0;i<College.length;i++)
        {
            System.out.println("Array values:"+College[i]);
        }

//Syntax  FOR EACH LOOP
//        for(variablename:arrayname)
//        {
//            stmts
//        }
        for(String college_name:College)
        {
            System.out.println(college_name);
        }
        System.out.println(Arrays.toString(College));





    }
}
