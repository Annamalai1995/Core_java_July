package Java.String;

public class String_methods {
    public static void main(String[] args) {
//        String place ="Salem";  //Literal
//        String name=new String("Raghul"); //Non Literal
//        System.out.println(place);
//        System.out.println(name);
//        char college[]={'S','R','M'};
//        System.out.println(college);
        //CharAT()
        //String fullname="Rajesh";
        //System.out.println(fullname.charAt(3));
        //concat joining the two strings
        //String lastname="kumar";
        //System.out.println(fullname.concat(lastname));
        //Equlas
        //String frndname="Balaji";
        //String frndname1="Raghul";
        //String frndname2="raghul";
        //System.out.println(frndname1.equals(frndname));
       // System.out.println(frndname1.equals(frndname2));
        //System.out.println(frndname1.equalsIgnoreCase(frndname2));
        //Lowercase
        //System.out.println(frndname2.toLowerCase());
        //Uppercase
        //System.out.println(frndname1.toUpperCase());

        //Startwith
        //System.out.println(frndname.startsWith("B"));
        //endwith
        //System.out.println(frndname.endsWith("i"));

        //Replace
        String proverb="Hardwork is better than smart work";
        String proverb1=proverb.replace("Hardwork","Welldone");
        System.out.println(proverb1);

        //substring
        String name="Raghul";
        String name1="sathish";
        System.out.println(name1.substring(0,4));
        System.out.println(name.substring(4));


        //Trim
        String cool="Sathish Kumar";
        System.out.println(cool+"        Rajesh");
        System.out.println(cool.trim()+"Rajesh");

    }

}
