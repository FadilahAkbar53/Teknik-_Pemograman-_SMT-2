package Praktek.Exercise2;

public class Main {
    public static void main(String[] args) {
    //cirle
    Circle circle = new Circle();
        
    //Rectangle
    Rectangle rectangle = new Rectangle();
    String s = rectangle.toString();
    System.out.println(s);    

    //TestSquare
    Square square = new Square();
    String p = square.toString();
    double luas,keliling;
    System.out.println(p);
    keliling = square.getPerimeter();
    luas = square.getArea();
    System.out.println(keliling);
    System.out.println(luas);



    }
}
