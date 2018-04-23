package Courses.Course_1.Opgave4;

public class Vector2 {
    private double x;
    private double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vector2 add(Vector2 otherVector){
        return (new Vector2(this.x + otherVector.x, this.y + otherVector.y));
    }

    public Vector2 substract(Vector2 otherVector){
        return (new Vector2(this.x - otherVector.x, this.y - otherVector.y));
    }

    public double dotProduct(Vector2 otherVector){
        return (this.x * otherVector.x + this.y * otherVector.y);
    }
}
