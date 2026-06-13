package OOP;

abstract class Shape{
    abstract void area(); //no body - child must implement this

    void display(){
        System.out.println("I am a shape."); //has body - optional to override
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void area(){
        System.out.println("Circle area: "+ 3.14 * radius * radius);
    }
}
class Rectangle extends Shape{
    double length, width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void area(){
        System.out.println("Rectangle area: " + (length * width));
    }
}
class Triangle extends Shape{
    double base, height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    void area(){
        System.out.println("Triangle area: " + (0.5 * base * height));
    }
}
public class abstractClasses {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4,6);
        Shape s3 = new Triangle(4,6);

        s1.area();
        s2.area();
        s3.area();
        s1.display();
    }
}
