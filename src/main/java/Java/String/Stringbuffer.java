package Java.String;

public class Stringbuffer {
    public static void main(String[] args) {

        //String buffer using the methods append insert reverse
        //replace its a modify the string using string  bUffer class
        StringBuffer sb= new StringBuffer("Sathish");
        //Append
        System.out.println(sb);
        System.out.println(sb.append("Kumar"));
        //Insert
        System.out.println(sb.insert(4,"Kumar"));
        //replace
        sb.replace(1,3,"Raja");
        System.out.println(sb);
        //delete
        sb.delete(1,3);
        System.out.println(sb);
        //reverse
        sb.reverse();
        System.out.println(sb);
        

    }
}
