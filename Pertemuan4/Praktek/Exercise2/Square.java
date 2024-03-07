package Praktek.Exercise2;

public class Square extends Rectangle{
    // Construktor tanpa parameter
    public Square(){
        super();
    }

    // Construktor parameter double side
    public Square(double side){
        super(side, side);
    }
    
    //Setter getter side
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getLength();
    }

    //override methode getArea
    @Override
    public double getArea(){
        return getSide()*getSide();
    }

    //override methode getPerimeter
    @Override
    public double getPerimeter(){
        return getSide()*4;
    }

    //override methode toString
    @Override
    public String toString(){
        return ("A Square with side = " + getSide() +  " , which is a subclass of ");
    }

    public static void main(String[] args) {
        Square square = new Square();
    String p = square.toString();
    double luas,keliling;
    System.out.println(p);
    keliling = square.getPerimeter();
    luas = square.getArea();
    System.out.println("Keliling = " + keliling);
    System.out.println("Luas = "+luas);
    }
}
