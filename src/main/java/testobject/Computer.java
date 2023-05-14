package testobject;

public class Computer {

    public String name;
    public int ram;
    public int hdd;
    public double weight;

    public void on() {
        System.out.println("Компьютер включился. Моя модель " + name);
    }

    public void off() {
        System.out.println("Компьютер выключился ");
    }

    public void load() {
        System.out.println("Я загружаюсь. Мой объем = " + hdd + "Гб");
    }
}
