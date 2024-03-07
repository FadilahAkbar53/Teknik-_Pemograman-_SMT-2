package Praktek.Exercise2;
public class Circle extends Shape {
    //atribute circle
    private double radius;

    // constructor tanpa parameter
    public Circle(){
        super();
        radius = 1.0;
    }
    
    // constructor parameter rad/radius
    public Circle(double Rad){
        super();
        this.radius=Rad;
    }

    //getter setter radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method getArea
    public double getArea(){
        return  Math.PI*getRadius()*getRadius();
    }

    // method getPerimeter
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    // override methode toString
    @Override
    public String toString(){
        return ("A Circle with radius" + getRadius() + "which is a subclass " + super.toString());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        String s = c.toString();
        double luas = c.getArea();
        double keliling = c.getPerimeter();
        System.out.println(s);
        System.out.println("luas = " + luas + " keliling = " + keliling);
    }
}
