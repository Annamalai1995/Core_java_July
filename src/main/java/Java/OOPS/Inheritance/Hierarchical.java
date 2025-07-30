package Java.OOPS.Inheritance;
class Tree
{
    public void leaves()
    {
        System.out.println("THE Tress Leaves is the best tree");
    }
}
class steam extends  Tree{
    public void Fruits()
    {
        System.out.println("JackFruit");
    }
}
class branches extends  Tree{
    public void  Treename()
    {
        System.out.println("NEEM TREE");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        branches bb= new branches();
        bb.Treename();
        bb.leaves();
        steam ss=new steam();
        ss.Fruits();

    }
}
