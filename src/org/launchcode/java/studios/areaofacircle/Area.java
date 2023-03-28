package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
//        double area = (3.14 * radius * radius);
        double answer = Circle.getArea(radius);
        System.out.println("The area of your circle is: " + answer);
    }
}
