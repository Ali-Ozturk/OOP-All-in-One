package Courses.Course_3.Opgave6;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit banana = new Banana();


        System.out.println("An " + apple.getType() + " has : " + apple.getCalories() + " calories");
        System.out.println("An " + banana.getType() + " has : " + banana.getCalories() + " calories");
    }
}