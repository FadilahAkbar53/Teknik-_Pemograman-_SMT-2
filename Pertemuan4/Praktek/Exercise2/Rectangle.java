package Praktek.Exercise2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    //construktor no arg
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // construktor with witdh, length 
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    // construktor with witdh, length, color, fill
    public Rectangle(double width, double length, String color, boolean Fill){
        super(color, Fill );
        this.width = width;
        this.length = length;
    }

    //Methode getArea
    public double getArea(){
        return getLength()*getWidth();
    }

    // Methode getParimeter
    public double getPerimeter(){
        return 2*(getLength()*getWidth());
    }


    //setter getter Atribute width & length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return ("\nA Rectangle with width " + getWidth() + " and " + length + " which is a subclass of " + super.toString() + "\n");
    }
    
}
