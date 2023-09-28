import java.util.Scanner;

public class Rectangle {

    private int number1;
    private int number2;
    Scanner scanner = new Scanner(System.in);
    
    String enterButton = "runMenu";

    public Rectangle() {

        calculateCircleArea();
    }
    

    public void startMenu() {

        do {

        System.out.println("Please enter two numbers to calculate area of a rectangle");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();    
        

    } while (enterButton.equals("runMenu"));

}

    public int calculateArea(int number1, int number2) {
       calculateCircleArea();
        return number1 * number2;
    }

    public void calculateCircleArea() {

        boolean runCircleAreaMenu = true;

        do {
            // TO implement a function to calculate circle radius in another class
            CircleArea circleArea;
            System.out.println("Calculate Circle test, does this prints out?");

        } while(runCircleAreaMenu);
    }
}
