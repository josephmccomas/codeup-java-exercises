package shapes;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("get Sq area");
        return side*side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("get Sq perim");
        return side*4;
    }

    //
//    public static void getPerimeter() {
//        int perimeter = 4 * side;
//    }
//    public static void getArea() {
//        int area = Math.pow(side, 2);
//    }
}
