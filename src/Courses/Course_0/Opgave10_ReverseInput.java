package Courses.Course_0;

import java.util.Scanner;

public class Opgave10_ReverseInput {
    public static void main(String[] args) {
        System.out.println("Enter a string to be reversed and in UPPERCASE");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Your string was: " + input);

        StringBuilder build = new StringBuilder();
        build.append(input);
        String reversed = build.reverse().toString().toUpperCase();

        System.out.println("Reversed uppercase string is: " + reversed);

    }
}
