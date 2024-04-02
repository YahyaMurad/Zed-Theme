import java.util.Scanner;

public class CalculateArea {
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = calculateArea(width, height);
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
