import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Prompt the User to input the side length
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        //Compute the area of a hexagon
        double area = (6 * Math.pow(side,2))/(4 * Math.tan(Math.PI/6));

        //Display result
        System.out.printf("The area of the hexagon is " + area);
    }
}
