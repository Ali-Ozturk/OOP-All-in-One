package Courses.Course_3.Opgave7;

public class point3dcolor extends point3d {
    private String color;

    public point3dcolor(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
