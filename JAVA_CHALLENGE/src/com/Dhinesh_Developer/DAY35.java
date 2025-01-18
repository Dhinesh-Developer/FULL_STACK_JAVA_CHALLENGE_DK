package DAY;

import java.util.Scanner;

abstract class Shape{
    float area;
    abstract public void acceptInput();
    abstract public void calcArea();

    public void displayArea(){
        System.out.println(area);
    }
}

class square extends Shape{
    private float side;
    Scanner in = new Scanner(System.in);
    @Override
    public void acceptInput() {
        System.out.println("Enter the Side ");
        side = in.nextFloat();
    }

    @Override
    public void calcArea() {
        area = side * side;
    }

}

class Rectangle extends Shape{
    private float length;
    private float breadth;
    Scanner in = new Scanner(System.in);
    @Override
    public void acceptInput() {
        System.out.println("Enter the length");
        length = in.nextFloat();
        System.out.println("Enter the breadth");
        breadth = in.nextFloat();
    }

    @Override
    public void calcArea() {
        area = length*breadth;
    }
}

class Circle extends Shape{
    private float radius;
    private static final float PI = 3.14f;
    Scanner in = new Scanner(System.in);
    @Override
    public void acceptInput() {
        System.out.println("Enter the radius");
        radius = in.nextFloat();
    }

    @Override
    public void calcArea() {
        area = PI * radius;
    }
}

class Geometry{
    public void permit(Shape ref){
        ref.acceptInput();
        ref.calcArea();
        ref.displayArea();
    }
}
public class DAY35 {
    public static void main(String[] args) {
        square s = new square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Geometry g = new Geometry();

        g.permit(s);
        g.permit(r);
        g.permit(c);

    }
}
