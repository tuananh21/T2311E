import java.util.Scanner;

public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void printResult();


}

class Data {
     public void inputData() {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the side of the Square: ");
         double side = scanner.nextDouble();
         Shape square = new Square(side);
         square.printResult();

         System.out.print("Enter the radius of the Circle: ");
         double radius = scanner.nextDouble();
         Shape circle = new Circle(radius);
         circle.printResult();

         System.out.print("Enter the sides of the Triangle: ");
         double sideA = scanner.nextDouble();
         double sideB = scanner.nextDouble();
         double sideC = scanner.nextDouble();
         Shape triangle = new Triangle(sideA, sideB, sideC);
         triangle.printResult();

         scanner.close();
     }
}




