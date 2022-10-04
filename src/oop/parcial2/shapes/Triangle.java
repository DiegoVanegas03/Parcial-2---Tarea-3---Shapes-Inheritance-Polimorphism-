package oop.parcial2.shapes;

public class Triangle extends Shape {
    private int high;
    private int base;

    public Triangle(int base, int hight){
        super(3,"Triangulo");
        this.base = base;
        this.high = hight;
    }

    @Override
    public double getPerimeter(){
        return (base * 3);
    }

    @Override
    public double getArea(){
        return  (base * high) / 2;
    }

}
