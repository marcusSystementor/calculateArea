import java.util.Scanner;

public class CalculateArea {

    Scanner scanner;
    private Rectangle rectangle;
    private int choice;

    public CalculateArea () {
        scanner = new Scanner(System.in);
        rectangle = new Rectangle();


    }

    public void calculateMenu() {
        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 to calculate area of a rectangle");
        System.out.println("Press 2 to calculate area of a circle");

        choice = scanner.nextInt();

        if (choice == 1) {
            rectangle.startMenu();
        }
    }
    
}
