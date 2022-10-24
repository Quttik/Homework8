public class ShapeTest {
    public static void main(String[] args) {
        ShapePrint print = new ShapePrint();
        Circle circle = new Circle();
        Elipse elipse = new Elipse();
        Pentagon pentagone = new Pentagon();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        print.getName(circle);
        print.getName(elipse);
        print.getName(pentagone);
        print.getName(rectangle);
        print.getName(square);
        print.getName(triangle);
    }
}
