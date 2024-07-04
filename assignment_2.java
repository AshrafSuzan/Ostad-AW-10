// Base class
class Shape {
  
    public void draw() {
        System.out.println("Drawing a Shape");
    }
    
    public double calculateArea() {
        return 0.0;
    }
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    // Override draw method
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    // override calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // override draw method
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    // overridecalculateArea method
    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // override draw method
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    // cverride calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

//Main
public class ShapeTest {
    public static void main(String[] args) {
       
        Shape circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape square = new Square(4.0);
        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        Shape triangle = new Triangle(3.0, 6.0);
        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
