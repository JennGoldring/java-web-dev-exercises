package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amount of gas used (in gallons): ");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        //System.out.print("Your car gets ", + (mpg) " miles per gallon.");
        System.out.printf("Your car gets %.2f miles per gallon.\n", mpg);
    }
}
