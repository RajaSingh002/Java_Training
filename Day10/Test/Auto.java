package Day10.Test;
abstract public class Auto {
    String name;
    int price=50;
    public Auto(String name) {
        this.name = name;
    }
    abstract void pay();
}
