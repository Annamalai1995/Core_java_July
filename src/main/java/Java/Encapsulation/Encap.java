package Java.Encapsulation;

public class Encap {
    //Travels
    private String Travel_name;
    private String Source;
    private String Destination;
    private String Date;
    private int price;

    public String getTravel_name() {
        return Travel_name;
    }

    public void setTravel_name(String travel_name) {
        Travel_name = travel_name;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
