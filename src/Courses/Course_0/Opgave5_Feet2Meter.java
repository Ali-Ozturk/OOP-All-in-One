package Courses.Course_0;

import java.util.Scanner;

public class Opgave5_Feet2Meter {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    double length = scanner.nextDouble();

    double meters = length * 0.3048;

    System.out.println(length + " feets is " + meters + " meters!");
    }
}
