package oop.parcial2.shapes;

public class Rectangle extends Shape {
    private int high;
    private int base;

    public Rectangle(int base , int high){
        super(4,"Rectangulo");
        this.base = base;
        this.high = high;
    }

    @Override
    public double getPerimeter(){
        return  (base + high) * 2;
    }

    @Override
    public double getArea(){
        return  base * high;
    }
}
