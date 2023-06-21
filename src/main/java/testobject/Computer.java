package testobject;

public class Computer {

    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram>0) {
            this.ram = ram;
        } else {
            System.out.println("Значение" + ram + " не может быть отрицательным");
        }

    }

    public void on() {
        System.out.println("Компьютер включился. Моя модель " + name);
    }

    public void off() {
        System.out.println("Компьютер выключился ");
    }

    public void load() {
        System.out.println("Я загружаюсь. Мой объем ОП = " + ram + "Гб");
    }
}
