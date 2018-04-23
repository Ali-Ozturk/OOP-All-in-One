package Courses.Course_1.Opgave3;

public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBodyMassIndex(){
        return (this.weight / Math.pow(this.height, 2));
    }

    public String getClassification(){
        double BMI = this.getBodyMassIndex();
        if (BMI < 15.5) {
            return (this.name + " is underweight!");
        } else if (18.5 <= BMI && BMI <= 24.9){
            return (this.name + " is normal weight!");
        } else if (25 <= BMI && BMI <= 29.9){
            return (this.name + " is overweight!");
        } else {
            return (this.name + " is obese!");
        }
    }
}
