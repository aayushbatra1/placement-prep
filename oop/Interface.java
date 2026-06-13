package OOP;

interface Flyable{
    void fly(); //automatically public and abstract
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable, Swimmable { //implementing multiple interfaces
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.print("Duck is swimming.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
