package shapes;

public abstract class Quadrilateral {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {

    }

    public double getLength() {
        return length;
    }

    protected void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }
}
