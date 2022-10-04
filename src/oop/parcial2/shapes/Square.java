package oop.parcial2.shapes;

public class Square extends Shape{
    private int side;

    public Square(int side){
        super(4, "Cuadrado");
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return  side * 4;
    }

    @Override
    public double getArea(){
        return  side * side;
    }
}
