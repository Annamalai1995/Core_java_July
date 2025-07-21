package Java.Polymorphism;

public class Overloading {
    public void Add(int alpha,int beta)
    {
        if(alpha==beta)
        {
            System.out.println("Both values are equal");
        }
        else if(alpha!=beta)
        {
            System.out.println("Not equal to");
        }
        else {
            System.out.println("Not valid");

        }
    }
    public  void Add(float alpha,float beta)
    {
        float res=alpha*beta;
        System.out.println("Float Value is:"+res);
    }

    public static void main(String[] args) {
        Overloading oo = new Overloading();
        oo.Add(12545,450);
        oo.Add(14.5f,15.5f);

    }
}
