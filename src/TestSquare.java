public class TestSquare {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = new Square(5.0);
        geometricObjects[1] = new Square(10.0);
        geometricObjects[2] = new Square(7.0);
        geometricObjects[4] = new Square(4.0);
        geometricObjects[3] = new Square(12.0);

        for (GeometricObject object : geometricObjects) {
            System.out.println("Area: " + object.getArea());

            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }
}