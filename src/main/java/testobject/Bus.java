package testobject;

public class Bus {

    public int number;
    public String timeArrival;
    public String timeDeparture;
    public double priceTicket;

    public void arrival() {
        System.out.println("Автобус прибывает в " + timeArrival);
    }
    public void departure() {
        System.out.println("Автобус отправляется в " + timeDeparture);
    }
    public void info() {
        System.out.println("Автобус номер " + number);
    }
}
