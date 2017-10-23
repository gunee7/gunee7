package java17.st1shape;

public class Circle {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    public Circle() {
        super();
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    
}
