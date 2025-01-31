package Praktek.Exercise1;
/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
 protected double radius;
 private String color; //atribute baru dengan nama color bertipe string
 
 // Constructors (overloaded)
 /** Constructs a Circle instance with default value for radius and color */
 public Circle() { // 1st (default) constructor
 radius = 1.0;
 color = "red";
 }
 
 /** Constructs a Circle instance with the given radius and default color */
 public Circle(double r) { // 2nd constructor
 radius = r;
 color = "red";
 }

 /*new contructor */
public Circle(double radius, String color){
this.radius = radius;
this.color = color;
}

 
 /** Returns the radius */
 public double getRadius() {
 return radius; 
 }
 
 /** Returns the area of this Circle instance */
 public double getArea() {
 return radius*radius*Math.PI;
 }
 /** Return a self-descriptive string of this instance in the form of 
Circle[radius=?,color=?] */
 public String toString() {
 return "Circle[radius=" + radius + " color=" + color + "]";
 }

// getter sertter color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



 
 
}