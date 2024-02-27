package Praktek.Exercise2;

public class Square extends Rectangle{
    // Construktor no arg
    public Square(){
        super();
    }

    // Construktor with double side
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
        return ("A Square with side = " + getSide() +  " , which is a subclass of " + super.toString());
    }
}
