package Praktek.Exercise2;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double Rad){
        super();
        this.radius=Rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  Math.PI*getRadius()*getRadius();
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString(){
        return ("A Circle with radius" + getRadius() + "which is a subclass " + super.toString());
    }
    



}
