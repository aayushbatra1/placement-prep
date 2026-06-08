package OOP;

//parent class
class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void sleep(){
        System.out.println(name + " is sleeping.");
    }
}

//child class
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age); //calls the Animall constructor
    }
    void bark(){
        System.out.println(name + " says: Woof!");
    }
}

//main class
public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno", 3);

        d.eat();
        d.sleep();
        d.bark();
    }
}
