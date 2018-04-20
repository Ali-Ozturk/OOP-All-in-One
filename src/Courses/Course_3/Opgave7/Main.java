package Courses.Course_3.Opgave7;

public class Main {
    public static void main(String[] args) {

        point3d coord1 = new point3d(1,1,1);
        point2d coord2 = new point2d(2,2);
        point3dcolor coord3 = new point3dcolor(3,3,3,"Red");

        System.out.println("Coordinates for coord1 = (" + coord1.getX() + "," + coord1.getY() + "," + coord1.getY() + ")");
        System.out.println("Coordinates for coord2 = (" + coord2.getX() + "," + coord2.getY() + ")");
    }
}
