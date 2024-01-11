public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 50);
        Square square = new Square(10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Parameter of Rectangle: " + rectangle.getParameter());
        System.out.println();
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Parameter of Square: " + square.getParameter());
    }
}