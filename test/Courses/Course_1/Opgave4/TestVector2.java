package Courses.Course_1.Opgave4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVector2 {

    @Test
    public void constructor01 () {
        Vector2 actualVector = new Vector2();
        assertEquals(new Vector2(0,0).getX(), actualVector.getX());
        assertEquals(new Vector2(0,0).getY(), actualVector.getY());
    }

    @Test
    public void add01() {
        Vector2 firstVector = new Vector2(5,10);
        Vector2 secondVector = new Vector2(15,20);

        Vector2 expectedVector = new Vector2(20,30);

        assertEquals(expectedVector.getX(), firstVector.add(secondVector).getX());
        assertEquals(expectedVector.getY(), firstVector.add(secondVector).getY());
    }

    @Test
    public void substract() {
        Vector2 firstVector = new Vector2(15,20);
        Vector2 secondVector = new Vector2(5,10);

        Vector2 expectedVector = new Vector2(10,10);

        assertEquals(expectedVector.getX(), firstVector.substract(secondVector).getX());
        assertEquals(expectedVector.getY(), firstVector.substract(secondVector).getY());
    }

    @Test
    public void dotProduct() {
        Vector2 firstVector = new Vector2(15,20);
        Vector2 secondVector = new Vector2(5,10);

        assertEquals(275, firstVector.dotProduct(secondVector));
    }
}
