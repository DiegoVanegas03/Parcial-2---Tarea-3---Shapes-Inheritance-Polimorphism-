package oop.parcial2.shapes;

public  abstract class Shape {
    private int sideCounts;
    private String name;

    public Shape(int sideCounts, String name) {
        this.sideCounts = sideCounts;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getSidesCount(){
        return sideCounts;
    }

    public abstract  double getPerimeter();

    public abstract  double getArea();
}
