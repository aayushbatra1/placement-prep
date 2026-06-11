package OOP;

class Animal {
    String name;

    Animal(String name){
    this.name=name;
    }
    void sound(){
        System.out.print("Some animal sound");
    }
}
class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog("Bruno");  // Animal reference, Dog object
        Animal a2 = new Cat("Whiskers");  // Animal reference, Cat object

        a1.sound();  // prints "Bruno says: Woof!"
        a2.sound();  // prints "Whiskers says: Meow!"
    }
}
