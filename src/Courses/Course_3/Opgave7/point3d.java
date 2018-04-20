package Courses.Course_3.Opgave7;

public class point3d extends point2d {
    private int z;

    public point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
