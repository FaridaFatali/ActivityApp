package org.example;

/**
 * Exercise: https://www.youtube.com/watch?v=306F-um2Ljw&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=10
 * @author Farida Fatali
 */

// Program to suggest an activity according to the air temperature.

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the degree of the weather? ");

        int degree = scanner.nextInt();

        if(degree <= 5){
            System.out.println("Ski will be a good idea!");
        } else if (degree <= 15){
            System.out.println("We can suggest theater!");
        } else if (degree <= 25) {
            System.out.println("A barbecue event might be interesting!");
        } else if (degree > 25) {
            System.out.println("Swimming is the best activity for this weather!");
        }

    }
}