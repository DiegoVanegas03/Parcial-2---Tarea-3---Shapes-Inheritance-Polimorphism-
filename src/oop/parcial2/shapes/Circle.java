package oop.parcial2.shapes;

public class Circle extends Shape {
    private int radio;

    public Circle(int radio) {
        super(1, "Circulo");
        this.radio = radio;
    }

    @Override
    public double getPerimeter(){
        return  Math.PI * radio * 2;
    }

    @Override
    public double getArea(){
        return  Math.PI * Math.pow(radio , 2);
    }
}
