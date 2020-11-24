package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius:");
        radius = input.nextDouble();
        while(radius > 0) {

            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius" + radius + " is:" + area);
            System.out.print("Enter a radius:");
            radius = input.nextDouble();

        }
        input.close();
        System.out.println("Enter a valid number");



    }
}
