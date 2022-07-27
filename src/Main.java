import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hinh Chu Nhat \n" + rectangle.display());
        System.out.println("Chu Vi HCN: " + rectangle.getPerimeter());
        System.out.println("Dien Tich HCN: " + rectangle.getArea());

    }
}