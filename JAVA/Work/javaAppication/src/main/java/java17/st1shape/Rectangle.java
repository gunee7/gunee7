package java17.st1shape;

public class Rectangle {
    public int widht;
    public int height;
    
    public int getWidht() {
        return widht;
    }
    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height + "]";
    }
    public Rectangle() {
        super();
    }
    public Rectangle(int widht, int height) {
        super();
        this.widht = widht;
        this.height = height;
    }

}
