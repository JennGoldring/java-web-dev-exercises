package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a radius in inches: ");
        double radius;

        while (true){
            if (input.hasNextDouble()){
                radius = input.nextDouble();
                if (radius >= 0) {
                    break;
                }
            }
            input.nextLine();
            System.out.print("Invalid input. Please enter a positive number.");
        }

//        double area = (3.14 * radius * radius);
        double answer = Circle.getArea(radius);
        System.out.println("The area of your circle is " + answer + " inches.");
    }
}
