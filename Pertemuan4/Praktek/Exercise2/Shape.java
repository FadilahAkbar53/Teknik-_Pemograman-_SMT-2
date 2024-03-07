package Praktek.Exercise2;

public class Shape {
    // attribute class sahpe
    private String color = "red";
    private boolean filled = true;

    // constructor tanpa parameter
    public Shape(){
        color = "green";
        filled = true;
    }

    // constructor parameter color, filled
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //getter setter atribute color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //getter setter atribute filled
    public boolean isFilled(){
        return isFilled();
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //method toString
    public String toString(){
        return ("A Shape with color of" + this.color + (this.filled==true) + "and filled/Not filled");
    }
}
