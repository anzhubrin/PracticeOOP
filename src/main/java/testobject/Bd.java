package testobject;

public class Bd {

    public String name;
    public int nTable;
    public double amount;

    public void add() {
        System.out.println("База данных " + name + "с объемомом " + amount + " успешно добавлена");
    }
    public void info() {
        System.out.println("Количество таблиц " + nTable);
    }
}
