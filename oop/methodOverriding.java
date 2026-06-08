package OOP;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some animal sound");
    }
}
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
    @Override
    void sound(){
        super.sound();
        System.out.println(name + " says: Woof!");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.sound();
    }

}


