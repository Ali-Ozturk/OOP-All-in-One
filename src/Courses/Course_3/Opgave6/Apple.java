package Courses.Course_3.Opgave6;

public class Apple implements Fruit {
    @Override
    public int getCalories() {
        return 52;
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getTaste() {
        return "mhmmm";
    }

    @Override
    public String getType() {
        return "Apple";
    }
}
