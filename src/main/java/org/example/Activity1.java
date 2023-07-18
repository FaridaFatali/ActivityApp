package org.example;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature! ");

        int degree = scanner.nextInt();
        String activity = "";

        if (degree <=5){
            activity = "Ski";
        } else if (degree <= 15) {
            activity = "Theater";
        } else if (degree <= 25) {
            activity = "Barbecue";
        } else if (degree > 25) {
            activity = "Swimming";
        }
        System.out.println(activity + " will be a good idea for you!");

        }
    }

