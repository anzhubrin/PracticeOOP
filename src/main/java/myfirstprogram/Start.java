package myfirstprogram;

import testobject.Bd;
import testobject.Bus;
import testobject.Computer;
import testobject.Dog;

public class Start {
    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.name = "IBM";
        comp.hdd = 350;
        comp.on();
        comp.load();
        comp.off();

        Bus bus = new Bus();
        bus.timeArrival = "11:30";
        bus.timeDeparture = "11:50";
        bus.number = 448;
        bus.arrival();
        bus.departure();
        bus.info();

        Dog dog = new Dog();
        dog.name = "Rex";
        dog.age = 5;
        dog.dogInfo();

        Bd bd = new Bd();
        bd.name = "javaBD";
        bd.nTable = 10;
        bd.amount = 400.5;
        bd.add();
        bd.info();
    }
}
