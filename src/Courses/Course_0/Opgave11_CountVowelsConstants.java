package Courses.Course_0;

public class Opgave11_CountVowelsConstants {
    public static void main(String[] args) {
        String input = "This is a string with some consonants and vowels.";

        System.out.println("There is [ " + Count_Vowels(input) + " ] vowels.");
        System.out.println("There is [ " + Count_Cons(input) + " ] consonants.");

    }

    static private int Count_Vowels(String a) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }

    static private int Count_Cons(String a) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == 't') {
                counter++;
            }
        }
        return counter;
    }
}
