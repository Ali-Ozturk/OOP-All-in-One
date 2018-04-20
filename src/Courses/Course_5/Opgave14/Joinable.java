package Courses.Course_5.Opgave14;

/*
Problem 14. Write a functional interface Joinable with a method join that takes two
        string arguments and returns a string. Write a method reduce3 that takes three strings
        and a Joinable and joins the strings from left to right. For example
*/

@FunctionalInterface
public interface Joinable {

    String join(String a, String b);
}
