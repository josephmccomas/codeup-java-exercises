package shapes;



public class ShapesTest {

//    create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//    verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//    create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//    verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//  perimeter = 4 x side
//  area = side ^ 2
//    Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        System.out.printf("Area: %f%n, Perimeter: %f%n", box1.getArea(), box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("Area: %f%n, Perimeter: %f%n", box2.getArea(), box2.getPerimeter());


//        int[] box1 = {4, 5};
//        int box2 = 5;
    }
}
