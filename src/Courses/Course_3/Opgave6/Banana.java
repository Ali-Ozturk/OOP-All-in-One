package Courses.Course_3.Opgave6;

public class Banana implements Fruit {
    @Override
    public int getCalories() {
        return 88;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getTaste() {
        return "veri gut";
    }

    @Override
    public String getType() {
        return "Banana";
    }
}
