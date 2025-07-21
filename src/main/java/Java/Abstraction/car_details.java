package Java.Abstraction;

public class car_details extends Car {
    @Override
    public void Steering() {
        System.out.println("Power Steering");
        System.out.println("Electric Steering");
    }

    @Override
    public void car_name() {
        System.out.println("THAR ROXX");
        System.out.println("AUDI ");
    }

    public static void main(String[] args) {
        Car c= new car_details(); //upcasting
        c.Bike();
        c.Steering();
        c.car_name();

    }
}
