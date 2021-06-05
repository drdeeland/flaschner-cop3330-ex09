/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    final int sqrFtPerGallon = 350;

    public static void main(String[] args) {
        App myApp = new App();

        String lengthString = myApp.setLength();
        String widthString = myApp.setWidth();

        int length = Integer.parseInt(lengthString);
        int width = Integer.parseInt(widthString);

        float area = myApp.areaCalc(length, width);
        double gallons = myApp.gallonCalc(area);

        myApp.printOutput(gallons, area);
    }

    public String setLength() {
        System.out.print("What is the length of the room's ceiling? ");
        return input.nextLine();
    }

    public String setWidth() {
        System.out.print("What is the width of the room's ceiling? ");
        return input.nextLine();
    }

    public float areaCalc(int length, int width) {
        return length * width;
    }

    public double gallonCalc(float area) {
        float gallon = area / sqrFtPerGallon;
        return Math.ceil(gallon);
    }

    public void printOutput(double numGallons, float area) {
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", numGallons, area);
    }
}
