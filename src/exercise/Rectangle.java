package exercise;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Integer width;
        Integer length;
        Integer area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        width = input.nextInt();
        System.out.println("Enter the length of the rectangle");
        length = input.nextInt();
        area = width * length;
        System.out.println("Area of the rectangle with dimensions "+ length +"," + width + "is:"+ area);
        input.close();


    }
}
