package Courses.Course_5.Opgave3;

/*Problem 3. Write a generic method select with a type parameter T that takes two arguments x and y of
type T and a boolean b, and returns x if b is true and y otherwise*/

public class Problem3 {

    <T> T select(T x, T y, boolean b){
        if (b){
            return x;
        } else {
            return y;
        }
    }
}
