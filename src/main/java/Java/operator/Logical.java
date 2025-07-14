package Java.operator;

public class Logical {
    public static void main(String[] args) {
        //And OR NOT
        int alpha=30;
        int beta=15;
        System.out.println(alpha>beta && alpha<beta);
        System.out.println(alpha>=beta || beta>alpha);
        System.out.println(!(alpha>beta));
        System.out.println(!(alpha==beta));

    }
}
