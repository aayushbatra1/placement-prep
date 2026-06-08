package OOP;

class Student2{
    String name;
    int age;
    String branch;

    //constructor
    Student2(String name, int age, String branch){
        this.name = name;
        this.age = age;
        this.branch = branch;
    }
    void introduce(){
        System.out.println("Hi, I'm "+ name + ", " + age + "years old, studying " + branch);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Aayush", 21, "CSE");
        Student2 s2 = new Student2("Rahul", 20, "ECE");

        s1.introduce();
        s2.introduce();
    }
}
