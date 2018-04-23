package Courses.Course_1.Opgave3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPerson {

    @Test
    public void getBodyMassIndex01() {
        Person testPerson = new Person("Test person", 1.85, 75);

        assertEquals(21.913805697589478, testPerson.getBodyMassIndex());
    }

    @Test
    public void getClassification01 () {
        Person testPerson = new Person("Test person", 1.85, 5);
        String expectedString = "Test person is underweight!";

        assertEquals(expectedString,testPerson.getClassification());
    }
    @Test
    public void getClassification02 () {
        Person testPerson = new Person("Test person", 1.85, 75);
        String expectedString = "Test person is normal weight!";

        assertEquals(expectedString,testPerson.getClassification());
    }

    @Test
    public void getClassification03 () {
        Person testPerson = new Person("Test person", 1.85, 90);
        String expectedString = "Test person is overweight!";

        assertEquals(expectedString,testPerson.getClassification());
    }

    @Test
    public void getClassification04 () {
        Person testPerson = new Person("Test person", 1.85, 200);
        String expectedString = "Test person is obese!";

        assertEquals(expectedString,testPerson.getClassification());
    }

}
