package Courses.Course_0;

import java.util.Random;
import java.util.Scanner;

public class Opgave9_GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        System.out.println("Enter a number and try to guess the number from 0-100");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNum){
            System.out.println("Congratulations! You were right!");
        } else {
            System.out.println("Sorry you were not right. The number was: " + randomNum);
        }
    }
}
