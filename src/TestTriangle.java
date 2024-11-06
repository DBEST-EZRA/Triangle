import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Input side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Input side 3: ");
        double side3 = input.nextDouble();
        System.out.print("Input the color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        try{
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle.toString());
            System.out.println("Triangle Area: " + triangle.getArea());
            System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
            System.out.println("Triangle Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());

        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}