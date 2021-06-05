/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String lengthOfRoomString = myApp.readMeasurement("What is the length of the room in feet? ");
        String widthOfRoomString = myApp.readMeasurement("What is the width of the room in feet? ");
        int lengthOfRoom = myApp.convertMeasurementString(lengthOfRoomString);
        int widthOfRoom = myApp.convertMeasurementString(widthOfRoomString);
        int f2 = myApp.computeF2(lengthOfRoom, widthOfRoom);
        double m2 = myApp.computeM2(f2);
        String outputString = myApp.generateOutputString(lengthOfRoom, widthOfRoom, f2, m2);
        myApp.printOutputString(outputString);
    }

    private String readMeasurement(String str) {
        System.out.print(str);
        String measurement = in.nextLine();
        return measurement;
    }

    private Integer convertMeasurementString(String measurementString) {
        int measurement = Integer.parseInt(measurementString);
        return measurement;
    }

    private int computeF2(int lengthOfRoom, int widthOfRoom) {
        int f2 = lengthOfRoom * widthOfRoom;
        return f2;
    }

    private double computeM2(int f2) {
        double m2 = f2 * 0.09290304;
        return m2;
    }

    private String generateOutputString(int lengthOfRoom, int widthOfRoom, int f2, double m2) {
        return String.format("You entered dimensions of %d by %d feet\nThe area is\n%d square feet\n%f square meters",lengthOfRoom,widthOfRoom,f2,m2);
    }

    private void printOutputString(String outputString) { System.out.println(outputString); }
}
