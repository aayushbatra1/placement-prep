package revision;

class Student{
    String name;
    int age;
    String branch;

    void introduce(){
        System.out.print("Hi, I'm "+ name);
        System.out.print(", " + age + " years old, ");
        System.out.print("studying "+branch);
    }
}

public class introduce {
    public static void main(String[] args) {
        Student intro = new Student();
        intro.name = "Aayush";
        intro.age = 21;
        intro.branch = "CSE";

        intro.introduce();
    }
}
