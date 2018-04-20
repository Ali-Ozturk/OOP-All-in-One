package Courses.Course_0;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Opgave8_ConvertTime {
    public static void main(String[] args) {
        System.out.println("Please enter nanoseconds to be converted:");
        Scanner scanner = new Scanner(System.in);
        long nanosec = scanner.nextLong();
        long days, hours, minutes, seconds;

        days = TimeUnit.DAYS.convert(nanosec, TimeUnit.NANOSECONDS);
        hours = TimeUnit.HOURS.convert(nanosec, TimeUnit.NANOSECONDS);
        minutes = TimeUnit.MINUTES.convert(nanosec, TimeUnit.NANOSECONDS);
        seconds = TimeUnit.SECONDS.convert(nanosec, TimeUnit.NANOSECONDS);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);



    }
}
