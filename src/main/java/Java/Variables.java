package Java;

public class Variables {
    static  String  Name="Varsha";
    int aplha=550;


    public void var()
    {
        int beta=1500;
        System.out.println("BETA VALUE IS:"+beta);
        System.out.println("The alpha value is:"+aplha);
    }

    public static void main(String[] args) {
//        local global static instance

        int cosmo=150;
        System.out.println("The value is "+cosmo);
        System.out.println("The Name is :"+Name);

//        classname  objectname= new classanme()
        Variables vv= new Variables();
        vv.var();
    }
}
