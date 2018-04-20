package Courses.Course_0;

import java.util.Scanner;

public class Opgave7_ConvertTemp {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Fahrenheit to Celcius.");
        System.out.println("Enter 2 for Celcius to Fahrenheit.");

        Scanner scanner = new Scanner(System.in);
        int request = scanner.nextInt();

        if (request == 1){
            System.out.println("Enter an amount of Fahrenheit to be converted.");
            double fahr = scanner.nextDouble();
            double convcels = (fahr - 32) * 0.5556;
            System.out.println(fahr + " in Celcius is: " + convcels);
        } else if (request == 2) {
            System.out.println("Enter an amount of Celcius to be converted.");
            double cels = scanner.nextDouble();
            double convfehr = cels * 1.8 + 32;
            System.out.println(cels + " in Fahrenheit is: " + convfehr);
        }

    }
}
