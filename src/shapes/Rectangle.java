package shapes;

public class Rectangle {

//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//perimeter = 2 x length + 2 x width
//area = length x width

    protected double length;

    protected double width;

    public double getArea(){
        System.out.println("Get Rect area");
        return length*width;
    }

    public double getPerimeter(){
        System.out.println("get Perim");
        return (2*length)+(2*width);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//    protected static void getPerimeter() {
//        int perimeter = 2 * length + 2 * width;
//    }
//
//    protected static void getArea() {
//        int area = length * width;
//    }
//
//    public Rectangle() {
//    }

}
