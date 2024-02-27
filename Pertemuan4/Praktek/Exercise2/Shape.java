package Praktek.Exercise2;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return isFilled();
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return ("A Shape with color of" + this.color + (this.filled==true) + "and filled/Not filled");
    }
}
