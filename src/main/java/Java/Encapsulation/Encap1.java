package Java.Encapsulation;

public class Encap1 {
    public static void main(String[] args) {
        Encap ee= new Encap();
        ee.setTravel_name("Swamy Ayyappa");
        ee.setSource("Salem");
        ee.setDestination("chennai");
        ee.setDate("21/07/2025");
        ee.setPrice(650);


        System.out.println("Travels Name"+ee.getTravel_name());
        System.out.println("Source"+ee.getSource());
        System.out.println("Destination"+ee.getDestination());
        System.out.println("DATE OF JOURNEY"+ee.getDate());
        System.out.println("TICKET FARE"+ee.getPrice());

    }
}
